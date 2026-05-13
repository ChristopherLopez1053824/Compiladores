package com.compiladores;

import java.util.*;

public class TablaSimbolos {

    // Stack de scopes (cada bloque tiene su propio mapa)
    private Stack<Map<String, Simbolo>> scopes = new Stack<>();

    
    // Constructor → crea scope global
    public TablaSimbolos() {
        entrarScope();
    }


    public void entrarScope() {
        scopes.push(new LinkedHashMap<>());
    }

    public void salirScope() {
        if (!scopes.isEmpty()) {
            scopes.pop();
        }
    }


    public void declarar(String nombre, String tipo, String valor) {

        Map<String, Simbolo> actual = scopes.peek();

        if (actual.containsKey(nombre)) {
            System.out.println("Error semántico: la variable '" + nombre + "' ya fue declarada en este scope");
            return;
        }

        actual.put(nombre, new Simbolo(nombre, tipo, valor));
    }


    public boolean existe(String nombre) {

        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(nombre)) {
                return true;
            }
        }

        return false;
    }


    public Simbolo obtener(String nombre) {

        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(nombre)) {
                return scopes.get(i).get(nombre);
            }
        }

        return null;
    }

    public Map<String, Simbolo> getTabla() {

        Map<String, Simbolo> resultado = new LinkedHashMap<>();

        for (Map<String, Simbolo> scope : scopes) {
            resultado.putAll(scope); 
        }

        return resultado;
    }

    public void imprimir() {

        System.out.println("\nVARIABLE | TIPO | VALOR");
        System.out.println("--------------------------------");

        for (Map<String, Simbolo> scope : scopes) {
            for (Simbolo simbolo : scope.values()) {
                System.out.println(simbolo.nombre + " | " + simbolo.tipo + " | " + simbolo.valor);
            }
        }
    }

    //acceso directo a scopes
    public Stack<Map<String, Simbolo>> getScopes() {
        return scopes;
    }

    @Override
public String toString() {

    StringBuilder sb = new StringBuilder();

    sb.append("\nVARIABLE | TIPO | VALOR\n");

    sb.append("----------------------------------------\n");

    for (Map<String, Simbolo> scope : scopes) {

        for (Simbolo simbolo : scope.values()) {

            sb.append(simbolo.nombre)
              .append(" | ")
              .append(simbolo.tipo)
              .append(" | ")
              .append(simbolo.valor)
              .append("\n");
        }
    }

    return sb.toString();
}
}