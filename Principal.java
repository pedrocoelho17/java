
package com.mycompany.principal;

public class Principal {

    public static void main(String[] args) {
        Clientes cliente = new Clientes();
        
        //cliente.nome = "Marta";
        cliente.setNome("Marta");
        //cliente.idade = 20;
        cliente.setIdade(20);
        
        System.out.println("Nome: " + cliente.nome);
        System.out.println("Idade: " + cliente.idade);
    }
}
