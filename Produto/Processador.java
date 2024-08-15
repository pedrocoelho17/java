package com.mycompany.mavenproject1;

public class Processador extends Produto {
    private int frequencia;

    public Processador(int frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    
}
