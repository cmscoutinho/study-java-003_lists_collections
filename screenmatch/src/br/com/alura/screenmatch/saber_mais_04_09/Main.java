package br.com.alura.screenmatch.saber_mais_04_09;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Criando um objeto da classe HashMap que implementa a interface Map
        Map<String, Integer> usandoHashMap = new HashMap<>();

        // Adicionando pares chave-valor
        usandoHashMap.put("Gatos", 1);
        usandoHashMap.put("Cachorros", 2);
        usandoHashMap.put("Roedores", 3);

        // Acessando um valor através de uma chave
        int valor = usandoHashMap.get("Cachorros");
        System.out.println("Valor da chave Cachorros: " + valor);

        // Removendo um par chave-valor
        usandoHashMap.remove("Gatos");
        usandoHashMap.put("Pássaros", 4);
        usandoHashMap.put("Insetos", 0);

        // Iterando sobre as chaves
        for (String chave : usandoHashMap.keySet()) {
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + usandoHashMap.get(chave));
        }
    }
}


