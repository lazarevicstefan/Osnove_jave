package d18_08_2023;

import java.util.Scanner;

public class Zadatak_01 {
    public static void main(String[] args) {
        /*
        Napisati program koji za unetu vrednost x odredjuje i prikazuje vrednost funkcije y.
        Iskoristite if/else za racunanje informacije i tek nakon te logike odstampajte vrednost y na ekranu.
        Funkcija y je definisana kao:
    			       (x,       x < 2
                  y =  (2,      2 <= x < 10
    			       (x - 1, x >= 10
        Objasnjenje formule: Ako je x manje od 2, y je jednako x
                     Ako je x u opsegu od 2 do 10, y je jednako 2
                     Ako je x vece od 10, y je x-1

        Primer izvrsenja 1:
        Unesite x: -3
        y = -3
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite x: ");
        int brojX = scanner.nextInt();
        int brojY = 0;

        if (brojX < 2) brojY = brojX;
        if (brojX > 2 && brojX < 10) brojY = 2;
        if (brojX > 10) brojY = brojX - 1;

        System.out.println("Y = " + brojY);


    }
}
