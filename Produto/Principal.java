package com.mycompany.mavenproject1;

public class Principal {

    public static void main(String[] args) {
        PlacaMae placamae1 = new PlacaMae("xx", "123", "novo");
        
        Processador processador1 = new Processador(240, "123", "intermediario");
        
        System.out.println("\nDados da placa mãe: ");
        System.out.println("Soquete: " + placamae1.getSoquete());
        System.out.println("Marca: " + placamae1.getMarca());
        System.out.println("Modelo: " + placamae1.getModelo());
        
        System.out.println("\nDados do processador: ");
        System.out.println("Frequência: " + processador1.getFrequencia());
        System.out.println("Marca: " + processador1.getMarca());
        System.out.println("Modelo: " + processador1.getModelo());
    }
    
       
}
