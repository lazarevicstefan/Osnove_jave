package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_04 {
    public static void main(String[] args) {
        /*
        Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
        Primer izvrsenja:
        Unesite N: 5
        Unesite broj: 1
        Unesite broj: -4
        Unesite broj: 3
        Unesite broj: -7
        Unesite broj: 9

        Brojevi veci od nule u nizu A su: 1, 3, 9,
         */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();
        System.out.print("Unesite N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            numbersList.add(scanner.nextInt());
        }
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) > 0) {
                System.out.print(numbersList.get(i) + ", ");
            }
        }
    }
}
