package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_01 {
    public static void main(String[] args) {
        /*
        Zadatak
        Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i
        koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
        Primer:
        Unesite pozicjiu od 0 do 9: 3
        Unesite novu vrednost: 11
         */
        Scanner scanner= new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<>();
        nizBrojeva.add(50);
        nizBrojeva.add(60);
        nizBrojeva.add(70);
        nizBrojeva.add(80);
        nizBrojeva.add(90);
        nizBrojeva.add(100);
        nizBrojeva.add(110);
        nizBrojeva.add(120);
        nizBrojeva.add(130);
        nizBrojeva.add(140);

        System.out.print("Unesite poziciju od 0 do 9: ");
        int pozicija = scanner.nextInt();
        System.out.print("Unesite novu vrednost: ");
        int novaVrednost = scanner.nextInt();

        nizBrojeva.set(pozicija,novaVrednost);
    }
}
