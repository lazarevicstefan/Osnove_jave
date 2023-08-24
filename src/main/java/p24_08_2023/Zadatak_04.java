package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        System.out.print("Unesite poziciju: ");
        int index = scanner.nextInt();
        System.out.print("Na poziciji " + index + " je vrednost " + numbers.get(index));
    }
}
