package d07_09_2023.Zadatak_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Film f1 = new Film();
        System.out.print("Unesite naslov Filma 1:");
        f1.naslov = scanner.next();
        System.out.print("Unesite godinu izdanja Filma 1: ");
        f1.godinaIzdanja = scanner.nextInt();
        System.out.print("Unesite ime rezisera Filma 1:");
        f1.reziser = scanner.next();

        Film f2 = new Film();
        System.out.print("Unesite naslov Filma 2:");
        f2.naslov = scanner.next();
        System.out.print("Unesite godinu izdanja Filma 2: ");
        f2.godinaIzdanja = scanner.nextInt();
        System.out.print("Unesite ime rezisera Filma 2:");
        f2.reziser = scanner.next();

        Film f3 = new Film();
        System.out.print("Unesite naslov Filma 3:");
        f3.naslov = scanner.next();
        System.out.print("Unesite godinu izdanja Filma 3: ");
        f3.godinaIzdanja = scanner.nextInt();
        System.out.print("Unesite ime rezisera Filma 3:");
        f3.reziser = scanner.next();

        System.out.println("Naziv filma: " + f1.naslov + ", godina izdanja: " + f1.godinaIzdanja + ", Reziser: " + f1.reziser);
        System.out.println("Naziv filma: " + f2.naslov + ", godina izdanja: " + f2.godinaIzdanja + ", Reziser: " + f2.reziser);
        System.out.println("Naziv filma: " + f3.naslov + ", godina izdanja: " + f3.godinaIzdanja + ", Reziser: " + f3.reziser);

    }
}
