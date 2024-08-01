package com.mycompany.atividades;

import java.util.Scanner;


public class Atividades {

    public static void main(String[] args) {
        Scanner mercado = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto: ");
        Double preco = mercado.nextDouble();
        
        System.out.println("Digite a quantidade de parcelas");
        int parcelas = mercado.nextInt();
        
        double valorParcelas = preco / parcelas;
        
         System.out.println("Preço: " + preco);
         System.out.println("Quantidade de parcelas: " + parcelas);
         System.out.println("Valor da parcela: " + valorParcelas);
         
                  
        
        
        
                
        
    }
}
