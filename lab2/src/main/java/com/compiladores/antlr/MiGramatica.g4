grammar Expr;

@header {
package com.compiladores.antlr;
}

options {
    visitor = true;
}

prog
    : expr EOF
    ;

expr
    : expr 'and' factor   # And
    | factor              # FactorExpr
    ;

factor
    : IDENTIFICADOR       # Id
    | 'not' '(' expr ')'  # NotExpr
    ;

IDENTIFICADOR : [a-zA-Z]+ ;
WS : [ \t\r\n]+ -> skip ;