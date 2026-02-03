grammar Expr;

prog
    : (numero NEWLINE)* EOF
    ;

numero
    : BINARIO
    | BASE4
    | HEX
    ;

BINARIO
    : [01]+;

BASE4
    : [0-3]* [2-3] [0-3]*;

HEX
    : [0-9A-Fa-f]+;

NEWLINE
    : [\r\n]+;

WS
    : [ \t]+ -> skip;