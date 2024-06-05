package br.com.alura.desafio.model;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limit;
    private double balance;
    private List<Purchase> purchaseList;

    public Cartao(double limite) {
        this.limit = limite;
        this.balance = limite;
        this.purchaseList = new ArrayList<>();
    }

    public void comprar(Purchase purchase) {
        purchaseList.add(purchase);
    }
}
