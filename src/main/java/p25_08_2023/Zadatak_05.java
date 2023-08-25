package p25_08_2023;

import java.util.Scanner;

public class Zadatak_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite M: ");
        int m = scanner.nextInt();

        for (int i = 1; i <= m; i++) {
            printStars(i);
        }
    }

    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

