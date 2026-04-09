lexer grammar EZLexer;

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

ASSING:':=' ;
EQ:'=' ; 
LT:'<' ;
PLUS:'+' ;
MINUS:'-' ;
MULT:'*' ;
DIV:'/ ' ;
LPAREN:'(' ;
RPAREN:')' ;
SEMI:';' ;

COMMENT:'{' ~[}]* '}' -> skip ;

fragment DIGIT : [0-9] ;
fragment LETTER : [a-zA-Z] ;

ID: LETTER+ ;
INT_VAL : DIGIT+ ;
REAL_VAL : DIGIT+ '.' DIGIT+ ;
STRING_VAL: '"' ~["]* '"' ;