package main;
import exercicios.JavaBasico1;
import exercicios.JavaBasico2;
import exercicios.JavaBasico3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercicio Básico Java 1
        System.out.println("-------------------EXERCICIO 1-------------------------");
        JavaBasico1 idade = new JavaBasico1(15);
        idade.exibirIdade();
        System.out.println("Resultado 1: " + idade.somaMultiplicaIdade(5, 2));
        System.out.println("Resultado 2: " + idade.subtraiIdade(5));
        idade.verificaIdade(20);

        // Exercicio Básico Java 2
        System.out.println("-------------------EXERCICIO 2-------------------------");
        //a
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valorLido = leitura.nextDouble();

        //b
        JavaBasico2 produto = new JavaBasico2(valorLido);
        produto.obterValor();
        produto.mostraValor();

        //c
        int valorConverter = 10;
        double val = Double.parseDouble(String.valueOf(valorConverter));
        System.out.printf("Novo: %.0f %n", val);
        System.out.println("Convertido: " + valorConverter);

        //d
        double valorD = 10;
        int valorD_Covertido = (int) valorD;
        System.out.printf("Valor real: %.0f %n", valorD);
        System.out.println("Valor inteiro: " + valorD_Covertido);

        // Exercicio Básico Java 3
        System.out.println("-------------------EXERCICIO 3-------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");

        int Valoridade = scanner.nextInt();

        JavaBasico3 verificador = new JavaBasico3();
        verificador.setIdade(Valoridade);
        verificador.verificarIdade();
    }
}