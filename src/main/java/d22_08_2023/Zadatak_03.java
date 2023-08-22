package d22_08_2023;

import java.util.Scanner;

public class Zadatak_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean end = false;
        while (!end) {
            int arapskiBroj = 0;
            System.out.print("Unesite rimski broj: ");
            String rimskiBroj = scanner.next();
            if (rimskiBroj.equals("KRAJ")) {
                end = true;
            } else {
                if (rimskiBroj.equals("I")) arapskiBroj = 1;
                else if (rimskiBroj.equals("V")) arapskiBroj = 5;
                else if (rimskiBroj.equals("X")) arapskiBroj = 10;
                else if (rimskiBroj.equals("L")) arapskiBroj = 50;
                else if (rimskiBroj.equals("C")) arapskiBroj = 100;
                else if (rimskiBroj.equals("D")) arapskiBroj = 500;
                else if (rimskiBroj.equals("M")) arapskiBroj = 1000;
                System.out.println("Arapski: " + arapskiBroj);
            }
        }
        System.out.println("Kraj programa");
    }
}
