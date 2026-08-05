package javacore.intoducaometodos.test;

import javacore.intoducaometodos.dominio.Funcionarios;


public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        
        funcionarios.nome = "Sanji";
        funcionarios.idade = 23;
        funcionarios.salarios = new double[]{1200, 987.32, 2000};
        
        funcionarios.imprime();
        funcionarios.calcularMediaSalarios();
        
    }
}
