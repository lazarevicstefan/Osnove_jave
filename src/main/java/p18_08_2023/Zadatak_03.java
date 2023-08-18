package p18_08_2023;

import java.util.Scanner;

public class Zadatak_03 {
    public static void main(String[] args) {
        /*
        Napisati program koji ispisuje za uneti broj a da li je deljiv sa 2 ili sa 3.Ispisati poruke na kraju programa u obe situacije.
        Upoznajte se sa opertorom moduo % dok ne dodjemo do tog operatora.
        HINT: Broj B je deljiv brojem A ukoliko je ostatak pri deljenju sa A jedan nuli.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj N: ");
        int n = scanner.nextInt();

        if (n % 2 == 0){
            System.out.println("Broj je deljiv sa 2");
        }else if (n % 2 == 1){
            System.out.println("Broj je deljiv sa 3");
        }
    }
}
