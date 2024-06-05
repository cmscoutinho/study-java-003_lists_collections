package br.com.alura.desafio.model;

public class Purchase implements Comparable<Purchase> {
    private String description;
    private double price;

    public Purchase(String description, double price) {
        this.description = description.substring(0, 1).toUpperCase() + description.substring(1);;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "%s - R$ %.2f".formatted(description, price);
    }

    @Override
    public int compareTo(Purchase other) {
        if (this.getPrice() < other.getPrice()) return -1;
        else if (this.getPrice() > other.getPrice()) return 1;
        else return 0;
    }
}
