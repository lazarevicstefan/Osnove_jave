package p22_08_2023;

import java.util.Scanner;

public class Zadatak_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countExit = 0;

        while (countExit != 2) {
            System.out.print("Unesite broj: ");
            int unos = scanner.nextInt();
            if (unos == 0) {
                countExit++;
            }
        }
        System.out.println("Kraj programa jer je uneto 2 nule.");
    }
}
