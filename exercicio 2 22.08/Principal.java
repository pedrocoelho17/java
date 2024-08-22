package com.mycompany.mavenproject2;

public class Principal {
    public static void main(String[] args) {
    Endereco endereco1 = new Endereco("bairro", "147", "casa", "400000", "salvador", UnidadeFederativa.BAHIA);
    PrestacaoServico prestacaoServico1 = new PrestacaoServico("05/02/2022", "21/07/2024", "2316510001", "1234", "betsa", "3333333", "bet@", endereco1);
    Cliente cliente1 = new Cliente("1254", Sexo.FEMININO, EstadoCivil.CASADO, "05/12/2000", "alana", "71999999", "alana", endereco1);
      
      
        System.out.println(prestacaoServico1);
        System.out.println(cliente1);
    }
}


