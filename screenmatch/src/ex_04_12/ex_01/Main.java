package ex_04_12.ex_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        int qtdNumeros = 20;
        int max = 30;
        Random random = new Random();

        for (int i = 0; i < qtdNumeros; i++) {
            lista.add(random.nextInt(max));
        }

        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);
    }
}
