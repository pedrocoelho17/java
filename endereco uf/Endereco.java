package com.mycompany.mavenproject1;

public class Endereco {
    private String lagradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private UnidadeFederativa Uf;

    public Endereco(String lagradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa Uf) {
        this.lagradouro = lagradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.Uf = Uf;
    }

    public String getLagradouro() {
        return lagradouro;
    }

    public void setLagradouro(String lagradouro) {
        this.lagradouro = lagradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return Uf;
    }

    public void setUf(UnidadeFederativa Uf) {
        this.Uf = Uf;
    }

    @Override
    public String toString() {
        return "\nlagradouro = " + lagradouro + 
               "\nnumero = " + numero + 
               "\ncomplemento = " + complemento +
               "\ncep = " + cep + 
               "\ncidade = " + cidade + 
               "\nUf = " + Uf.getNome() + "/" + Uf.getSigla();
    }
    
}
