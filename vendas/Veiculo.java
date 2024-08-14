package com.mycompany.vendas;

public class Veiculo {
    private String placa;
    private String cor;
    private int numeroDePassageiros;
    private double capcidadeDeTanque;
    private double velocidadeMax;
    private double consumoMedio;

    public Veiculo(String placa, String cor, int numeroDePassageiros, double capcidadeDeTanque, double velocidadeMax, double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capcidadeDeTanque = capcidadeDeTanque;
        this.velocidadeMax = velocidadeMax;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public void setNumeroDePassageiros(int numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }

    public double getCapcidadeDeTanque() {
        return capcidadeDeTanque;
    }

    public void setCapcidadeDeTanque(double capcidadeDeTanque) {
        this.capcidadeDeTanque = capcidadeDeTanque;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
    
}
