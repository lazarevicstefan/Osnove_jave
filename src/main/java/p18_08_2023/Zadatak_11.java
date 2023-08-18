package p18_08_2023;

import java.util.Scanner;

public class Zadatak_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite duzinu videa: ");
        int duzina = scanner.nextInt();

        System.out.print("Unestite trenutno vreme videa: ");
        int trenutnoVreme = scanner.nextInt();

        int duzinaZvezdica = (int) Math.floor(((double) 100 / duzina) * trenutnoVreme); // zaokruziti na floor

        System.out.println(duzinaZvezdica);
        for (int i = 1; i <= 100 ; i++) {
            if (i <= duzinaZvezdica){
                System.out.print("*");
            }else {
                System.out.print("_");
            }

        }
    }
}
