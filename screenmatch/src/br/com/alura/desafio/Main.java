package br.com.alura.desafio;

import br.com.alura.desafio.model.Card;
import br.com.alura.desafio.model.Purchase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in the card's limit: ");
        double limit = scanner.nextDouble();
        scanner.nextLine();

        Card card = new Card(4399, limit);

        int option;
        do {
            System.out.print("Purchase description: ");
            String description = scanner.nextLine();

            System.out.print("Purchase price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            card.buy(new Purchase(description, price));

            System.out.println("Options: 0-leave | 1-continue");
            option = scanner.nextInt();
            scanner.nextLine();
        } while (option != 0);

        card.summary();
    }
}
