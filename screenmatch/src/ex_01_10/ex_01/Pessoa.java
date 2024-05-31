package ex_01_10.ex_01;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: %s | Idade: %d".formatted(nome, idade);
    }

    public static void main(String[] args) {
        var pessoa1 = new Pessoa();
        var pessoa2 = new Pessoa();

        pessoa1.setNome("Claudio");
        pessoa1.setIdade(35);

        pessoa2.setNome("Cecília");
        pessoa2.setIdade(1);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
    }
}
