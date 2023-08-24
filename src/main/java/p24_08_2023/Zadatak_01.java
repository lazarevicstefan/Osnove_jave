package p24_08_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Zadatak_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list.get(0) + list.get(list.size()-1));

    }
}
