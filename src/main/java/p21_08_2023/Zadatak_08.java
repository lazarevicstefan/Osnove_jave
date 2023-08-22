package p21_08_2023;

import java.util.Scanner;

public class Zadatak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uensite broj: ");
        int broj = scanner.nextInt();
        String fin = "";
        while (broj != 0){
            int trenutni = broj % 10;
            System.out.print(trenutni + ", ");
            broj = broj /10;
        }

    }
}
