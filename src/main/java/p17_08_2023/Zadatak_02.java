package p17_08_2023;

import java.util.Scanner;

public class Zadatak_02 {
    public static void main(String[] args) {
        /*
            Napisati program koji sa tastature ucitava tri cela broja:
            dan
            mesec
            godina
            I formira datum u ispisu u formatu dan-mesec-godina
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dan: ");
        int dan = scanner.nextInt();
        System.out.print("Mesec: ");
        int mesec = scanner.nextInt();
        System.out.print("Godina: ");
        int godina = scanner.nextInt();

        System.out.println(dan + "-" + mesec + "-" + godina);

    }
}
