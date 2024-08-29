package com.mycompany.mavenproject1;

public class Diretor extends CargoDeConfianca implements Contratacao{
    private double premio = 0.5;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

    
    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo Funcionário");
        System.out.println("Dados do funcionário");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo Funcionário");
        System.out.println("Dados do funcionário");
        System.out.println(funcionario.toString());
    }

    @Override
    public double getSalarioFinal() {
        double getSalarioFinal = 0;
        getSalarioFinal = super.salario * premio * bonificacao.getValor();
        getSalarioFinal += super.salario;
        return getSalarioFinal;
                
    }

    @Override
    public String toString() {
        return "Prêmio: " + premio +
        super.toString();
    }

   
}
