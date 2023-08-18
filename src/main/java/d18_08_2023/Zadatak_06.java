package d18_08_2023;

import java.util.Scanner;

public class Zadatak_06 {
    public static void main(String[] args) {
        /*
        (Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
        Primer izvrsenja:
        Unesite dimenziju table: 5
         _|_|_|_|_|
         _|_|_|_|_|
         _|_|_|_|_|
         _|_|_|_|_|
         _|_|_|_|_|
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite dimenziju table: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("_|");
            }
            System.out.println();
        }
    }
}
