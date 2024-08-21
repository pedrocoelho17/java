package com.mycompany.mavenproject1;

public class Funcionario {
    private int idade;
    private String nome;
    private String cpf;
    private String rg;
    private String matricula;
    private String dataNasc;
    private Sexo sexo;
    private Setor setor;
    private double salario;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Funcionario(int idade, String nome, String cpf, String rg, String matricula, String dataNasc, Sexo sexo, Setor setor, double salario, String telefone, String email, Endereco endereco) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nidade= " + idade +
               "\nnome= " + nome +
               "\ncpf= " + cpf +
               "\nrg= " + rg +
               "\nmatricula= " + matricula + 
               "\ndataNasc= " + dataNasc +
               "\nsexo= " + sexo +
               "\nsetor= " + setor +
               "\nsalario= " + salario + 
               "\ntelefone= " + telefone +
               "\nemail= " + email +
               "\nendereco= " + endereco;
                
    }

}