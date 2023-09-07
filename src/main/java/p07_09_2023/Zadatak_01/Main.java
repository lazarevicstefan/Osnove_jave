package p07_09_2023.Zadatak_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Racun r1 = new Racun();
        r1.ime = "Stefan";
        r1.prezime = "Lazarevic";
        r1.broj = "123-45679123-41";
        r1.stanje = 12000.00;

        Racun r2 = new Racun();
        r2.ime = "Petar";
        r2.prezime = "Petrovic";
        r2.broj = "123-4865181-41";
        r2.stanje = 4000.00;

        System.out.println("Posiljilac: " + r1.ime + " " + r1.prezime + ", " + r1.broj + ", stanje: " + r1.stanje);
        System.out.println("Primalac: " + r2.ime + " " + r2.prezime + ", " + r2.broj + ", stanje: " + r2.stanje);
        System.out.println();

        System.out.print("Unesite sumu za transakciju: ");
        double sumaZaTransakciju = scanner.nextDouble();
        r1.stanje -= sumaZaTransakciju;
        r2.stanje += sumaZaTransakciju;
        System.out.println();

        System.out.println("Stanje nakon transakcije");
        System.out.println("Posiljilac: " + r1.ime + " " + r1.prezime + ", " + r1.broj + ", stanje: " + r1.stanje);
        System.out.println("Primalac: " + r2.ime + " " + r2.prezime + ", " + r2.broj + ", stanje: " + r2.stanje);

    }
}
