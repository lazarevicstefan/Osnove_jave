package Java_Test_1;

import java.util.Random;
import java.util.Scanner;

public class Zadatak_03 {
    public static void main(String[] args) {
        /*
        Napišite program koji simulira popularnu igricu "Veće-Manje". Cilj igre je da korisnik pogodi tajni broj u što manje pokušaja.
        Program će automatski izabrati nasumičan broj u opsegu od 1 do 50, a korisniku će biti dozvoljeno da pokuša da pogodi taj broj najviše 5 puta.
        Nakon svakog pokušaja, korisnik će dobiti povratnu informaciju da li je uneti broj manji ili veći od tajnog broja. Igra će trajati sve dok
        korisnik ne pogodi tajni broj ili dok ne iskoristi sve pokušaje.
        */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomBroj = random.nextInt(1,51);
        int brojac = 0;
        boolean pronadjenBroj = false;

        while (brojac < 5 && !pronadjenBroj){
            System.out.print("Unesite broj: ");
            int trenutniBroj = scanner.nextInt();

            if (trenutniBroj == randomBroj){
                System.out.println("Čestitamo, pogodili ste tajni broj!");
                pronadjenBroj = true;
            }else if (randomBroj > trenutniBroj){
                System.out.println("Tajni broj je veći.");
            }else{
                System.out.println("Tajni broj je manji");
            }
            brojac++;
        }
        if (brojac == 5 && !pronadjenBroj){
            System.out.println("Kraj igre! Niste pogodili tajni broj u 5 pokušaja.");
        }

    }
}
