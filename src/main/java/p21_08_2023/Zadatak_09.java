package p21_08_2023;

import java.util.Scanner;

public class Zadatak_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = scanner.nextInt();
        int finBroj = 0;
        int nula = 10000;
        for (int i = 0; i < 5; i++) {
            int trenutni = broj % 10;
            finBroj = (trenutni * nula) + finBroj;
            nula = nula / 10;
            broj = broj / 10;
        }
        System.out.println(finBroj);
    }
}
