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

    public boolean buy(Purchase purchase) {
        if (purchase.getPrice() <= balance) {
            purchaseList.add(purchase);
            balance -= purchase.getPrice();
            return true;
        } else {
            System.out.println("Insufficient balance for: " + purchase);
            return false;
        }
    }

    public void printPurchases() {
        Collections.sort(purchaseList);

        System.out.println("************************************");
        System.out.println("CARD %d | PURCHASE SUMMARY:\n".formatted(id));
        purchaseList.forEach(System.out::println);
        System.out.println("************************************");
        System.out.println("Available limit: R$ %.2f".formatted(balance));
    }
}
