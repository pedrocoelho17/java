package com.mycompany.mavenproject1;

public enum Sexo {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    private String sexos;
    private char caracter;

    private Sexo(String sexos, char caracter) {
        this.sexos = sexos;
        this.caracter = caracter;
    }

    public String getSexos() {
        return sexos;
    }

    public char getCaracter() {
        return caracter;
    }
    
}
