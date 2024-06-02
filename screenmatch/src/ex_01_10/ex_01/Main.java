package ex_01_10.ex_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("Claudio");
        pessoa1.setIdade(35);

        pessoa2.setNome("Carol");
        pessoa2.setIdade(35);

        pessoa3.setNome("Cecília");
        pessoa3.setIdade(1);

        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);
    }
}
