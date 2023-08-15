package p15_08_2023;

public class Zadatak_05 {
    public static void main(String[] args) {
        /*
        (Za vezbanje) Napisati program koji ima samo jednu promenljivu simbol i na osnovu te promenljive formira sledecu sliku.
        Primer izvrsenja: Ako je promenljiva simbol * (zvezdica) stampa se slika
        * * * * * *

        Primer izvrsenja ako je promenljiva simobol | (uspravna crta) stampa se slika
        | | | | | |
        */
        char starAndLine = '*';

        for (int i = 0; i < 6; i++) {
            System.out.print(starAndLine);
        }

        System.out.println();
        starAndLine = '|';

        for (int i = 0; i < 6; i++) {
            System.out.print(starAndLine);
        }
    }
}
