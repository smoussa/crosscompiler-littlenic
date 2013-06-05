grammar LittleNic;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
}

tokens {
	DECL;
	VARDECL;
	PARAM;
	STMT;
	BLOCK;
	CALL;
	PROC;
	FUNC;
	NEGATION;
}

@members {
    public ErrorReporter err;
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
      String msg = getErrorMessage(e, tokenNames);
	  err.reportSyntaxError(e.line, e.charPositionInLine, msg);
    }
}

@lexer::members {
    public ErrorReporter err;
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String msg = getErrorMessage(e, tokenNames);
        err.reportSyntaxError(e.line, e.charPositionInLine, msg);
    }
}

// program declaration
prog
	:	'PROGRAM' ID ';'
		declList?
		'BEGIN'
		stmtList?
		'END' ';'
		EOF
		-> ^(ID declList? stmtList?)
	;

// declarative statements
declList
	:	decl (';' decl)*
		-> decl+
	;
	
decl
	:	varDecl
	|	procDecl
	|	funcDecl
	;

varDeclList
	:	varDecl (';' varDecl)*
		-> varDecl+
	;

varDecl
	:	'VAR' ID ':' TYPE
		-> ^(VARDECL TYPE ID)
	;

procDecl
	:	'PROCEDURE' ID '(' paramList? ')' ':='
		varDeclList?
		'BEGIN'
		stmtList?
		'END'
		-> ^(PROC ID paramList? varDeclList? stmtList?)
	;
	
funcDecl
	:	'FUNCTION' ID '(' paramList? ')' ':' TYPE ':='
		varDeclList?
		'BEGIN'
		stmtList?
		'END'
		-> ^(FUNC TYPE ID paramList? varDeclList? stmtList?)
	;

// function and procedure parameters
paramList
	:	param (',' param)*
		-> param+
	;
	
param
	:	ID ':' TYPE
		-> ^(PARAM TYPE ID)
	;

// standard statements
stmtList
	:	stmt (';' stmt)*
		-> stmt+
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
	:	'BEGIN' stmtList? 'END'
		-> ^(BLOCK stmtList?)
	;
	
assignStmt
	:	ID ':=' expr
		-> ^(':=' ID expr)
	;
	
condStmt
	:	'IF' expr 'THEN' s1=stmt 'ELSE' s2=stmt
		-> ^('IF' expr $s1 $s2)
	;
	
whileStmt
	:	'WHILE' expr 'DO' stmt
		-> ^('WHILE' expr stmt)
	;
	
callStmt
	:	ID '(' argList? ')'
		-> ^(CALL ID argList?)
	;
	
argList
	:	expr (',' expr)*
		-> expr+
	;

outStmt
	:	'OUTPUT' STRING -> ^('OUTPUT' STRING)
	|	'OUTPUT' ID -> ^('OUTPUT' ID)
	;

// expressions
	
term
	:	('+'! | negation^)* INTEGER
	;
	
negation
	:	'-' -> NEGATION
	;
	
unary
	:	'(' expr ')' -> expr
	|	callStmt
	|	ID
	|	term
	;

mult
	:	unary ('*'^ unary)*
	;
	
add
	:	mult (('+'^ | '-'^) mult)*
	;
	
expr
	:	add (('=='^ | '!='^ | '<'^ | '<='^ | '>='^ | '>'^) add)*
	|	BOOLEAN
	;

// lexer rules
INTEGER : DIGIT+;
BOOLEAN : 'T' | 'F';
TYPE : 'TRUTH' | 'COUNT';
ID : LETTER (LETTER | DIGIT)*;
STRING
	:	'"'
		{StringBuilder b = new StringBuilder();}
		(c = ~('"' | '\r' | '\n') {b.appendCodePoint($c);} )*
		'"'
		{setText(b.toString());}
	;
COMMENT : '/*' .* '*/' {$channel = HIDDEN;};
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};

// fragment helper rules
fragment DIGIT : '0'..'9';
fragment LETTER : ('a'..'z' | 'A'..'Z' | '_');
