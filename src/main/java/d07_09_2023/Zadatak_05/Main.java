package d07_09_2023.Zadatak_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Oprema o1 = new Oprema();
        System.out.print("Unesite tip opreme 1: ");
        o1.tip = scanner.next();
        System.out.print("Unesite marku opreme 1: ");
        o1.marka = scanner.next();
        System.out.println("Unesite cenu 1: ");
        o1.cena = scanner.nextInt();

        Oprema o2 = new Oprema();
        System.out.print("Unesite tip opreme 2: ");
        o2.tip = scanner.next();
        System.out.print("Unesite marku opreme 2: ");
        o2.marka = scanner.next();
        System.out.println("Unesite cenu 2: ");
        o2.cena = scanner.nextInt();

        Oprema o3 = new Oprema();
        System.out.print("Unesite tip opreme 3: ");
        o3.tip = scanner.next();
        System.out.print("Unesite marku opreme 3: ");
        o3.marka = scanner.next();
        System.out.println("Unesite cenu 3: ");
        o3.cena = scanner.nextInt();

        System.out.println(o1.tip + " " + o1.marka + " " + o1.cena);
        System.out.println(o2.tip + " " + o2.marka + " " + o2.cena);
        System.out.println(o3.tip + " " + o3.marka + " " + o3.cena);
    }
}
