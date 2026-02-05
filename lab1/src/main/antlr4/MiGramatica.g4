grammar MiGramatica;

@header {
package com.lab1compiladores;
}

// =======================
// Parser
// =======================

prog
    : (NEWLINE* (declaracion | expresion) NEWLINE*)* EOF
    ;

declaracion
    : binDecl
    | b4Decl
    | hexDecl
    ;

binDecl : BIN_ID ID '=' BINARIO ;
b4Decl  : B4_ID  ID '=' BASE4 ;
hexDecl : HEX_ID ID '=' HEX  ;

expresion
    : termino expresionP
    ;

expresionP
    : (PLUS | MINUS) termino expresionP
    |
    ;

termino
    : factor terminoP
    ;

terminoP
    : (MUL | DIV) factor terminoP
    |
    ;

factor
    : ID
    | numero
    | LPAREN expresion RPAREN
    ;

numero
    : BINARIO
    | BASE4
    | HEX
    ;

// =======================
// Lexer
// =======================

BIN_ID : 'BIN' ;
B4_ID  : 'B4' ;
HEX_ID : 'HEX' ;

PLUS   : '+' ;
MINUS  : '-' ;
MUL    : '*' ;
DIV    : '/' ;
LPAREN : '(' ;
RPAREN : ')' ;

BINARIO : [01]+ ;
BASE4   : [0-3]+ ;
HEX     : [0-9A-Fa-f]+ ;

ID : [a-zA-Z][a-zA-Z0-9]* ;

NEWLINE : [\r\n]+ ;
WS      : [ \t]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;
