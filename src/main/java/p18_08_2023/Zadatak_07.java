package p18_08_2023;

import java.util.Scanner;

public class Zadatak_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite jacinu zvuka: ");
        int jacinaZvuka = scanner.nextInt();

        if (jacinaZvuka == 0) {
            System.out.println("</");
        }else {
            System.out.print("<");
            for (int i = 0; i <= jacinaZvuka; i++) {
                System.out.print("|");
            }
        }

    }
}