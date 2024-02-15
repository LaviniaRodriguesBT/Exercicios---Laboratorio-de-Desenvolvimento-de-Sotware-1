package exercicios;

public class JavaBasico1 {
    private int idade;

    public JavaBasico1(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirIdade(){
        System.out.println("A idade é de " + getIdade() + " anos");
    }

    public int somaMultiplicaIdade(int soma, int multiplica){
        this.idade = (this.idade + soma) * multiplica;
        return this.idade;
    }

    public int subtraiIdade(int subtrai){
        this.idade = this.idade - subtrai;
        return this.idade;
    }

    public void verificaIdade(int comparaIdade){
        if (this.idade > comparaIdade){
            System.out.println("A idade é maior que  " + comparaIdade);
        }else {
            System.out.println("A idade é menor que  " + comparaIdade);
        }
    }
}
