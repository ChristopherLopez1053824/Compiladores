grammar MiGramatica;

@header {
package com.compiladores.antlr;
}

// -------- PROGRAMA --------

programa
    : importacion* funciones* main EOF
    ;

importacion
    : CONVOCA nombreCompleto PUNTO_Y_COMA
    ;

nombreCompleto
    : ID ('.' ID)*
    ;

main
    : MAIN bloqueCodigo
    ;

// -------- FUNCIONES --------

funciones
    : HECHIZO tipo ID PARENTESIS_A parametro? PARENTESIS_C bloqueCodigo
    ;

parametro
    : tipo ID
    ;

// -------- BLOQUES --------

bloqueCodigo
    : LLAVE_A sentencia* LLAVE_C
    ;

sentencia
    : variables
    | asignacion
    | condicional
    | cicloWhile
    | cicloFor
    | returnDentro
    | printDentro
    | inputDentro
    ;

// -------- VARIABLES --------

variables
    : tipo ID (IGUAL expresiones)? PUNTO_Y_COMA
    ;

asignacion
    : ID IGUAL expresiones PUNTO_Y_COMA
    ;

// -------- CONTROL --------

condicional
    : IF PARENTESIS_A expresiones PARENTESIS_C bloqueCodigo
      (ELSE bloqueCodigo)?
    ;

cicloWhile
    : WHILE PARENTESIS_A expresiones PARENTESIS_C bloqueCodigo
    ;

cicloFor
    : FOR PARENTESIS_A
      (variables | asignacion | PUNTO_Y_COMA)
      expresiones? PUNTO_Y_COMA
      expresiones?
      PARENTESIS_C
      bloqueCodigo
    ;

// -------- FUNCIONES INTERNAS --------

returnDentro
    : RETURN expresiones? PUNTO_Y_COMA
    ;

printDentro
    : SYSTEM_OUT_PRINTLN PARENTESIS_A expresiones? PARENTESIS_C PUNTO_Y_COMA
    ;

inputDentro
    : LEER PARENTESIS_A ID PARENTESIS_C PUNTO_Y_COMA
    ;

// -------- EXPRESIONES --------

expresiones
    : expresionLogica
    ;

expresionLogica
    : expresionIgualdad (OPERADORES_LOGICOS expresionIgualdad)*
    ;

expresionIgualdad
    : expresionRelacional ((IGUALDAD | DIFERENCIA) expresionRelacional)*
    ;

expresionRelacional
    : expresionSuma (MAYOR_MENOR_IGUALQUE expresionSuma)*
    ;

expresionSuma
    : expresionMult ((SUMA | RESTA) expresionMult)*
    ;

expresionMult
    : expresionUnaria ((MULTIPLICACION | DIVISION) expresionUnaria)*
    ;

expresionUnaria
    : PARENTESIS_A expresiones PARENTESIS_C
    | constantes
    | llamadaFuncion
    | ID
    ;

llamadaFuncion
    : ID PARENTESIS_A expresiones? PARENTESIS_C
    ;

// -------- CONSTANTES --------

constantes
    : INT_CONSTANTE
    | FLOAT_CONSTANTE
    | CHAR_CONSTANTE
    | STRING_CONSTANTE
    | BOOLEAN_CONSTANTE
    ;

// -------- TIPOS --------

tipo
    : INT
    | FLOAT
    | DOUBLE
    | CHAR
    | BOOLEAN
    | STRING
    | VOID
    ;

// -------- LEXER --------

// PALABRAS RESERVADAS
CONVOCA : 'convoca';
MAIN      : 'comienza';
HECHIZO   : 'hechizo';

INT       : 'intenso';
FLOAT     : 'fenix';
DOUBLE    : 'dorado';
CHAR      : 'chispa';
BOOLEAN   : 'bondad';
STRING    : 'Cancion';
VOID      : 'vasto';

IF        : 'destino';
ELSE      : 'alterno';
WHILE     : 'guardian';
FOR       : 'viaje';
RETURN    : 'felices';

SYSTEM_OUT_PRINTLN : 'Divulga';
LEER      : 'escuchar';

// CONSTANTES
INT_CONSTANTE : [0-9]+;
FLOAT_CONSTANTE : [0-9]+ '.' [0-9]+;
CHAR_CONSTANTE : '\'' . '\'';
STRING_CONSTANTE : '"' (~["\r\n])* '"';
BOOLEAN_CONSTANTE : 'true' | 'false';

// IDENTIFICADORES
ID : [a-zA-Z_][a-zA-Z_0-9]*;

// OPERADORES
IGUAL : '=';
SUMA : '+';
RESTA : '-';
MULTIPLICACION : '*';
DIVISION : '/';
IGUALDAD : '==';
DIFERENCIA : '!=';
MAYOR_MENOR_IGUALQUE : '<' | '<=' | '>' | '>=';
OPERADORES_LOGICOS : '&&' | '||';

// SÍMBOLOS
PUNTO_Y_COMA : ';';
COMA : ',';
PARENTESIS_A : '(';
PARENTESIS_C : ')';
LLAVE_A : '{';
LLAVE_C : '}';

// ESPACIOS
WS : [ \t\r\n]+ -> skip;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

UNCLOSED_COMMENT
    : '/*' .*? EOF
    ;
    
INVALID_FLOAT
    : [0-9]+ '.' 
    ;
INVALID_ID
    : [0-9]+ [a-zA-Z_]+
    ;
UNCLOSED_CHAR
: '\'' .*
;
UNCLOSED_STRING
    : '"' (~["\r\n])*
    ;

ERROR_CHAR
    : .
    ;