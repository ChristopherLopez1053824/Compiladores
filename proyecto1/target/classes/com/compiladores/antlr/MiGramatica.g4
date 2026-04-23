grammar MiGramatica;

@header {
package com.compiladores.antlr;
}

<<<<<<< HEAD
// PARSER
programa
    : importacion* clase+ EOF
=======
// -------- PROGRAMA --------

programa
    : importacion* funciones* main EOF
>>>>>>> origin/Nicky
    ;

importacion
    : CONVOCA nombreCompleto PUNTO_Y_COMA
    ;

nombreCompleto
<<<<<<< HEAD
    : ID (PUNTO ID)*
=======
    : ID ('.' ID)*
>>>>>>> origin/Nicky
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

<<<<<<< HEAD
accesoArreglo
    : ID CORCHETE_A expresiones CORCHETE_C
    ;

asignacionSinPuntoYComa
    : (ID | accesoArreglo) IGUAL expresiones
    ;

=======
// -------- VARIABLES --------

variables
    : tipo ID (IGUAL expresiones)? PUNTO_Y_COMA
    ;

>>>>>>> origin/Nicky
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

<<<<<<< HEAD
arreglo
    : LLAVE_A expresiones (COMA expresiones)* LLAVE_C
    ;
=======
// -------- FUNCIONES INTERNAS --------
>>>>>>> origin/Nicky

returnDentro
    : RETURN expresiones? PUNTO_Y_COMA
    ;

printDentro
    : SYSTEM_OUT_PRINTLN PARENTESIS_A expresiones? PARENTESIS_C PUNTO_Y_COMA
    ;

<<<<<<< HEAD

=======
inputDentro
    : LEER PARENTESIS_A ID PARENTESIS_C PUNTO_Y_COMA
    ;
>>>>>>> origin/Nicky

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
<<<<<<< HEAD
    
=======

llamadaFuncion
    : ID PARENTESIS_A expresiones? PARENTESIS_C
    ;

// -------- CONSTANTES --------

>>>>>>> origin/Nicky
constantes
    : INT_CONSTANTE
    | FLOAT_CONSTANTE
    | CHAR_CONSTANTE
    | STRING_CONSTANTE
    | BOOLEAN_CONSTANTE
    ;

<<<<<<< HEAD


// ----------- LEXER ---------------

// ---- PALABRAS RESERVADAS ----
CONVOCA : 'convoca';
PUNTO : '.';
CLASS     : 'celestial';
PUBLIC    : 'pueblo';
STATIC    : 'magico';
VOID      : 'vasto';
ARGS      : 'alegre';
NEW       : 'despertar';
=======
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
>>>>>>> origin/Nicky
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

<<<<<<< HEAD
=======
SYSTEM_OUT_PRINTLN : 'Divulga';
LEER      : 'leer';
>>>>>>> origin/Nicky

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