package com.mycompany.mavenproject1;

public class Principal {

    public static void main(String[] args) {
        Cachorro toto = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();
        
        System.out.println(toto.emitirSom());
        System.out.println(gato.emitirSom());
        System.out.println(galo.emitirSom());
        System.out.println(pato.emitirSom());
        System.out.println(toto.comer());
        System.out.println(gato.comer());
        System.out.println(galo.comer());
        System.out.println(pato.comer());
    }
}
