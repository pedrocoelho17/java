package com.mycompany.endereco;

public class Principal {

    public static void main(String[] args) {
        Cliente clientes = new Cliente("pedro", 26, "cachorro");
        
        Pet pets = new Pet("zoe", 2, "lulu");
        
        System.out.println("\nDados do cliente: ");
        System.out.println("Nome: " + clientes.getNome());
        System.out.println("Idade: " + clientes.getIdade());
        System.out.println("Pet: " + clientes.getPet());
        
        System.out.println("\nDados do pet: ");
        System.out.println("Nome: " + pets.getNome());
        System.out.println("Idade: " + pets.getIdade());        
        System.out.println("Raça: " + pets.getRaca());
    }
}
