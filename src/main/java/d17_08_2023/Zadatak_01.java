package d17_08_2023;

import java.util.Scanner;

public class Zadatak_01 {
    public static void main(String[] args) {
        /*
        Napisati program koji ima informacije koje ucitava informacije sa tastature:
        Ime
        Prezime
        godinu rodjenja
        I stampa informaicije u formatu:
        [ime] [prezime] - [startost] god

        Primer izvrsenja:
        Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
        Milan Jovanovic - 26 god
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = scanner.nextLine();
        System.out.print("Unesite prezime: ");
        String prezime = scanner.nextLine();
        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = scanner.nextInt();

        System.out.println(ime + " " + prezime + " - " + (2023 - godinaRodjenja) + " god");
    }
}
