package d21_08_2023;

import java.util.Scanner;

public class Zadatak_04 {
    public static void main(String[] args) {
        /*
        Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
        Program podrzava sledece reakcije:
        like
        smile
        heart

            Primer izvrsenja:
        Unesite N: 7
            Reaguj: like
            Reaguj: heart
            Reaguj: smile
            Reaguj: lol
            Reaguj: smile
            Reaguj: like
            Reaguj: like
        Summary: like 3 | smile 2 | heart 1
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = scanner.nextInt();
        int countLike = 0;
        int countSmile = 0;
        int countHeart = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Reaguj: ");
            String unos = scanner.next();
            if (unos.equals("like")) countLike++;
            else if (unos.equals("smile")) countSmile++;
            else if (unos.equals("heart")) countHeart++;
        }
        System.out.println("Summary: like " + countLike + " | smile " + countSmile + " | heart " + countHeart);
    }
}
