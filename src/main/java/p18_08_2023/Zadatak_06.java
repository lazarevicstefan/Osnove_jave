package p18_08_2023;

import java.util.Scanner;

public class Zadatak_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite M: ");
        int brojM = scanner.nextInt();
        System.out.print("Unesite N: ");
        int brojN = scanner.nextInt();

        for (int i = brojM; i < brojN; i++) {
            if (!(i == brojN-1)) {
                System.out.print(i + ", ");
            }else {
                System.out.print(i);
            }
        }

    }
}