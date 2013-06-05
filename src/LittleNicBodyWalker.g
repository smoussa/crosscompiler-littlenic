tree grammar LittleNicBodyWalker;

options {
  language = Java;
  tokenVocab = LittleNic;
  ASTLabelType = CommonTree;
}

scope Scope {
	HashMap<String, String> scopeMap;
}

@header {
	import java.util.Map;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.ArrayList;
	import java.util.Collections;
}

@members {
	
    public ErrorReporter err;
    
	public HashMap<String, String> globals = new HashMap<String, String>();
	public HashMap<String, HashMap<String, String>> methods
				= new HashMap<String, HashMap<String, String>>();
	
	public boolean inMethod = false;
	public String currentMethod = "";
		
    // if variable in scope
    public boolean inScope(String id) {
   		if (globals.containsKey(id)) {
   			return true;
   		}
    	return false;
    }
    
    public boolean inDynamicScope(String id) {
   		for (int s = $Scope.size() - 1; s >= 0; s--) {
    		if ($Scope[s]::scopeMap.containsKey(id)) {
    			return true;
    		}
    	}
    	return false;
    }
    
    // if two entities have the same type
    public boolean sameType(String type1, String type2) {
    	return type1.equals(type2);
    }
    
    // if two entities have the same type (only for COUNTs)
    public void checkTypes(int line, String name1, String type1,
    						String name2, String type2) {
    	if (!(type1.equals("COUNT") && type2.equals("COUNT"))) {
    		err.reportTypeError(line, name1, type1, name2, type2);
			throw new RuntimeException();
    	}
    }
    
}

prog
scope Scope;
@init {
	$Scope::scopeMap = globals;
}
	:	^(ID declList? stmtList?)
	;
	
declList
	:	decl+
	;
	
decl
	:	varDecl
	|	procDecl
	|	funcDecl
	;

varDeclList
	:	varDecl+
	;

varDecl
	:	^(VARDECL TYPE ID)
		{
			if (!$Scope::scopeMap.containsKey($ID.text)) {
				$Scope::scopeMap.put($ID.text, $TYPE.text);
			}
		}
	;

procDecl
scope Scope;
@init {
	inMethod = true;
	$Scope::scopeMap = new HashMap<String, String>();
}
@after {
	inMethod = false;
	$Scope::scopeMap.clear();
}
	:	^(PROC ID {currentMethod = $ID.text;} paramList? varDeclList? stmtList?)
	;
	
funcDecl
scope Scope;
@init {
	inMethod = true;
	$Scope::scopeMap = new HashMap<String, String>();
}
@after {
	inMethod = false;
	$Scope::scopeMap.clear();
}
	:	^(FUNC TYPE ID {currentMethod = $ID.text;} paramList? varDeclList? stmtList?)
	;

paramList
	:	param+
	;
	
param
	:	^(PARAM TYPE ID)
		{
			$Scope::scopeMap.put($ID.text, $TYPE.text);
		}
	;

stmtList
	:	stmt+
	;

stmt
	:	blockStmt
	|	assignStmt
	|	condStmt
	|	whileStmt
	|	callStmt[false]
	|	outStmt
	;
	
blockStmt
	:	^(BLOCK stmtList?)
	;
	
assignStmt
	:	^(op=':=' ID expr[false, null])
		{
			if ($expr.type == null) { // error if procedure
				err.reportUndeclaredError($ID.line, $op.pos, $expr.text);
				throw new RuntimeException();
			}
			
			if (!inMethod) {
				if (inScope($ID.text) && !methods.containsKey($ID.text)) { // if defined
					
					String type = globals.get($ID.text);
					
					if (!sameType(type , $expr.type)) {
						err.reportTypeError($ID.line, $ID.text,
							type, $expr.text, $expr.type);
						throw new RuntimeException();
					} else if (type == null) { // no return type
						// correct types so procedure then error
						err.reportUndeclaredError($ID.line, $ID.pos, $ID.text);
						throw new RuntimeException();
					}
					
				} else {
					err.reportUndeclaredError($ID.line, $ID.pos, $ID.text);
					throw new RuntimeException();
				}
			}
		}
	;
	
condStmt
	:	^(op='IF' expr[false, null] s1=stmt s2=stmt)
		{
			if (!$expr.type.equals("TRUTH")) {
				err.reportTypeError($op.line, $expr.text,
					$expr.type, "Expected", "TRUTH");
				throw new RuntimeException();
			}
		}
	;
	
whileStmt
	:	^(op='WHILE' expr[false, null] stmt)
		{
			if (!$expr.type.equals("TRUTH")) {
				err.reportTypeError($op.line, $expr.text,
					$expr.type, "Expected", "TRUTH");
				throw new RuntimeException();
			}
		}
	;

