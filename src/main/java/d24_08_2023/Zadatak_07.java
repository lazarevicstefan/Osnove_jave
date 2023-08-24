package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_07 {
    public static void main(String[] args) {
        /*
        (Za vezbanje) Napisati program koji ucitava niz a duzine N. Nakon unosa niza a,
        formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
        a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
        Unesite N: 6
        Unesite broj: 1
        Unesite broj: 5
        Unesite broj: 2
        Unesite broj: 7
        Unesite broj: 8
        Unesite broj: -1
         */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList1 = new ArrayList<>();
        ArrayList<Integer> numbersList2 = new ArrayList<>();

        System.out.print("Unesite N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int current = scanner.nextInt();
            numbersList1.add(current);
        }

        for (int i = 0; i < numbersList1.size(); i++) {
            if (i < 3) {
                numbersList2.add(numbersList1.get(i));
            } else {
                numbersList2.add(1);
            }
        }

        for (int i = 0; i < numbersList1.size(); i++) {
            System.out.print(numbersList1.get(i));
            if (i != numbersList1.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < numbersList2.size(); i++) {
            System.out.print(numbersList2.get(i));
            if (i != numbersList2.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
