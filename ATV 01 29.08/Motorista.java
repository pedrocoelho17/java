package com.mycompany.mavenproject1;

public class Motorista extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motorista(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        double getSalarioFinal = 0;
        getSalarioFinal += super.salario;
        return getSalarioFinal;
    }

    @Override
    public String toString() {
        return "Carteira de Habilitação: " + carteiraDeHabilitacao;
    }
    
}
