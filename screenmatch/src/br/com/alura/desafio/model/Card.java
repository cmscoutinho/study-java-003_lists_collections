package br.com.alura.desafio.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {
    private int id;
    private double limit;
    private double balance;
    private List<Purchase> purchaseList;

    public Card(int id, double limit) {
        this.id = id;
        this.limit = limit;
        this.balance = limit;
        this.purchaseList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void buy(Purchase purchase) {
        purchaseList.add(purchase);
    }

    @Override
    public String toString() {
        return "" + purchaseList;
    }

    public void printPurchases() {
        Collections.sort(purchaseList);
    }
}
