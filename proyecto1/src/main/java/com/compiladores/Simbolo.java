package com.compiladores;

public class Simbolo {

    public String nombre;
    public String tipo;
    public String valor;

    public Simbolo(String nombre, String tipo, String valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }
}