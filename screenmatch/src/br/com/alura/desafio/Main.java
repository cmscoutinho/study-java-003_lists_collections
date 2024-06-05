package br.com.alura.desafio;

import br.com.alura.desafio.model.Card;
import br.com.alura.desafio.model.Purchase;

public class Main {
    public static void main(String[] args) {
        Card card = new Card(4399, 1500.0);

        card.buy(new Purchase("Shoes", 89.9));
        card.buy(new Purchase("Tablet", 1340.0));
        card.buy(new Purchase("Earphones", 19.9));

        card.printPurchases();
    }
}
