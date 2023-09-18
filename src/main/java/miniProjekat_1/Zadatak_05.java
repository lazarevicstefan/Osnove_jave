package miniProjekat_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak_05 {
    public static void main(String[] args) {
        /*
        Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda,
        a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju
        različitih metoda za generisanje karaktera i passworda.

        generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji
        predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i
        vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.

        generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz
        stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz
        niza i vraća ga kao string. Ova metoda nema ulazne parametre.

        generisiPassword: Ova metoda generiše password željene dužine. Metoda prima dva parametra: dužinu željenog
        passworda i informaciju da li treba sadržati specijalan karakter. Ova metoda koristi prethodne dve metode kako
        bi kreirala password. Ukoliko treba dodati specijalan karakter, on se dodaje na kraju passworda.

        Napomena: Metode generisiPassword generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!

        Glavni program:
           - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
           - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.

        Primer izvršenja 1:
        Unesite dužinu passworda: 10
        Da li želite da sadrži specijalan karakter: true
        Generisan password: eD9Kx0e@

        Primer izvršenja 2:
        Unesite dužinu passworda: 10
        Da li želite da sadrži specijalan karakter: false
        Generisan password: eCxdwEeFEx

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite duzinu passworda: ");
        int duzina = scanner.nextInt();
        System.out.print("Da li zelite da sadrzi specijalan karakter: ");
        boolean specijalniKarakter = Boolean.parseBoolean(scanner.next());

        String password = generisiPassword(duzina,specijalniKarakter);
        System.out.print("Generisan password: " + password);
    }
    public static String generisiPassword(int duzina,boolean specijalniKarakter){
        String specijalni = "";
        if (specijalniKarakter){
            duzina--;
            specijalni = generisiRandomSpecijalanKarakter();
        }

        String password = "";
        for (int i = 0; i < duzina; i++) {
            password += generisiRandomKarakter();
        }
        return password + specijalni;
    }
    public static String generisiRandomKarakter(){
        Random random = new Random();
        ArrayList<String> karakter = new ArrayList<>();

        karakter.add("A"); karakter.add("a");
        karakter.add("B"); karakter.add("b");
        karakter.add("C"); karakter.add("c");
        karakter.add("D"); karakter.add("d");
        karakter.add("E"); karakter.add("e");
        karakter.add("F"); karakter.add("f");
        karakter.add("G"); karakter.add("g");
        karakter.add("H"); karakter.add("h");
        karakter.add("I"); karakter.add("i");
        karakter.add("J"); karakter.add("j");
        karakter.add("K"); karakter.add("k");
        karakter.add("L"); karakter.add("l");
        karakter.add("M"); karakter.add("m");
        karakter.add("N"); karakter.add("n");
        karakter.add("O"); karakter.add("o");
        karakter.add("P"); karakter.add("p");
        karakter.add("Q"); karakter.add("q");
        karakter.add("R"); karakter.add("r");
        karakter.add("S"); karakter.add("s");
        karakter.add("T"); karakter.add("t");
        karakter.add("U"); karakter.add("u");
        karakter.add("V"); karakter.add("v");
        karakter.add("W"); karakter.add("w");
        karakter.add("X"); karakter.add("x");
        karakter.add("Y"); karakter.add("y");
        karakter.add("Z"); karakter.add("z");

        karakter.add("0"); karakter.add("1");
        karakter.add("2"); karakter.add("3");
        karakter.add("4"); karakter.add("5");
        karakter.add("6"); karakter.add("7");
        karakter.add("8"); karakter.add("9");
        int rand = random.nextInt(0,karakter.size());
        return karakter.get(rand);
    }
    public static String generisiRandomSpecijalanKarakter (){
        Random random = new Random();
        ArrayList<String> specijalniKarakter = new ArrayList<>();

        specijalniKarakter.add("@");
        specijalniKarakter.add("#");
        specijalniKarakter.add("&");
        specijalniKarakter.add("*");
        specijalniKarakter.add("!");

        int rand = random.nextInt(0,specijalniKarakter.size());
        return specijalniKarakter.get(rand);
    }
}
