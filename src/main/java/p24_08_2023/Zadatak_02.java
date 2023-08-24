package p24_08_2023;

import java.util.ArrayList;

public class Zadatak_02 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        numbers.set(3,numbers.get(3)*10);
        System.out.println(numbers.get(3));

    }
}
