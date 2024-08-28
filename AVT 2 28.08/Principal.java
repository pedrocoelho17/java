package com.mycompany.mavenproject2;

public class Principal {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        
        System.out.println(soma.calcular(5, 4));
        System.out.println(subtracao.calcular(8, 4));
        System.out.println(multiplicacao.calcular(1, 2));
        System.out.println(divisao.calcular(4, 2));
    }
}
