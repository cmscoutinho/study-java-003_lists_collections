package ex_02_08.ex_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        produto1.setNome("Lápis");
        produto1.setPreco(0.50);
        produto1.setQuantidade(4);

        produto2.setNome("Estojo");
        produto2.setPreco(3.5);
        produto2.setQuantidade(2);

        produto3.setNome("Resma de papel");
        produto3.setPreco(23.50);
        produto3.setQuantidade(2);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println("Quantidade de produtos: %d.".formatted(produtos.size()));

        int posicao = 2;
        System.out.println("Produto da posição %d: %s.".formatted(posicao,produtos.get(posicao).getNome()));
    }
}
