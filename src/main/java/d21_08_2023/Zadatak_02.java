package d21_08_2023;

import java.util.Scanner;

public class Zadatak_02 {
    public static void main(String[] args) {
        /*
        Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
        Unesite N: 5
        Unesite broj: 1
        Unesite broj: 32
        Unesite broj: 121
        Unesite broj: 1333
        Unesite broj: 144
        Suma je: 265
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int trenutni = scanner.nextInt();
            if (trenutni > 99 && trenutni < 1000){
                sum += trenutni;
            }
        }
        System.out.println("Suma je: " + sum);
    }
}
