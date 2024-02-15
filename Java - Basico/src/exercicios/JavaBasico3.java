package exercicios;

public class JavaBasico3 {
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade > 20) {
            System.out.println("Idade maior que 20");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Idade maior que 12 e menor que 17");
        } else if (idade == 7 || idade < 5) {
            System.out.println("Idade igual a 7 OU menor que 5");
        } else {
            System.out.println("Outras combinações");
        }
    }
}
