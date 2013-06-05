tree grammar LittleNicCodeGen;

options {
  language = Java;
  tokenVocab = LittleNic;
  ASTLabelType = CommonTree;
}

scope Scope {
	HashMap<String, String> scopeMap;
}

@header {
	import java.util.ArrayList;
	import java.util.HashMap;
}

@members {

	private int i = 0;
	
	public HashMap<String, String> globals;
	public boolean inMethod = false;
	
	public boolean inDynamicScope(String id) {
   		for (int s = $Scope.size() - 1; s >= 0; s--) {
    		if ($Scope[s]::scopeMap.containsKey(id)) {
    			return true;
    		}
    	}
    	return false;
    }
	
	private String indent() {
		String indentation = "";
		for (int m = 0; m < i; m++) {
			indentation = indentation.concat("\t");
		}
		return indentation;
	}
	
}

prog [String className] returns [String out]
scope Scope;
@init {
	$Scope::scopeMap = globals;
	out = "";
}
@after {
	$Scope::scopeMap.clear();
}
	:	^(ID declList? stmtList?)
		{
		
			String decls = "";
			if ($declList.out != null) {
				decls = $declList.out;
			}
		
			i++;
			$out =
				"\npublic class " + className + " {\n\n" +
				indent() + decls + "\n" +
				indent() + "public static void main(String[] args) {\n";
			i++;
			$out =
				$out.concat(
					indent() + $stmtList.out
				);
			i--;
			$out =
				$out.concat(
					"\n\n" + indent() + "}"
				);
			i--;
			$out =
				$out.concat(
					"\n\n}"
				);
		}
	;
	
declList returns [String out]
@init {
	ArrayList<String> list = new ArrayList<String>();
	out = "";
}
	:	decl[list]+
		{
			i++;
			$out = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				$out = $out.concat("\n" + indent() + list.get(i));
			}
			i--;
		}
	;
	
decl [ArrayList<String> list]
	:	varDecl[list]
		{list.add($varDecl.out);}
	|	procDecl
		{list.add($procDecl.out);}
	|	funcDecl
		{list.add($funcDecl.out);}
	;

varDeclList returns [String out]
@init {
	ArrayList<String> list = new ArrayList<String>();
	out = "";
}
	:	varDecl[list]+
		{
			if (!list.isEmpty()) {
				i++;
				$out = list.get(0);
				for (int i = 1; i < list.size(); i++) {
					$out = $out.concat("\n" + indent() + indent() + list.get(i));
				}
				i--;
			}
		}
	;

varDecl [ArrayList<String> list] returns [String out]
@init {
	out = "";
}
	:	^(VARDECL TYPE ID)
		{
			String type = "";
			if ($TYPE.text.equals("COUNT")) {
				type = "int";
			} else if ($TYPE.text.equals("TRUTH")) {
				type = "boolean";
			}
			
			if (inMethod) {
				if (inDynamicScope($ID.text)) { // if already defined
					// if local
					if ($Scope::scopeMap.containsKey($ID.text)) {
						// and not same type
						if (!$Scope::scopeMap.get($ID.text).equals($TYPE.text)) {
							list.add(type + " _" + $ID.text + ";");
						} else {
						
						}
					} else { // global
						list.add(type + " local_" + $ID.text + ";");
					}
				} else {
					list.add(type + " _" + $ID.text + ";");
				}
			} else {
				$out = "static " + type + " _" + $ID.text + ";";
			}
			
		}
	;

procDecl returns [String out]
scope Scope;
@init {
	inMethod = true;
	$Scope::scopeMap = new HashMap<String, String>();
	out = "";
}
@after {
	inMethod = false;
	$Scope::scopeMap.clear();
}
	:	^(PROC ID paramList? varDeclList? stmtList?)
		{
		
			String params = "";
			if ($paramList.out != null) {
				params = $paramList.out;
			}
			
			String varDecls = "";
			if ($varDeclList.out != null) {
				varDecls = $varDeclList.out;
			}
			
			String stmts = "";
			if ($stmtList.out != null) {
				stmts = $stmtList.out;
			}
		
			i++;
			$out =
				"\n" + indent() + "static void _" + $ID.text +
				"(" + params + ") {\n\n";
			i++;
			$out =
				$out.concat(
					indent() + varDecls + "\n\n" +
					indent() + stmts + "\n\n"
				);
			i--;
			$out =
				$out.concat(
					indent() + "}\n"
				);
			i--;
		}
	;
	
