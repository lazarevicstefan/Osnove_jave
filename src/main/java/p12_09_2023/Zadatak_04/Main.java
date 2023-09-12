package p12_09_2023.Zadatak_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Sastojak> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite N unosa sastojaka: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Sastojak " + i + ": ");
            String sastojak = scanner.next();
            System.out.print("Cena: ");
            double cena = scanner.nextDouble();

            Sastojak trenutni = new Sastojak(sastojak,cena);
            list.add(trenutni);
        }

        for (Sastojak s : list){
            System.out.println("Sastojak: " + s.getNazivSastojka() + ", cena: " + s.getCena());

        }
    }
}
