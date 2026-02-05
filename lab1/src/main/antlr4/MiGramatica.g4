grammar MiGramatica;

@header {
package com.lab1compiladores;
}

// =======================
// Parser
// =======================

prog
    : (declaracion NEWLINE)* EOF
    ;

declaracion
    : binDecl
    | b4Decl
    | hexDecl
    ;

binDecl
    : BIN_ID '=' BINARIO
    ;

b4Decl
    : B4_ID '=' BASE4
    ;

hexDecl
    : HEX_ID '=' HEX
    ;

// =======================
// Lexer
// =======================

BIN_ID : 'BIN' ;
B4_ID  : 'B4' ;
HEX_ID : 'HEX' ;

BINARIO : [01]+ ;
BASE4   : [0-3]+ ;
HEX     : [0-9A-Fa-f]+ ;

NEWLINE : [\r\n]+ ;
WS      : [ \t]+ -> skip ;

COMMENT : '#' ~[\r\n]* -> skip ;
