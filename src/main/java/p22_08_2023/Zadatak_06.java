package p22_08_2023;

import java.util.Scanner;

public class Zadatak_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rec = "";

        while (!rec.contains(".")) {
            System.out.print("Unesite rec: ");
            rec = scanner.next();

            if (rec.contains("zajebava") || rec.contains("mars") ||
                    rec.contains("stoko") || rec.contains("svinjo")) {
                rec = "beeeeeeeeeep";
            }

            System.out.println(rec);
        }

        System.out.println("Kraj programa");
    }
}
