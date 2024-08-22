package com.mycompany.mavenproject2;

public enum Sexo {
    MASCULINO ('M', "Masculino"),
    FEMININO ('F', "Feminino");
    
    private char caracter;
    private String texto;

    private Sexo(char caracter, String texto) {
        this.caracter = caracter;
        this.texto = texto;
    }

    public char getCaracter() {
        return caracter;
    }

    public String getTexto() {
        return texto;
    }
    
}
