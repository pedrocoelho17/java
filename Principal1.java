
package com.mycompany.principal1;

public class Principal1 {

    public static void main(String[] args) {
       Livros livro = new Livros("Narinia","Pedro", 200, 50);
 
        
        System.out.println("Nome: " + livro.getNome());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Páginas: " + livro.getPaginas());
        System.out.println("Preço: " + livro.getPreco());
    }
}
