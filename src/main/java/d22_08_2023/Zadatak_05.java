package d22_08_2023;

import java.util.Scanner;

public class Zadatak_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLeft = 0;
        int countRight = 0;

        String input = "";
        while (!input.equals("=")) {
            System.out.print("Unos: ");
            input = scanner.next();
            if (input.equals("(")) countLeft++;
            else if (input.equals(")")) countRight++;
        }
        if (countLeft == countRight) System.out.println("Zagrade su uparene");
        else System.out.println("Zagrade nisu uparene");
    }
}