funcDecl returns [String out]
scope Scope;
@init {
	inMethod = true;
	$Scope::scopeMap = new HashMap<String, String>();
	out = "";
}
@after {
	inMethod = false;
	$Scope::scopeMap.clear();
}
	:	^(FUNC TYPE ID paramList? varDeclList? stmtList?)
		{
		
			String type = "";
			if ($TYPE.text.equals("COUNT")) {
				type = "int";
			} else if ($TYPE.text.equals("TRUTH")) {
				type = "boolean";
			}
			
			String params = "";
			if ($paramList.out != null) {
				params = $paramList.out;
			}
			
			String varDecls = "";
			if ($varDeclList.out != null) {
				varDecls = $varDeclList.out;
			}
			
			String stmts = "";
			if ($stmtList.out != null) {
				stmts = $stmtList.out;
			}
			
			i++;
			$out =
				"\n" + indent() + "static " +  type + " _" + $ID.text +
				"(" + params + ") {\n\n";
			i++;
			$out =
				$out.concat(
					indent() + varDecls + "\n" +
					indent() + type + " _" + $ID.text + ";\n" +
					indent() + stmts + "\n\n" +
					indent() + "return _" + $ID.text + ";\n"
				);
			i--;
			$out =
				$out.concat(
					indent() + "}\n"
				);
			i--;
		}
	;

paramList returns [String out]
@init {
	ArrayList<String> list = new ArrayList<String>();
	out = "";
}
	:	param[list]+
		{
			if (!list.isEmpty()) {
				$out = list.get(0);
				for (int i = 1; i < list.size(); i++) {
					$out = $out.concat(", " + list.get(i));
				}
			}
		}
	;
	
param [ArrayList<String> list]
	:	^(PARAM TYPE ID)
		{
			String type = "";
			if ($TYPE.text.equals("COUNT")) {
				type = "int";
			} else if ($TYPE.text.equals("TRUTH")) {
				type = "boolean";
			}
			$Scope::scopeMap.put($ID.text, $TYPE.text);
			list.add(type + " _" + $ID.text);
		}
	;

stmtList returns [String out]
@init {
	ArrayList<String> list = new ArrayList<String>();
	out = "";
}
	:	stmt[true, list]+
		{
			if (!list.isEmpty()) {
				i+=3;
				$out = list.get(0);
				for (int i = 1; i < list.size(); i++) {
					$out = $out.concat("\n" + indent() + list.get(i));
				}
				i-=3;
			}
		}
	;

stmt [boolean inList, ArrayList<String> list] returns [String out]
@init {
	out = "";
}
	:	blockStmt
		{	
			$out = $blockStmt.out;
			if (inList) {
				list.add($out);
			}
		}
	|	assignStmt
		{
			$out = $assignStmt.out;
			if (inList) {
				list.add($out);
			}
		}
	|	condStmt
		{
			$out = $condStmt.out;
			if (inList) {
				list.add($out);
			}
		}
	|	whileStmt
		{
			$out = $whileStmt.out;
			if (inList) {
				list.add($out);
			}
		}
	|	callStmt
		{
			$out = $callStmt.out + ";";
			if (inList) {
				list.add($out);
			}
		}
	|	outStmt
		{
			$out = $outStmt.out;
			if (inList) {
				list.add($out);
			}
		}
	;
	
blockStmt returns [String out]
@init {
	out = "";
}
	:	^(BLOCK stmtList?)
		{$out = $stmtList.out;}
	;
	
assignStmt returns [String out]
@init {
	out = "";
}
	:	^(':=' ID expr[false, null])
		{$out = "_" + $ID.text + " = " + $expr.out + ";";}
	;
	
condStmt returns [String out]
@init {
	out = "";
}
	:	^('IF' expr[false, null] s1=stmt[false, null] s2=stmt[false, null])
		{
		
			String statement1 = "";
			if ($s1.out != null) {
				statement1 = $s1.out;
			}
			
			String statement2 = "";
			if ($s2.out != null) {
				//System.out.println($s2.out);
				statement2 = $s2.out;
			}
			
			i+=2;
			$out = "\n" + indent() + "if (" + $expr.out + ") {\n";
			i++;
			$out = $out.concat(indent() + statement1 + "\n");
			i--;
			$out = $out.concat(indent() + "} else {\n");
			i++;
			$out = $out.concat(indent() + statement2 + "\n");
			i--;
			$out = $out.concat(indent() +"}");
			i-=2;
			
		}
	;
	
