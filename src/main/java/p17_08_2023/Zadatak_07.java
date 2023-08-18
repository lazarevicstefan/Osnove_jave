package p17_08_2023;

import java.util.Scanner;

public class Zadatak_07 {
    public static void main(String[] args) {
        /*
        Napisati program koji proverava da li je broj telefona validan.
        Program na pocetku ucitava broj telefona korisnika i ispisuje gresku ukoliko telefon nije validan.
        Broj nije validan ukoliko nema +381 ili ako ima kosu crtu (/)

        Primer izvrsenja:
        Unesite broj telefona za proveru: 492820233
        Broj nije validan.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj telefona za proveru: ");
        String brojTelefona = scanner.nextLine();

        if (!brojTelefona.contains("+381") || brojTelefona.contains("/")) {
            System.out.println("Broj nije validan.");
        }

    }
}
