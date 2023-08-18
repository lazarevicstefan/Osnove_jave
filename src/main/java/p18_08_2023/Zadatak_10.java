package p18_08_2023;

import java.util.Scanner;

public class Zadatak_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int brojA = scanner.nextInt();
        System.out.print("Unesite b: ");
        int brojB = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            if (i >= brojA && i <= brojB){
                System.out.print("_");
            }else {
                System.out.print("*");
            }
        }


    }
}
