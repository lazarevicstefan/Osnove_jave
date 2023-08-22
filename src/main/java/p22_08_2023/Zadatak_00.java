package p22_08_2023;

import java.util.Scanner;

public class Zadatak_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int broj = -1;

        while (broj != 0){
            System.out.print("Unesite broj: ");
            broj = scanner.nextInt();
        }
    }
}
