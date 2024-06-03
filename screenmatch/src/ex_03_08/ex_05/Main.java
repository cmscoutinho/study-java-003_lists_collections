package ex_03_08.ex_05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> listaFormas = new ArrayList<>();

        listaFormas.add(new Circulo(1.3));
        listaFormas.add(new Quadrado(0.5));
        listaFormas.add(new Quadrado(3.56));
        listaFormas.add(new Circulo(3.14));
        listaFormas.add(new Quadrado(9.2));

        listaFormas.forEach(forma -> System.out.println(forma.calcularArea()));
    }
}
