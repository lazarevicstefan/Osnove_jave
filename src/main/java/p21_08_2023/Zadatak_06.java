package p21_08_2023;

import java.util.Scanner;

public class Zadatak_06 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int trenutni = scanner.nextInt();
            sum = (sum  * 10) + trenutni;
        }
        System.out.println(sum);
    }
}
