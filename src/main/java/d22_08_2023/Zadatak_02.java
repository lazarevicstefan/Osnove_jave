package d22_08_2023;

import java.util.Scanner;

public class Zadatak_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean zero = false;
        while (!zero){
            System.out.print("Unesite broj: ");
            int broj = scanner.nextInt();

            if (broj < 0) {
                broj *= -1;
                System.out.println("Apsolutna vrednost je: " + broj);
            }
            else if (broj == 0) zero = true;
            else System.out.println("Apsolutna vrednost je: " + broj);
        }
        System.out.println("Kraj programa jer je uneta nula");
    }
}
