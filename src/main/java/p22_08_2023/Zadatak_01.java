package p22_08_2023;

import java.util.Scanner;

public class Zadatak_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj = scanner.nextInt();

        while (!(broj > 10 && broj < 50)){
            System.out.println("Greska: Broj nije u opsegu od 10 do 50.");

            System.out.print("Unesite broj: ");
            broj = scanner.nextInt();
        }
        System.out.println("Kraj");
    }
}
