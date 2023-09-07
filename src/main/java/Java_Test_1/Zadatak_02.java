package Java_Test_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak_02 {
    public static void main(String[] args) {
        /*
        Napišite program koji vrši validaciju udaljenosti između dalekovoda kako bi se utvrdilo da li udaljenosti ispunjavaju propisane standarde Evropske unije.

        Korisnik unosi udaljenosti između dalekovoda, a te informacije program smešta u niz brojeva. Korisnik unosi N udaljenosti dalekovoda, gde je N unos korisnika.

        Nakon unosa udaljenosti, program će prikazati grafički prikaz udaljenosti između svaka dva dalekovoda. Zatim, program proverava da li rastojanje između dva
        dalekovoda ispunjava standarde, pri čemu standardi za udaljenosti između dalekovoda važe ako su udaljenosti unutar opsega od 50 do 100 metara.
        Ukoliko neka udaljenost ne ispunjava ove standarde, korisniku će se prikazati poruka o neispravnoj udaljenosti.

        Na kraju izvršenja programa, program će izračunati ukupnu dužinu kablova potrebnu za celu dalekovodnu infrastrukturu. Dužina kabla između dva dalekovoda
        iznosi 1.5 puta udaljenost između dalekovoda.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = scanner.nextInt();
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite rastojanje: ");
            lista.add(scanner.nextInt());
        }

        System.out.print("|");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("... " + lista.get(i) + "m ...|");
        }
        System.out.println();

        for (int i = 0; i < lista.size(); i++) {
            if (!(lista.get(i) >= 50 && lista.get(i) <= 100)) {
                System.out.println("Rastojanje na poziciji " + i + ", dužine " + lista.get(i) + "m nije po standardima Evropske unije.");
            }
        }

        double ukupnaDuzinaKablova = 0.0;
        for (int i = 0; i < lista.size(); i++) {
            ukupnaDuzinaKablova += lista.get(i) * 1.5;
        }
        System.out.println("Potrebna dužina kablova za dalekovodnu infrastrukturu je " + ukupnaDuzinaKablova + "m.");

    }
}
