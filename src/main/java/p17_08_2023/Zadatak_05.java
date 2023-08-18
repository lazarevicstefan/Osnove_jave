package p17_08_2023;

import java.util.Scanner;

public class Zadatak_05 {
    public static void main(String[] args) {
        /*
        Napisati program koji ucitava brojeve a, b i c sa tastature i proverava da li je broj a u opsegu od b do c.
        Primer izvrsenja:
        Unesite b: 5
        Uneiste c: 50
        Unesite a: 15
        A je u opstegu izmedju 5 i 50
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesi b: ");
        int b = scanner.nextInt();
        System.out.print("Unesi c: ");
        int c = scanner.nextInt();
        System.out.print("Unesi a: ");
        int a = scanner.nextInt();

        if (a > b && a < c){
            System.out.println("A je u opsegu izmedju " + b + " i " + c);
        }


    }
}
