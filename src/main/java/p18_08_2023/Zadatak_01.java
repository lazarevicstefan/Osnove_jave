package p18_08_2023;

import java.util.Scanner;

public class Zadatak_01 {
    public static void main(String[] args) {
        /*
        Napisati program koji sa tastature ucitava broj N i operaciju koja se
        izvrsava nad njim. Na kraju programa se ispisuje nova vrednost promenljive N.
        Ukoliko se za operaciju unese uvecaj, to uvecava promenljivu N za 1.
        Ukoliko se za operaciju unese smanji, to smanjuje promenljivu N za 1.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi N: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Unesi akciju (uvecaj/smanji): ");
        String operacija = scanner.nextLine();

        if (operacija.equals("uvecaj")){
            n += 1;
        }else if (operacija.equals("smanji")){
            n -= 1;
        }

        System.out.println("Nova vrednost za N je: " + n);
    }
}
