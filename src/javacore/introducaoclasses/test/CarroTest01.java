package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Carro;


public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        
        carro.nome = "Fiat Argo";
        carro.modelo = "Hatch";
        carro.ano = 2023;
        
        carro2.nome = "Hyundai HB20";
        carro2.modelo = "Hatch";
        carro2.ano = 2016;
        
        System.out.println("Nome: " + carro.nome + "\nModelo: " + carro.modelo + "\nAno de Fabricação: " + carro.ano);
        System.out.println("-------------------------------");
        System.out.println("Nome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno de Fabricação: " + carro2.ano);
    }
}
