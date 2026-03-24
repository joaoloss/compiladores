lexer grammar gramatica_ezlang;

WS : [ \t\n]+ -> skip ;

BEGIN:'begin' ;
BOOL:'bool' ;
ELSE:'else' ;
END:'end' ;
FALSE:'false' ;
IF:'if' ;
INT:'int' ;
PROGRAM:'program' ;
READ:'read' ;
REAL:'real' ;
REPEAT:'repeat' ;
STRING:'string' ;
THEN:'then' ;
TRUE:'true' ;
UNTIL:'until' ;
VAR:'var' ;
WRITE:'write' ;

SPECIAL_ASSING:':=' ;
ASSIN:'= ' ; 
LESS:'<' ;
PLUS:'+' ;
MINUS:'-' ;
MULT:'*' ;
DIV:'/ ' ;
LPAREN:'(' ;
RPAREN:')' ;
SEMI:';' ;

COMMENT:'{' ~[}]* '}' ;

fragment DIGIT : [0-9] ;
fragment LETTER : [a-zA-Z] ;

ID: LETTER+ ;
POS_INT : DIGIT+ ;
NEG_INT : '-' DIGIT+;
POS_REAL : DIGIT+ '.' DIGIT+ ;
NEG_REAL : '-' DIGIT+ '.' DIGIT+ ;
STRING_LITERAL: '"' ~["]* '"' ;