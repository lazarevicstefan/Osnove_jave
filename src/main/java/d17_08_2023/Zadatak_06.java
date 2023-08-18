package d17_08_2023;

import java.util.Scanner;

public class Zadatak_06 {
    public static void main(String[] args) {
        /*
        (Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d) i
        formira string p (p ima startni deo #) tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
        Hint: Potrebno je da se vrsi konkatanacija nad jednom promenljivom.
        Primer izvrsenja 1:
        Unesite a: 10  -> # 10
        Unesite b: -2   -> -2 # 10
        Unesite c: -1   -> -1 -2 # 10
        Unesite d: 9    -> -1 -2 # 10 9
        String p ime vrednost = -1 -2 # 10 9
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = scanner.nextInt();
        System.out.print("Unesite b: ");
        int b = scanner.nextInt();
        System.out.print("Unesite c: ");
        int c = scanner.nextInt();
        System.out.print("Unesite d: ");
        int d = scanner.nextInt();

        String p = "#";

        if (a >= 0) p = p + " " + a;
        else p = a + " " + p;

        if (b >= 0) p = p + " " + b;
        else p = b + " " + p;

        if (c >= 0) p = p + " " + c;
        else p = c + " " + p;

        if (d >= 0) p = p + " " + d;
        else p = d + " " + p;

        System.out.println("String p ima vrednost = " + p);
    }
}
