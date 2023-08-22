package p21_08_2023;

import java.util.Scanner;

public class Zadatak_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite password: ");
            String trenutni = scanner.next();
            int poen = 0;

            if (trenutni.length() > 8) poen++;
            if (trenutni.contains("@")) poen++;

            System.out.println("Password ima " + poen + " poena.");
        }
    }
}
