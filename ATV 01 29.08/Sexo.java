package com.mycompany.mavenproject1;

public enum Sexo {
    MASCULINO ("Masculino", 'M'),
    FEMININO ("Feminino", 'F');
    
    private String texto;
    private char caracter;

    private Sexo(String texto, char caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaracter() {
        return caracter;
    }
    
}
