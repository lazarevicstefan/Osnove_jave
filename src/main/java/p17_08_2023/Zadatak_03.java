package p17_08_2023;

import java.util.Scanner;

public class Zadatak_03 {
    public static void main(String[] args) {
        /*
        Napisati program koji sa tastature ucitava tri broja a, b i c i
        ispisuje srednju vrednost za ta tri broja. Sve promenljive u programu su po tipu double
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesi broj a: ");
        double a = scanner.nextDouble();
//        System.out.print("Unesi broj a b i c: ");
//        String[] a = scanner.nextLine().split("\s+");
        System.out.print("Unesi broj b: ");
        double b = scanner.nextDouble();
        System.out.print("Unesi broj c: ");
        double c = scanner.nextDouble();

        double srednjaVrednost = (a + b + c) / 3;
//        double srednjaVrednost = (Double.parseDouble(a[0]) + Double.parseDouble(a[1]) + Double.parseDouble(a[2])) / 3;
        System.out.printf("Srednja vrednost je: " + srednjaVrednost);




    }
}
