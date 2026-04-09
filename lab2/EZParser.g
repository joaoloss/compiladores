parser grammar EZParser;

options {
  tokenVocab=EZLexer;
}

program:
    PROGRAM ID SEMI vars_sect stmt_sect
    ;

vars_sect:
    VAR var_decl*
    ;

var_decl:
    type_spec ID SEMI
    ;

type_spec:
    BOOL
    | INT
    | REAL
    | STRING
    ;

stmt_sect:
    BEGIN stmt+ END
    ;

stmt:
    assign_stmt
    | if_else_stmt
    | if_stmt
    | repeat_stmt
    | read_stmt
    | write_stmt
    ;

assign_stmt:
    ID ASSING expr SEMI
    ;

if_else_stmt:
    IF expr THEN stmt+ ELSE stmt+ END
    ;

if_stmt:
    IF expr THEN stmt+ END
    ;

repeat_stmt:
    REPEAT stmt+ UNTIL expr
    ;

read_stmt:
    READ ID SEMI
    ;

write_stmt:
    WRITE expr SEMI
    ;

// A ordem das regras de expressão é importante para garantir a precedência correta dos operadores.
expr:
    expr high_op expr
    | expr op expr
    | LPAREN expr RPAREN
    | TRUE
    | FALSE
    | INT_VAL
    | REAL_VAL
    | STRING_VAL
    | ID
    ;

// Operadores com alta precedência
high_op:
    MULT
    | DIV
    ;

op:
    LT
    | EQ
    | PLUS
    | MINUS
    ;