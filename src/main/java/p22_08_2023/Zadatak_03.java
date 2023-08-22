package p22_08_2023;

import java.util.Scanner;

public class Zadatak_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidJedan = false;
        boolean isValidDva = false;
        boolean isValidTri = false;
        boolean isValidCetri = false;

        while (!(isValidJedan && isValidDva && isValidTri && isValidCetri)){
            System.out.print("Unesite broj: ");
            int unos = scanner.nextInt();

            if (unos == 1) isValidJedan = true;
            else if (unos == 2) isValidDva = true;
            else if (unos == 3) isValidTri = true;
            else if (unos == 4) isValidCetri = true;
        }
        System.out.println("Kraj programa");

    }
}
