package ex_03_08.ex_06;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int itConta = 1;

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            listaContas.add(new ContaBancaria(itConta++, Math.random() * 5000.0));
        }

        ContaBancaria maiorConta = null;
        double maior = 0.0;

        for (ContaBancaria conta: listaContas) {
            if (conta.getSaldo() > maior) {
                maior = conta.getSaldo();
                maiorConta = conta;
            }
        }

        System.out.println("Conta com maior saldo:");
        System.out.println(maiorConta);



    }
}
