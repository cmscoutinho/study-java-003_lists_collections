package ex_02_08.ex_01;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("Lápis", 0.50, 4);
        Produto produto2 = new Produto("Estojo", 3.50, 2);
        Produto produto3 = new Produto("Resma de papel", 23.50, 2);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println("Quantidade de produtos: %d.".formatted(produtos.size()));

        int posicao = 2;
        System.out.println("Produto da posição %d: %s.".formatted(posicao,produtos.get(posicao)));

        System.out.println("Imprimindo todos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        ProdutoPerecivel perecivel = new ProdutoPerecivel("Coxão mole", 45.50, 1, LocalDate.of(2024, 6, 5));
        System.out.println("Produto perecível:");
        System.out.println(perecivel);
    }
}
