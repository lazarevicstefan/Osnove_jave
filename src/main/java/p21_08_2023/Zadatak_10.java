package p21_08_2023;

import java.util.Scanner;

public class Zadatak_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite password:  ");
        String password = scanner.nextLine();
        String prikaz = "";
        for (int i = 0; i < password.length(); i++) {
            prikaz = prikaz + "*";
        }
        System.out.println("Skriveni password: " + prikaz);
    }
}
