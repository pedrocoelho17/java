package com.mycompany.mavenproject2;

public class Fisica extends Pessoa{
    private String cpf;
    private String rg;
    private String dataNasc;

    public Fisica(String cpf, String rg, String dataNasc, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "\nPessoa Fisica " +
               super.toString() +
               "\ncpf = " + cpf +
               "\nrg = " + rg + 
               "\ndataNasc = " + dataNasc;
    }

}