whileStmt returns [String out]
@init {
	out = "";
}
	:	^('WHILE' expr[false, null] stmt[false, null])
		{
		
			String statement = "";
			if ($stmt.out != null) {
				statement = $stmt.out;
			}
			
			i+=2;
			$out = "\n" + indent() + "while (" + $expr.out + ") {\n";
			i++;
			$out = $out.concat(indent() + statement + "\n");
			i--;
			$out = $out.concat(indent() +"}");
			i-=2;
			
		}
	;
	
callStmt returns [String out]
@init {
	out = "";
}
	:	^(CALL ID argList?)
		{
			String args = "";
			if ($argList.out != null) {
				args = $argList.out;
			}
			
			$out = "_" + $ID.text + "(" + args + ")";
		}
	;
	
argList returns [String out]
@init {
	ArrayList<String> list = new ArrayList<String>();
	out = "";
}
	:	expr[true, list]+
		{
			if (!list.isEmpty()) {
				$out = list.get(0);
				for (int i = 1; i < list.size(); i++) {
					$out = $out.concat(", " + list.get(i));
				}
			}
		}
	;

outStmt returns [String out]
@init {
	out = "";
}
	:	^('OUTPUT' STRING)
		{
			i+=2;
			$out =
				"\n" + indent() +
				"System.out.print(\"" + $STRING.text + "\");";
			i-=2;
		}
	|	^('OUTPUT' ID)
		{
			i+=2;
			$out =
				"\n" + indent() +
				"System.out.print(_" + $ID.text + ");";
			i-=2;
		}
	;

expr [boolean inList, ArrayList<String> list] returns [String out]
@init {
	out = "";
}
	:	^('==' e1=expr[false, null] e2=expr[false, null])
		{
			$out = "(" + $e1.out + " == " + $e2.out + ")";
			if (inList) {
				list.add($out);
			}
		}
	|	^('!=' e1=expr[false, null] e2=expr[false, null])
		{
			$out = "(" + $e1.out + " != " + $e2.out + ")";
			if (inList) {
				list.add($out);
			}
		}
	|	^('<' e1=expr[false, null] e2=expr[false, null])
		{
			$out = "(" + $e1.out + " < " + $e2.out + ")";
			if (inList) {
				list.add($out);
			}
		}
	|	^('<=' e1=expr[false, null] e2=expr[false, null])
		{
			$out = "(" + $e1.out + " <= " + $e2.out + ")";
			if (inList) {
				list.add($out);
			}
		}
	|	^('>=' e1=expr[false, null] e2=expr[false, null])
		{
			$out = "(" + $e1.out + " >= " + $e2.out + ")";
			if (inList) {
				list.add($out);
			}
		}
	|	^('>' e1=expr[false, null] e2=expr[false, null])
		{
			$out = "(" + $e1.out + " > " + $e2.out + ")";
			if (inList) {
				list.add($out);
			}
		}
	|	^('+' e1=expr[false, null] e2=expr[false, null])
		{
			$out = "(" + $e1.out + " + " + $e2.out + ")";
			if (inList) {
				list.add($out);
			}
		}
	|	^('-' e1=expr[false, null] e2=expr[false, null])
		{
			$out = "(" + $e1.out + " - " + $e2.out + ")";
			if (inList) {
				list.add($out);
			}
		}
	|	^('*' e1=expr[false, null] e2=expr[false, null])
		{
			$out = "(" + $e1.out + " * " + $e2.out + ")";
			if (inList) {
				list.add($out);
			}
		}
	|	^(NEGATION e1=expr[false, null])
		{
			$out = "(-" + $e1.out + ")";
			if (inList) {
				list.add($out);
			}
		}
	|	ID
		{
			$out = "_" + $ID.text;
			if (inList) {
				list.add($out);
			}
		}
	|	INTEGER
		{
			$out = $INTEGER.text;
			if (inList) {
				list.add($out);
			}
		}
	|	BOOLEAN
		{
			String truth = "";
			if ($BOOLEAN.text.equals("T")) {
				truth = "true";
			} else if ($BOOLEAN.text.equals("F")) {
				truth = "false";
			}
			
			$out = truth;
			if (inList) {
				list.add($out);
			}
		}
	|	callStmt
		{
			$out = $callStmt.out;
			if (inList) {
				list.add($out);
			}
		}
	;
