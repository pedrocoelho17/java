package com.mycompany.mavenproject2;

public enum EstadoCivil {
    SOLTEIRO ("Solteiro"),
    CASADO ("Casado"),
    SEPARADO ("Separado"),
    DIVORCIADO ("Divorciado"),
    VIUVO ("Viuvo");
    
    private String texto;

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }


}