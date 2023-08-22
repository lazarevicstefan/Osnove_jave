package d22_08_2023;

import java.util.Scanner;

public class Zadatak_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Unesite vrednost: ");
            int broj = scanner.nextInt();

            if ((sum + broj) > 100) {
                System.out.print("Prekoracenje! ");
                isValid = true;
            } else {
                sum += broj;
            }
        }
        System.out.println("Kraj programa. Sracunata suma je: " + sum);

    }
}
