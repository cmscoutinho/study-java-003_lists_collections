package ex_04_12.ex_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList = new LinkedList<>();

        aList.add("Schulz");
        aList.add("Biden");
        aList.add("Obrador");
        aList.add("Trudeau");
        aList.add("Lula");

        Collections.sort(aList);

        System.out.println("Sorted list: " + aList);
    }
}
