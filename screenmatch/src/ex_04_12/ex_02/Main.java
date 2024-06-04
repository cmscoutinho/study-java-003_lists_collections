package ex_04_12.ex_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Title> list = new ArrayList<>();

        list.add(new Title("The Shawshank Redemption"));
        list.add(new Title("Birdman"));
        list.add(new Title("Young Sheldon"));
        list.add(new Title("Lost"));
        list.add(new Title("Bridgerton"));

        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}
