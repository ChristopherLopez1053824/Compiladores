package com.lab1compiladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;

public class ShuntingYard {

    // Convierte BIN/B4/HEX a decimal, retorna -1 si no es válido
    public static int convertirValor(String tipo, String valor) {
        try {
            switch (tipo) {
                case "BIN_ID": return Integer.parseInt(valor, 2);
                case "B4_ID": return Integer.parseInt(valor, 4);
                case "HEX_ID": return Integer.parseInt(valor, 16);
            }
        } catch (Exception e) {}
        return -1;
    }

    // Prepara tokens: convierte IDs y literales a decimal
    public static List<Token> prepararTokens(List<Token> tokens, Map<String,Integer> valoresVariables) {
        List<Token> exprTokens = new ArrayList<>();
        for (Token t : tokens) {
            String tipo = MiGramaticaLexer.VOCABULARY.getSymbolicName(t.getType());
            if (t.getType() == MiGramaticaLexer.EOF || t.getType() == MiGramaticaLexer.WS ||
                    t.getType() == MiGramaticaLexer.COMMENT ||
                    "=".equals(t.getText()) ||
                    "BIN_ID".equals(tipo) || "B4_ID".equals(tipo) || "HEX_ID".equals(tipo) ||
                    t.getType() == MiGramaticaLexer.NEWLINE)
                continue;

            if ("ID".equals(tipo)) {
                if (!valoresVariables.containsKey(t.getText()))
                    continue;
                int valor = valoresVariables.get(t.getText());
                exprTokens.add(new CommonToken(MiGramaticaLexer.BINARIO, String.valueOf(valor)));
            } else if ("BINARIO".equals(tipo) || "BASE4".equals(tipo) || "HEX".equals(tipo)) {
                int valor = 0;
                switch (tipo) {
                    case "BINARIO": valor = Integer.parseInt(t.getText(), 2); break;
                    case "BASE4":  valor = Integer.parseInt(t.getText(), 4); break;
                    case "HEX":    valor = Integer.parseInt(t.getText(), 16); break;
                }
                exprTokens.add(new CommonToken(MiGramaticaLexer.BINARIO, String.valueOf(valor)));
            } else {
                exprTokens.add(t);
            }
        }
        return exprTokens;
    }

    // Convierte expresión a RPN usando algoritmo Shunting Yard
    public static List<Token> convertir(List<Token> tokens) {
        List<Token> output = new ArrayList<>();
        List<Token> stack = new ArrayList<>();

        for (Token t : tokens) {
            String texto = t.getText();
            switch (texto) {
                case "+": case "-": case "*": case "/":
                    while (!stack.isEmpty() && prioridad(stack.get(stack.size()-1)) >= prioridad(t)) {
                        output.add(stack.remove(stack.size()-1));
                    }
                    stack.add(t);
                    break;
                case "(":
                    stack.add(t);
                    break;
                case ")":
                    while (!stack.isEmpty() && !"(".equals(stack.get(stack.size()-1).getText())) {
                        output.add(stack.remove(stack.size()-1));
                    }
                    if (!stack.isEmpty()) stack.remove(stack.size()-1); // quitar "("
                    break;
                default: // número
                    output.add(t);
                    break;
            }
        }

        while (!stack.isEmpty()) {
            output.add(stack.remove(stack.size()-1));
        }

        return output;
    }

    // Evalúa RPN simple con enteros y operadores + - * /
    public static int evaluarRPN(List<Token> rpn) {
        List<Integer> pila = new ArrayList<>();
        for (Token t : rpn) {
            String tipo = MiGramaticaLexer.VOCABULARY.getSymbolicName(t.getType());
            String texto = t.getText();
            if ("BINARIO".equals(tipo)) {
                pila.add(Integer.parseInt(texto));
            } else {
                int b = pila.remove(pila.size() - 1);
                int a = pila.remove(pila.size() - 1);
                switch (texto) {
                    case "+": pila.add(a + b); break;
                    case "-": pila.add(a - b); break;
                    case "*": pila.add(a * b); break;
                    case "/": pila.add(a / b); break;
                }
            }
        }
        return pila.get(0);
    }

    // Prioridad de operadores
    private static int prioridad(Token t) {
        String op = t.getText();
        if ("*".equals(op) || "/".equals(op)) return 2;
        if ("+".equals(op) || "-".equals(op)) return 1;
        return 0;
    }
}
