package main;
import exercicios.JavaBasico1;

public class Main {
    public static void main(String[] args) {
        JavaBasico1 idade = new JavaBasico1(15);
        idade.exibirIdade();
        System.out.println("Resultado 1: " + idade.somaMultiplicaIdade(5,2));
        System.out.println("Resultado 2: " + idade.subtraiIdade(5));
        idade.verificaIdade(20);
    }
}
