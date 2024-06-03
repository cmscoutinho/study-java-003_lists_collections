package ex_03_08.ex_01;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListExemplo {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Python");
        lista.add("JavaScript");
        lista.add("Java");
        lista.add("C/C++");
        lista.add("Ruby");
        lista.add("Rust");

        lista.forEach(System.out::println);
    }
}
