tree grammar LittleNicGlobalWalker;

options {
  language = Java;
  tokenVocab = LittleNic;
  ASTLabelType = CommonTree;
}

@header {
	import java.util.ArrayList;
	import java.util.HashMap;
}

@members {
	
    public ErrorReporter err;
    
    public ArrayList<String> names = new ArrayList<String>();
    
	public HashMap<String, String> globals = new HashMap<String, String>();
	public HashMap<String, HashMap<String, String>> methods
				= new HashMap<String, HashMap<String, String>>();
				
	public boolean inMethod = false;
	
	public boolean isDefined(String id) {
		for (String name : names) {
			if (name.equals(id)) {
				return true;
			}
		}
		return false;
	}
	
}

prog
	:	^(ID {names.add($ID.text); globals.put($ID.text, null);} declList? stmtList?)
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
			if (!inMethod) {
				if (!isDefined($ID.text)) {
					names.add($ID.text);
					globals.put($ID.text, $TYPE.text);
				} else {
					err.reportNameError($ID.line, $ID.pos, $ID.text);
					throw new RuntimeException();
				}
			}
		}
	;

procDecl
@init {
	HashMap<String, String> params = new HashMap<String, String>();
	inMethod = true;
}
@after {
	inMethod = false;
}
	:	^(PROC ID paramList[params]? varDeclList? stmtList?)
		{
			if (!isDefined($ID.text)) {
				names.add($ID.text);
				globals.put($ID.text, null);
				methods.put($ID.text, params);
			} else {
				err.reportNameError($ID.line, $ID.pos, $ID.text);
				throw new RuntimeException();
			}
		}
	;
	
funcDecl
@init {
	HashMap<String, String> params = new HashMap<String, String>();
	inMethod = true;
}
@after {
	inMethod = false;
}
	:	^(FUNC TYPE ID paramList[params]? varDeclList? stmtList?)
		{
			if (!isDefined($ID.text)) {
				names.add($ID.text);
				globals.put($ID.text, $TYPE.text);
				methods.put($ID.text, params);
			} else {
				err.reportNameError($ID.line, $ID.pos, $ID.text);
				throw new RuntimeException();
			}
		}
	;

paramList [HashMap<String, String> params]
	:	param[params]+
	;
	
param [HashMap<String, String> params]
	:	^(PARAM TYPE ID)
		{
			if (!params.containsKey($ID.text)) {
				params.put($ID.text, $TYPE.text);
			} else {
				err.reportNameError($ID.line, $ID.pos, $ID.text);
				throw new RuntimeException();
			}
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
	|	callStmt
	|	outStmt
	;
	
blockStmt
	:	^(BLOCK stmtList?)
	;
	
assignStmt
	:	^(':=' ID expr)
	;
	
condStmt
	:	^(op='IF' expr s1=stmt s2=stmt)
	;
	
whileStmt
	:	^(op='WHILE' expr stmt)
	;

callStmt
	:	^(CALL ID argList?)
	;

argList
	:	expr+
	;

outStmt
	:	^('OUTPUT' STRING)
	|	^('OUTPUT' ID)
	;

expr
	:	^(op='==' e1=expr e2=expr)
	|	^(op='!=' e1=expr e2=expr)
	|	^(op='<' e1=expr e2=expr)
	|	^(op='<=' e1=expr e2=expr)
	|	^(op='>=' e1=expr e2=expr)
	|	^(op='>' e1=expr e2=expr)
	|	^(op='+' e1=expr e2=expr)
	|	^(op='-' e1=expr e2=expr)
	|	^(op='*' e1=expr e2=expr)
	|	^(NEGATION e1=expr)
	|	ID
	|	INTEGER
	|	BOOLEAN
	|	callStmt
	;
