package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_02 {
    public static void main(String[] args) {
        /*
        Zadatak
        Napisati program koji ucitava N brojeva i smesta ih u niz.
        Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
        Unesite N: 5
        Unesite broj: 1
        Unesite broj: 3
        Unesite broj: 4
        Unesite broj: 7
        Unesite broj: 8
        U nizu ima 2 parna broja.
         */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();
        System.out.print("Unesite N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            numbersList.add(scanner.nextInt());
        }

        int count = 0;
        for (Integer number: numbersList){
            if (number % 2 == 0){
                count++;
            }
        }
        System.out.println("U nizu ima " + count + " parna broja.");
    }
}
