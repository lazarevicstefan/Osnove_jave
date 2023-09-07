package Java_Test_1;

import java.util.Scanner;

public class Zadatak_01 {
    public static void main(String[] args) {
        /*
        Napišite program koji simulira softver za upoznavanje stvoren posebno za žene, pružajući im priliku da upoznaju muškarca svojih snova. U prvoj verziji programa,
        ženama je ponuđeno pet faktora prema kojima mogu odabrati svog idealnog muškarca. Ovi faktori uključuju:
         Visina muškarca u određenom rasponu.
         Grad iz kojeg bi trebao biti muškarac.
         Starost muškarca u određenom rasponu.
         Boja kose muškarca.
         Prisustvo brade kod muškarca.

        Program na početku traži od korisnica da unesu kriterijume koje žele kod svog idealnog partnera, a zatim i informacije o muškarcu kojeg žele upoznati.
        Na kraju, program će izbaciti rezultat da li su dvoje kompatibilni ili ne. Dvoje se smatraju kompatibilnima ako muškarac zadovoljava barem tri od pet faktora koje su žene definisale.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite kriterijume za traženje vašeg idealnog muškarca");
        System.out.print("Min visina: ");
        int minVisina = scanner.nextInt();
        System.out.print("Max visina: ");
        int maxVisina = scanner.nextInt();
        System.out.print("Mesto: ");
        String mestoKriterijum = scanner.next();
        System.out.print("Min starost: ");
        int minStarost = scanner.nextInt();
        System.out.print("Max starost: ");
        int maxStarost = scanner.nextInt();
        System.out.print("Boja kose: ");
        String bojaKoseKriterijum = scanner.next();
        System.out.print("Potrebno je da ima bradu: ");
        boolean imaBraduKriterijum = scanner.nextBoolean();


        System.out.println();
        System.out.println("Unesite karakteristike muškarca: ");
        System.out.print("Visina: ");
        int visina = scanner.nextInt();
        System.out.print("Mesto: ");
        String mesto = scanner.next();
        System.out.print("Starost: ");
        int starost = scanner.nextInt();
        System.out.print("Boja kose: ");
        String bojaKose = scanner.next();
        System.out.print("Nosi bradu: ");
        boolean imaBradu = scanner.nextBoolean();


        int brojacKriterijuma = 0;
        if (minVisina <= visina && maxVisina >= visina) {
            brojacKriterijuma++;
        }
        if (mestoKriterijum.equals(mesto)) {
            brojacKriterijuma++;
        }
        if (minStarost <= starost && maxStarost >= starost) {
            brojacKriterijuma++;
        }
        if (bojaKoseKriterijum.equals(bojaKose)) {
            brojacKriterijuma++;
        }
        if (imaBraduKriterijum == imaBradu) {
            brojacKriterijuma++;
        }


        if (brojacKriterijuma >= 3) {
            System.out.println("Pronašli ste svog idealnog muškarca!");
        } else {
            System.out.println("Muškarac ne ispunjava vaše zahteve.");
        }
    }
}
