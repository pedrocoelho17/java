package com.mycompany.mavenproject1;

public class Principal {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("bairro", "147", "prédio", "40295295", "Salvador", UnidadeFederativa.BAHIA);
        Funcionario funcionario1 = new Funcionario(26, "Pedro", "07951933366", "2002526574", "2125", "17/07/1998", Sexo.MASCULINO, Setor.SAUDE, 5000, "7199999999", "pedro@gmail.com", endereco1);
        
        System.out.println(funcionario1.toString());
        
//        System.out.println("\nInformações Funcionários: ");
//        System.out.println("Idade: " + funcionario1.getIdade());
//        System.out.println("Nome: " + funcionario1.getNome());
//        System.out.println("CPF: " + funcionario1.getCpf());
//        System.out.println("RG: " + funcionario1.getRg());
//        System.out.println("Matrícula: " + funcionario1.getMatricula());
//        System.out.println("Data de Nascimento: " + funcionario1.getDataNasc());
//        System.out.println("Sexo: " + funcionario1.getSexo());
//        System.out.println("Salário: " + funcionario1.getSalario());
//        System.out.println("Telefone: " + funcionario1.getTelefone());
//        System.out.println("Email: " + funcionario1.getEmail());
//        System.out.println("Endereço: " + funcionario1.getEndereco());
        
//        System.out.println("\nInformações do endereço: ");
//        System.out.println("Lagradouro: " + endereco1.getLagradouro());
//        System.out.println("Número: " + endereco1.getNumero());
//        System.out.println("Complemento: " + endereco1.getComplemento());
//        System.out.println("CEP: " + endereco1.getCep());
//        System.out.println("Cidade: " + endereco1.getCidade());
//        System.out.println("Unidade Federativa: " + endereco1.getUf());
       
 
    }
    
}
