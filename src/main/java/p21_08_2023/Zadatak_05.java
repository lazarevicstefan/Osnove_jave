package p21_08_2023;

import java.util.Scanner;

public class Zadatak_05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Unesite broj: ");
            int broj = scanner.nextInt();
            sum += broj;
        }
        System.out.println("Suma je: " + sum);

    }
}
