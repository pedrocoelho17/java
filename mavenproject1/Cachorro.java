package com.mycompany.mavenproject1;

public class Cachorro implements Animal{
    
    // Sobrescrita
    @Override
    public String emitirSom() {
       return "auau";
    }

    @Override
    public String comer() {
        return "ração";
    }
    
    
}
