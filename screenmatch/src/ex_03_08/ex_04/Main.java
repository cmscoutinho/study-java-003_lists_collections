package ex_03_08.ex_04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Feijão",9.20));
        listaProdutos.add(new Produto("Arroz",6.40));
        listaProdutos.add(new Produto("Chocolate",9.5));
        listaProdutos.add(new Produto("Suco de uva",12.90));
        listaProdutos.add(new Produto("Colgate",17.9));
        listaProdutos.add(new Produto("Bicarbonato de sódio",3.40));

        double soma = 0.0;
        for (Produto produto: listaProdutos) {
            soma += produto.getPreco();
        }

        double media = soma / listaProdutos.size();
        System.out.println("Média de preços: R$%.2f".formatted(media));
    }
}
