package exercicios;

public class JavaBasico2 {
    private double valorProduto;

    public JavaBasico2(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public void obterValor(){
        System.out.println("O valor do produto é " + this.valorProduto);

    }
    public void mostraValor(){
        System.out.printf("Valor com casas decimais: %.2f %n", this.valorProduto);
        System.out.printf("Valor inteiro: %.0f %n", this.valorProduto);
    }
}
