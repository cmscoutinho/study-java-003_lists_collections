package br.com.alura.desafio.model;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private double limit;
    private double balance;
    private List<Purchase> purchaseList;

    public Card(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.purchaseList = new ArrayList<>();
    }

    public void buy(Purchase purchase) {
        purchaseList.add(purchase);
    }
}
