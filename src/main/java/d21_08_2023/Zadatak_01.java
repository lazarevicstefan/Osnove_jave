package d21_08_2023;

import java.util.Scanner;

public class Zadatak_01 {
    public static void main(String[] args) {
        /*
        Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve. Na kraju programa prikazati sumu.
        Primer izvrsenja:
        Unesite N: 5
        Unesite broj: 1
        Unesite broj: 2
        Unesite broj: 9
        Unesite broj: 6
        Unesite broj: 8
        Suma parnih brojeva je 16
        Objasnjenje: 2 + 6 + 8 = 16
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Unesite broj: ");
            int trenutni = scanner.nextInt();

            if (trenutni % 2 == 0){
                sum += trenutni;
            }
        }
        System.out.println("Suma parnih brojeva je: " + sum);
    }
}
