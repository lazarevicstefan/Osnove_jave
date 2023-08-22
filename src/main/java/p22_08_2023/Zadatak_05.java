package p22_08_2023;

import java.util.Scanner;

public class Zadatak_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = false;
        int count = 0;

        while (!isValid && count != 5) {
            System.out.print("Unesite expected: ");
            String expected = scanner.next();

            System.out.print("Unesite actual: ");
            String actual = scanner.next();

            if(!expected.equals(actual)) {
                System.out.println("Test failed: Expected " + expected + " but got " + actual + ".");
                isValid = true;
            }else {
                count++;
            }
        }
        if (count == 5){
            System.out.println("Test passed.");
        }
    }
}
