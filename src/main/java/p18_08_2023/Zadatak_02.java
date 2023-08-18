package p18_08_2023;

import java.util.Scanner;

public class Zadatak_02 {
    public static void main(String[] args) {
        /*
        Napisati program koji ucitava broj a i ispisuje poruke:
        Ukoliko je broj a do 10 stampamo da je jednocifren broj
        Ukoliko je broj a do 100 stampamo da je dvocifren broj
        Ukoliko je broj a veci od 100 stampamo da je trocifren.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj a: ");
        int a = scanner.nextInt();

        if (a < 10){
            System.out.println("Broj je jednocifren");
        } else if (a < 100) {
            System.out.println("Broj je dvocifren");
        } else if (a < 1000){
            System.out.println("Broj je trocifren");
        }
    }
}
