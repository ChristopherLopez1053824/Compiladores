package com.lab1compiladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.Token;

public class ShuntingYard {

    // PRECEDENCIA DE OPERADORES
    private static int precedencia(Token t) {
        switch (t.getType()) {
            case MiGramaticaLexer.MUL: // antes MULT
            case MiGramaticaLexer.DIV:
                return 2;

            case MiGramaticaLexer.PLUS:
            case MiGramaticaLexer.MINUS:
                return 1;

            default:
                return 0;
        }
    }

    // ALGORITMO SHUNTING YARD
    public static List<Token> convertir(List<Token> tokens) {

        Stack<Token> operadores = new Stack<Token>();
        List<Token> salida = new ArrayList<Token>();

        for (Token token : tokens) {

            switch (token.getType()) {

                // NÚMEROS -> BINARIO, BASE4, HEX
                case MiGramaticaLexer.BINARIO:
                case MiGramaticaLexer.BASE4:
                case MiGramaticaLexer.HEX:
                    salida.add(token);
                    break;

                // OPERADORES
                case MiGramaticaLexer.PLUS:
                case MiGramaticaLexer.MINUS:
                case MiGramaticaLexer.MUL:
                case MiGramaticaLexer.DIV:

                    while (!operadores.isEmpty()
                            && precedencia(operadores.peek()) >= precedencia(token)) {
                        salida.add(operadores.pop());
                    }
                    operadores.push(token);
                    break;

                // PARÉNTESIS
                case MiGramaticaLexer.LPAREN:
                    operadores.push(token);
                    break;

                case MiGramaticaLexer.RPAREN:
                    while (!operadores.isEmpty()
                            && operadores.peek().getType() != MiGramaticaLexer.LPAREN) {
                        salida.add(operadores.pop());
                    }
                    operadores.pop(); // quitar '('
                    break;

                default:
                    // ignorar otros tokens
                    break;
            }
        }

        // VACIAR OPERADORES
        while (!operadores.isEmpty()) {
            salida.add(operadores.pop());
        }

        return salida;
    }
}
