package p24_08_2023;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak_06 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(90);
        numbers.add(80);
        numbers.add(70);
        numbers.add(60);
        numbers.add(50);
        numbers.add(40);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println(numbers);

        for (int i = 0; i < 8; i++) {
            int randomIndex1 = random.nextInt(10);
            int randomIndex2 = random.nextInt(10);

            int trenutna = numbers.get(randomIndex1);
            numbers.set(randomIndex1, numbers.get(randomIndex2));
            numbers.set(randomIndex2,trenutna);
        }

        System.out.println(numbers);
    }
}
