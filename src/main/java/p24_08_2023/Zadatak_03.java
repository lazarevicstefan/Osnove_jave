package p24_08_2023;

import java.util.ArrayList;

public class Zadatak_03 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        int trenutni = numbers.get(0);
        numbers.set(0,numbers.get(numbers.size()-1));
        numbers.set(numbers.size()-1,trenutni);

        for (Integer number : numbers){
            System.out.print(number + " ");
        }
    }
}
