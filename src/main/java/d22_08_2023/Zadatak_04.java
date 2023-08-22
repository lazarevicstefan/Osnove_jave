package d22_08_2023;

import java.util.Scanner;

public class Zadatak_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTWO = 0;
        int countONE = 0;

        while (countTWO != 2 && countONE != 3){
            System.out.print("Unesite number: ");
            int number = scanner.nextInt();
            if (number == 1) countONE++;
            else if (number == 2) countTWO++;
        }
        System.out.println("Kraj programa");

    }
}
