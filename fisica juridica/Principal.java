package com.mycompany.mavenproject2;

public class Principal {

    public static void main(String[] args) {
       Fisica fisica1 = new Fisica("07951926575", "2020541752", "17/07/1998", "Pedro", "71999556887");
       Juridica juridica1 = new Juridica("5151651615", "12354", "bET SA", "33333333");
       
        System.out.println(fisica1);
        System.out.println(juridica1);
                
    }
}
