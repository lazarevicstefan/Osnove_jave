package p21_08_2023;

import java.util.Scanner;

public class Zadatak_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int trenutni = scanner.nextInt();
            if (trenutni % 2 == 0) count++;
        }
        System.out.println("Uneto je " + count + " parna broja.");
    }
}
