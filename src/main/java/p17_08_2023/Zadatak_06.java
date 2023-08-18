package p17_08_2023;

import java.util.Scanner;

public class Zadatak_06 {
    public static void main(String[] args) {
        /*
        Napisati program koji ucitava brojeve a, b i c sa tastature
        i za svaki broj proverava da li je validan. Ukoliko broj nije validan, ispisuje se greska za svaki broj.
        Broj nije validan ukoliko je broj negativan.

        Primer izvrsenja 1:
        Unesite a: 10
        Unesite b: -22
        Unesite c: -4
        Unet broj B=-22 nije validan
        Unet broj C=-4 nije validan
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesi broj a: ");
        int a = scanner.nextInt();
        System.out.print("Unesi broj b: ");
        int b = scanner.nextInt();
        System.out.print("Unesi broj c: ");
        int c = scanner.nextInt();


        if (a < 0) {
            System.out.println("Unet broj A=" + a + " nije validan");
        }
        if (b < 0) {
            System.out.println("Unet broj B=" + b + " nije validan");
        }
        if (c < 0) {
            System.out.println("Unet broj C=" + c + " nije validan");
        }


    }
}
