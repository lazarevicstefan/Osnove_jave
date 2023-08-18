package p17_08_2023;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Zadatak_01 {
    public static void main(String[] args) {
        /*
        Napisati program koji sa tastature ucitava ime, prezime, broj telefona,
        email  i jmbg korisnika prikazuje u formatu:
        [Ime] [Prezime] - [JMBG]
        Broj Tel: [Broj telefona],
        Email: [Email],

        Unesite ime: Milan
        Unesite prezime: Jovanovic
        Unesite broj: +209329832
        Unesite email: milan@gmail.com
        Unesite jmbg: 329032938923

        Milan Jovanovic - 329032938923
        Broj tel:  +209329832
        Email: milan@gmail.com
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite ime: ");
        String ime = scanner.nextLine();
        System.out.print("Unesite prezime: ");
        String prezime = scanner.nextLine();
        System.out.print("Unesite broj: ");
        String brojTelefona = scanner.nextLine();
        System.out.print("Unesite email: ");
        String email = scanner.nextLine();
        System.out.print("Unesite JMBG: ");
        String jmbg = scanner.nextLine();


        System.out.println(ime + " " + prezime + " - " + jmbg);
        System.out.println("Broj tel: " + brojTelefona);
        System.out.println("Email: " + email);
    }
}
