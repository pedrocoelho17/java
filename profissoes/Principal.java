package com.mycompany.mavenproject3;

public class Principal {

    public static void main(String[] args) {
        Engenheiro engenheiro1 = new Engenheiro("1245", "pedro", "0975152123", "123121", 2000);
        Medico medico1 = new Medico("21321", "Raffael", "651615651", "32135156", 5000);
        Motoboy motoboy1 = new Motoboy("5165165", "vinicius", "32123151", "9498489", 3000);
        
        System.out.println(engenheiro1);
        System.out.println(medico1);
        System.out.println(motoboy1);
    }
}
