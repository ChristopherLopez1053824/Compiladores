grammar MiGramatica;
@header {
package com.compiladores.antlr;
}

// PARSER
programa
    : importacion* clase+ EOF
    ;

importacion
    : CONVOCA nombreCompleto PUNTO_Y_COMA
    ;

nombreCompleto
    : ID (PUNTO ID)*
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

accesoArreglo
    : ID CORCHETE_A expresiones CORCHETE_C
    ;

asignacionSinPuntoYComa
    : (ID | accesoArreglo) IGUAL expresiones
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

arreglo
    : LLAVE_A expresiones (COMA expresiones)* LLAVE_C
    ;

returnDentro
    : RETURN expresiones? PUNTO_Y_COMA
    ;

printDentro
    : SYSTEM_OUT_PRINTLN PARENTESIS_A expresiones? PARENTESIS_C PUNTO_Y_COMA
    ;



// -------- EXPRESIONES --------

expresiones
    : expresionLogica
    ;

expresionLogica
    : expresionIgualdad_diferencia (OPERADORES_LOGICOS expresionIgualdad_diferencia)*
    ;

expresionIgualdad_diferencia
    : expresionRelacional ((IGUALDAD | DIFERENCIA) expresionRelacional)*
    ;

expresionRelacional
    : expresionSum_Rest (MAYOR_MENOR_IGUALQUE expresionSum_Rest)*
    ;

expresionSum_Rest
    : expresionMult_Div ((SUMA | RESTA) expresionMult_Div)*
    ;

expresionMult_Div
    : expresionUnaria ((MULTIPLICACION | DIVISION) expresionUnaria)*
    ;

expresionUnaria
    : PARENTESIS_A expresiones PARENTESIS_C
    | constantes
    | accesoArreglo
    | ID
    ;
    
constantes
    : INT_CONSTANTE
    | FLOAT_CONSTANTE
    | CHAR_CONSTANTE
    | STRING_CONSTANTE
    | BOOLEAN_CONSTANTE
    ;



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
MAIN      : 'comienza';

INT       : 'intenso';
FLOAT     : 'fenix';
DOUBLE    : 'dorado';
LONG      : 'dragon';
SHORT     : 'sapo';
BYTE      : 'boo';
CHAR      : 'chispa';
BOOLEAN   : 'bondad';
STRING    : 'Cancion';
NULL      : 'invisible';

IF        : 'destino';
ELSE      : 'alterno';
DO        : 'domina';
WHILE     : 'guardian';
FOR       : 'viaje';
RETURN    : 'felices';
SWITCH    : 'hechizos';
CASE      : 'capitulo';
SYSTEM_OUT_PRINTLN    : 'Divulga';
SYSTEM_IN : 'enredada';


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
    : '/*' .*? '*/' -> skip
    ;

UNCLOSED_COMMENT
    : '/*' .*? EOF
      { System.out.println("Error: comentario sin cerrar en línea "); }
    ;
    
INVALID_FLOAT
    : [0-9]+ '.' 
      { System.out.println("Error: número decimal mal formado en línea "); }
    ;
INVALID_ID
    : [0-9]+ [a-zA-Z_]+
      { System.out.println("Error: identificador inválido en línea "); }
    ;
UNCLOSED_CHAR
: '\'' .*
    { System.out.println("Error: carácter mal formado en línea "); }
;
UNCLOSED_STRING
    : '"' (~["\r\n])*
      { System.out.println("Error: cadena sin cerrar en línea "); }
    ;

ERROR_CHAR
    : .
    ;