package p17_08_2023;

import java.util.Scanner;

public class Zadatak_08 {
    public static void main(String[] args) {
        /*
        Zadatak
        Napisati program koji ucitava stranice trougla a, b i c i ispisuje da li je trougao pravougli.
        Trougao je pravougli ako je

        a*a + b*b = c*c

        Primer izvrsenja 1:
        Unesite a: 3
        Unesite b: 4
        Unesite c: 5
        Trougao je pravougli
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = scanner.nextInt();
        System.out.print("Unesite b: ");
        int b = scanner.nextInt();
        System.out.print("Unesite c: ");
        int c = scanner.nextInt();

        if (((a * a) + (b * b) == (c * c))){
            System.out.println("Trougao je pravougaoni");
        }else {
            System.out.println("Trougao nije pravougaoni");
        }
    }
}
