grammar MiGramatica;
@header {
package com.compiladores.antlr;
}

// PARSER

programa
    : clase+ EOF
    ;

clase
    : CLASS ID LLAVE_A cuerpoClase LLAVE_C
    ;

cuerpoClase
    : (variables | metodos)*
    ;

variables
    : tipo ID (IGUAL expresiones)? PUNTO_Y_COMA
    ;

metodos
    : PUBLIC (STATIC)? tipo ID
      PARENTESIS_A parametros? PARENTESIS_C
      bloqueCodigo
    ;

parametros
    : parametro (COMA parametro)*
    ;

parametro
    : tipo ID
    ;

tipo
    : INT
    | FLOAT
    | DOUBLE
    | LONG
    | SHORT
    | BYTE
    | CHAR
    | BOOLEAN
    | STRING
    | VOID
    ;

bloqueCodigo
    : LLAVE_A dentro* LLAVE_C
    ;

dentro
    : bloqueCodigo
    | variables
    | asignacion
    | condicional
    | cicloWhile
    | cicloFor
    | returnDentro
    | printDentro
    ;

asignacion
    : ID IGUAL expresiones PUNTO_Y_COMA
    ;

condicional
    : IF PARENTESIS_A expresiones PARENTESIS_C dentro
      (ELSE dentro)?
    ;

cicloWhile
    : WHILE PARENTESIS_A expresiones PARENTESIS_C dentro
    ;

cicloFor
    : FOR PARENTESIS_A
      (variables | asignacion | PUNTO_Y_COMA)
      expresiones? PUNTO_Y_COMA
      expresiones?
      PARENTESIS_C
      dentro
    ;

returnDentro
    : RETURN expresiones? PUNTO_Y_COMA
    ;

printDentro
    : SYSTEM_OUT_PRINTLN PARENTESIS_A expresiones? PARENTESIS_C PUNTO_Y_COMA
    ;

// -------- EXPRESIONES --------

expresiones
    : expresiones MULTIPLICACION expresiones
    | expresiones DIVISION expresiones
    | expresiones SUMA expresiones
    | expresiones RESTA expresiones
    | expresiones IGUALDAD expresiones
    | expresiones DIFERENCIA expresiones
    | expresiones MAYOR_MENOR_IGUALQUE expresiones
    | expresiones OPERADORES_LOGICOS expresiones
    | PARENTESIS_A expresiones PARENTESIS_C
    | constantes
    | ID
    ;

constantes
    : INT_CONSTANTE
    | FLOAT_CONSTANTE
    | CHAR_CONSTANTE
    | STRING_CONSTANTE
    | BOOLEAN_CONSTANTE
    ;

// LEXER

// ---- PALABRAS RESERVADAS ----
CLASS     : 'Celestial';
PUBLIC    : 'Pueblo';
STATIC    : 'Magico';
VOID      : 'Vasto';
ARGS      : 'Alegre';
NEW       : 'Novedad';
MAIN      : 'Comienza';

INT       : 'Intenso';
FLOAT     : 'Fenix';
DOUBLE    : 'Dorado';
LONG      : 'Dragon';
SHORT     : 'Sapo';
BYTE      : 'Boo';
CHAR      : 'Chispa';
BOOLEAN   : 'Bondad';
STRING    : 'Cancion';
NULL      : 'Invisible';

IF        : 'Destino';
ELSE      : 'Alterno';
DO        : 'Domina';
WHILE     : 'Guardian';
FOR       : 'Viaje';
RETURN    : 'VivieronFelicesParaSiempre';
SWITCH    : 'Cambio';
CASE      : 'Perspectiva';

SYSTEM_OUT_PRINTLN    : 'Divulga';

// ---- CONSTANTES ----
INT_CONSTANTE
    : [0-9]+;

FLOAT_CONSTANTE
    : [0-9]+ '.' [0-9]+;

CHAR_CONSTANTE
    : '\'' . '\'';

STRING_CONSTANTE
    : '"' (~["\r\n])* '"';

BOOLEAN_CONSTANTE
    : 'true' | 'false';

// ---- IDENTIFICADORES ----
ID
    : [a-zA-Z_][a-zA-Z_0-9]*;

// ---- OPERADORES ----
IGUAL         : '=';
SUMA   : '+';
RESTA     : '-';
MULTIPLICACION     : '*';
DIVISION     : '/';
IGUALDAD       : '==';
DIFERENCIA     : '!=';
MAYOR_MENOR_IGUALQUE     : '<' | '<=' | '>' | '>=';
OPERADORES_LOGICOS   : '&&' | '||';

// ---- SÍMBOLOS ----
PUNTO_Y_COMA : ';';
COMA         : ',';
PARENTESIS_A : '(';
PARENTESIS_C : ')';
LLAVE_A      : '{';
LLAVE_C      : '}';
CORCHETE_A      : '[';
CORCHETE_C      : ']';
ESPECIALES      : '$' | '#' | '@' | '%' | '?' | '¿';

// ---- ESPACIOS Y COMENTARIOS ----
WS : [ \t\r\n]+ -> skip;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/' .? '*/' -> skip
    ;