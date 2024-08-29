package com.mycompany.mavenproject1;

public class Principal {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("bairro", "174", "apto", "40988255", "salvador", UnidadeFederativa.BAHIA);
        Advogado advogado1 = new Advogado("5456", "pedro", "07951926577", "2020565478", endereco1, Setor.MARKETING, Sexo.FEMININO, 3000, "17/07");
        Motorista motorista1 = new Motorista("2121", "jose", "052156165", "2123131", endereco1, Setor.MARKETING, Sexo.FEMININO, 2000, "25/01");
        Gerente gerente1 = new Gerente(Bonificacao.DIRETOR, "marcos", "3232132131", "84877887", endereco1, Setor.MARKETING, Sexo.FEMININO, 4000, "03/01");
        Diretor diretor1 = new Diretor(Bonificacao.DIRETOR, "claudio", "321321321", "68748787", endereco1, Setor.MARKETING, Sexo.FEMININO, 6000, "11/03");
        
        System.out.println(diretor1);
    }
    
    
    
}

