package ex_04_12.ex_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> genericList;
        genericList = new ArrayList<>();
        genericList.add("Schulz");
        genericList.add("Biden");
        genericList.add("Obrador");
        System.out.println("ArrayList: " + genericList);

        genericList = new LinkedList<>();
        genericList.add("Trudeau");
        genericList.add("Lula");
        System.out.println("LinkedList: " + genericList);
    }
}
