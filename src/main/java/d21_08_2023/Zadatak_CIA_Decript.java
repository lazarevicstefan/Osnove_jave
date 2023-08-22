package d21_08_2023;

import java.util.Scanner;

public class Zadatak_CIA_Decript {
    public static void main(String[] args) {
        /*
        CIA je uspela da desifruje poruke hakerkse organizacije koju prati.
        Hakerska organizacija kriptuje poruke u int tako sto svaka poruka ima 10cifara(5 karaktera). Konvencijom je ustaljeno da se slova kriptuju u dvocifrene brojeve:
        A se kriptuje u 11
        B se kriptuje u 12
        …
        Z se kriptuje u 36
        Bilo koji drugi dvocifren broj se kriptuje u razmak.
        Napisati program koji dekeiptuje poruke hakerske organizacije.

        Unos: 10 cifre razmak 10 cifre razmak ...

        Poruka koja presretnuta je
        2526152811 1319201188 2015763188 3025213198
        OPERACIJA JE U TOKU
         */
        Scanner scanner = new Scanner(System.in);
        String[] deloviUnos = scanner.nextLine().split(" ");
        for (String trenutni : deloviUnos){
            for (int i = 0; i < trenutni.length(); i += 2) {
                String slovo = trenutni.substring(i,i+2);

                int slovoBroj = Integer.parseInt(slovo);
                if (slovoBroj >= 11 && slovoBroj <= 36){
                    int b = slovoBroj + 54;
                    System.out.print((char) b);
                }else System.out.print(" ");
            }
        }
    }
}
