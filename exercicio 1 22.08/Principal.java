package com.mycompany.mavenproject1;

import javax.xml.transform.Source;

public class Principal {

    public static void main(String[] args) {
     Endereco enderco1 = new Endereco("bairro", "147", "apto", "40296296", "Salvador", UnidadeFederativa.BAHIA);
     Juridica juridica1 = new Juridica("00559180001", "12345", "bet sa", "3333333", "bet@", enderco1);
     Fisica fisica1 = new Fisica(Sexo.MASCULINO, "17/07/1998", "Pedro", "333333", "pedro@", enderco1);
     
        System.out.println(fisica1);
        System.out.println(juridica1);
    }
    
            
}