callStmt [boolean isAssign] returns [String type, String text]
@init {
	ArrayList<Pair> args = new ArrayList<Pair>();
}
	:	^(CALL ID argList[args]?)
		{
			Collections.reverse(args);
			
			if (methods.containsKey($ID.text)) { // if method exists
			
				if (!isAssign && (globals.get($ID.text) != null)) {
					err.reportUndeclaredError($ID.line, $ID.pos, $ID.text);
					throw new RuntimeException();
				}
			
				$text = $ID.text;
				$type = globals.get($text);
			
				// check argument types
				int count = 0;
				Iterator itr = methods.get($text).entrySet().iterator();
				
				// for each method parameter
			    while (itr.hasNext() && count < args.size()) {
			        Map.Entry pair = (Map.Entry) itr.next();
			        String callArgType = args.get(count).getType();
			        
			        if (!callArgType.equals(pair.getValue())) {
						err.reportTypeError($CALL.line,
							(String) pair.getKey(),
							(String) pair.getValue(),
							args.get(count).getName(),
							callArgType);
						throw new RuntimeException();
					}
			        
			        count++;
			    }
			    
			    // check if number of arguments match
				if (count != args.size() || count < methods.get($text).size()) {
				
					// print parameter types
					String params = "[";
					Iterator itr2 = methods.get($text).entrySet().iterator();
					int c = 0;
					while (itr2.hasNext()) {
						if (c > 0) {
							params = params.concat(", ");
						}
						Map.Entry pair = (Map.Entry) itr2.next();
						params = params.concat((String) pair.getValue());
						c++;
					}
					params += "]";
					
					// print argument types
					String argmts = "[";
					for (c = 0; c < args.size(); c++) {
						if (c > 0) {
							argmts = argmts.concat(", ");
						}
						argmts = argmts.concat(args.get(c).getType());
					}
					argmts += "]";
					
					err.reportTypeError($CALL.line, "Expected",
						params,	"Given", argmts);
					throw new RuntimeException();
				}
				
			} else {
				err.reportUndeclaredError($ID.line, $ID.pos, $ID.text);
				throw new RuntimeException();
			}
		}
	;

argList [ArrayList<Pair> args]
	:	expr[true, args]+
	;

outStmt
	:	^('OUTPUT' STRING)
	|	^('OUTPUT' ID)
		{
			if (!inDynamicScope($ID.text)) {
				err.reportUndeclaredError($ID.line, $ID.pos, $ID.text);
				throw new RuntimeException();
			}
		}
	;

expr [boolean isArg, ArrayList<Pair> args]
	returns [String text, String type]
	:	^(op='==' e1=expr[false, null] e2=expr[false, null])
		{
			$type = "TRUTH";
			checkTypes($op.line, $e1.text, $e1.type, $e2.text, $e2.type);
			$text = $e1.text + " == " + $e2.text;
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	|	^(op='!=' e1=expr[false, null] e2=expr[false, null])
		{
			$type = "TRUTH";
			checkTypes($op.line, $e1.text, $e1.type, $e2.text, $e2.type);
			$text = $e1.text + " != " + $e2.text;
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	|	^(op='<' e1=expr[false, null] e2=expr[false, null])
		{
			$type = "TRUTH";
			checkTypes($op.line, $e1.text, $e1.type, $e2.text, $e2.type);
			$text = $e1.text + " < " + $e2.text;
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	|	^(op='<=' e1=expr[false, null] e2=expr[false, null])
		{
			$type = "TRUTH";
			checkTypes($op.line, $e1.text, $e1.type, $e2.text, $e2.type);
			$text = $e1.text + " <= " + $e2.text;
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	|	^(op='>=' e1=expr[false, null] e2=expr[false, null])
		{
			$type = "TRUTH";
			checkTypes($op.line, $e1.text, $e1.type, $e2.text, $e2.type);
			$text = $e1.text + " >= " + $e2.text;
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	|	^(op='>' e1=expr[false, null] e2=expr[false, null])
		{
			$type = "TRUTH";
			checkTypes($op.line, $e1.text, $e1.type, $e2.text, $e2.type);
			$text = $e1.text + " > " + $e2.text;
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	|	^(op='+' e1=expr[false, null] e2=expr[false, null])
		{
			$type = "COUNT";
			checkTypes($op.line, $e1.text, $e1.type, $e2.text, $e2.type);
			$text = $e1.text + " + " + $e2.text;
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	|	^(op='-' e1=expr[false, null] e2=expr[false, null])
		{
			$type = "COUNT";
			checkTypes($op.line, $e1.text, $e1.type, $e2.text, $e2.type);
			$text = $e1.text + " - " + $e2.text;
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	|	^(op='*' e1=expr[false, null] e2=expr[false, null])
		{
			$type = "COUNT";
			checkTypes($op.line, $e1.text, $e1.type, $e2.text, $e2.type);
			$text = $e1.text + " * " + $e2.text;
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	|	^(NEGATION e1=expr[false, null])
		{
			String eType = $e1.type;
			if (eType.equals("COUNT")) {
				$type = "COUNT";
			}
			$text = "-" + $e1.text;
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	|	ID
		{
			String id = $ID.text;
			$text = id;
			if (!inMethod) {
				if (inScope(id)) {
					$type = globals.get(id);
				} else {
					err.reportUndeclaredError($ID.line, $ID.pos, $ID.text);
					throw new RuntimeException();
				}
			} else { // in method
				if (inDynamicScope(id)) {
					$type = $Scope::scopeMap.get(id);
				} else {
					err.reportUndeclaredError($ID.line, $ID.pos, $ID.text);
					throw new RuntimeException();
				}
			}
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	|	INTEGER
		{
			$type = "COUNT";
			$text = $INTEGER.text;
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	|	BOOLEAN
		{
			$type = "TRUTH";
			$text = $BOOLEAN.text;
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	|	callStmt[true]
		{
			$type = $callStmt.type;
			$text = $callStmt.text;
			if (isArg) {
				Pair p = new Pair();
				p.put($text, $type);
				args.add(p);
			}
		}
	;
