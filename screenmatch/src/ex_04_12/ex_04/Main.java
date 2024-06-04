package ex_04_12.ex_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("Schulz");
        aList.add("Biden");
        aList.add("Obrador");

        List<String> lList = new LinkedList<>();
        lList = new LinkedList<>();
        lList.add("Trudeau");
        lList.add("Lula");

        System.out.println("ArrayList: " + aList);
        System.out.println("LinkedList: " + lList);
    }
}
