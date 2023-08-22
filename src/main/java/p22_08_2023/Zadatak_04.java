package p22_08_2023;

import java.util.Scanner;

public class Zadatak_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jacinaZvuka = 75;

        boolean play = false;
        while (!play) {
            System.out.print("Unesite akciju: ");
            String unos = scanner.next();

            if (unos.equals("pojacaj")) jacinaZvuka += 10;
            else if (unos.equals("smanji")) jacinaZvuka -= 10;
            else if (unos.equals("play")) play = true;
        }
        System.out.println("Jacina zvuka je: " + jacinaZvuka);
    }
}
