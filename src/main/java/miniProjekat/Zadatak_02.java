package miniProjekat;

import java.util.ArrayList;

public class Zadatak_02 {
    public static void main(String[] args) {
        /*
        Napišite program koji simulira prikazivanje korisnika na Slacku. Prikaz korisnika treba da se izvede tako da prvo
        budu prikazani aktivni korisnici, a potom neaktivni. Program će čuvati sledeće informacije:
        Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
        Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan. Informacije o aktivnostima biće čuvane u
        nizu gde će za svakog korisnika biti zabeleženo da li je trenutno aktivan ili ne  (true ili false).. Naravno,
        korisnik i njegova aktivnost će biti upareni po istom indeksu. To znači da će se za korisnika na poziciji N u
        nizu "korisnici" čitati aktivnost sa pozicije N u nizu "aktivnosti".

        Program će ispisivati informacije za svakog korisnika na sledeći način:
        Za aktivne korisnike:
          | slika |o Ime Prezime
        Za neaktivne korisnike:
          | slika |x Ime Prezime

        Na primer, ako je niz korisnika:
        Pera Peric
        Darko Darkovic
        Marko Markovic
        Stefan Stefanovic
        Uros Urosevic
        Milan Milanovic

        I ako su aktivnosti korisnika:

        true
        false
        true
        true
        false
        true

        Program treba da ispiše:

        | slika |o Pera Peric
        | slika |o Marko Markovic
        | slika |o Stefan Stefanovic
        | slika |o Milan Milanovic
        | slika |x Darko Darkovic
        | slika |x Uros Urosevic

         */
        ArrayList<String> nizKorisnika = new ArrayList<>();
        ArrayList<Boolean> nizAktivnosti = new ArrayList<>();

        nizKorisnika.add("Pera Peric");
        nizKorisnika.add("Darko Darkovic");
        nizKorisnika.add("Marko Markovic");
        nizKorisnika.add("Stefan Stefanovic");
        nizKorisnika.add("Uros Urosevic");
        nizKorisnika.add("Milan Milanovic");

        nizAktivnosti.add(true);
        nizAktivnosti.add(false);
        nizAktivnosti.add(true);
        nizAktivnosti.add(true);
        nizAktivnosti.add(false);
        nizAktivnosti.add(true);

        for (int i = 0; i < nizKorisnika.size(); i++) {
            if (nizAktivnosti.get(i)){
                System.out.println("|slika|o " + nizKorisnika.get(i));
            }
        }
        for (int i = 0; i < nizKorisnika.size(); i++) {
            if (!nizAktivnosti.get(i)){
                System.out.println("|slika|x " + nizKorisnika.get(i));
            }
        }
    }
}
