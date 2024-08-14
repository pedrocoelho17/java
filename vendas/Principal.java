package com.mycompany.vendas;

public class Principal {

    public static void main(String[] args) {
       Veiculo carro = new Veiculo("peu17", "preto", 5, 200, 220, 12);
       
       Cliente cliente1 = new Cliente("pedro", 26, "07951926574", "rua 1", "719999999");
       
        System.out.println("\nDados do veículo: ");
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Cor " + carro.getCor());
        System.out.println("Número de passageiros: " + carro.getNumeroDePassageiros());
        System.out.println("Capacidade do tanque: " + carro.getCapcidadeDeTanque());
        System.out.println("Velocidade máxima: " + carro.getVelocidadeMax());
        System.out.println("Consumo médio: " + carro.getConsumoMedio());
        
        System.out.println("\nDados do cliente: ");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());
  
    }
}
