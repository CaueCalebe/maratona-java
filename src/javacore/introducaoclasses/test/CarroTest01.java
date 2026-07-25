package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Carro;


public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Fiat Argo";
        carro.modelo = "Hatche";
        carro.ano = 2023;
        
        System.out.println("Nome: " + carro.nome + "\nModelo: " + carro.modelo + "\nAno de Fabricação: " + carro.ano);
    }
}
