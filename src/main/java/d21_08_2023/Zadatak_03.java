package d21_08_2023;

import java.util.Scanner;

public class Zadatak_03 {
    public static void main(String[] args) {
        /*
        Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi N reci a program
        ispisuje svaku rec na ekranu tako da zadovolji uslov:
        ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
        ako se ne sadrzi, program dostampa na kraju
            Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima). Svaka uneta rec sa ! utice na agresivnost.
            Primer izvrsenja:
            Unesite N: 5
            Unesite tekst: Cao!
            Cao!
            Unesite tekst: Hello
            Hello!
            Unesite tekst: Hi!
            Hi!
            Unesite tekst: Cuti
            Cuti!
            Unesite tekst: Ajde!
            Ajde!
            Nivo agresivnosti 60.
            (Objasnjenje, 60% jer je od 5 unetih reci, 3 bilo sa !)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = scanner.nextInt();
        int brojacAgresivnosti = 0;
        for (int i = 0; i < n; i++) {
            String unos = scanner.next();
            if (!unos.contains("!")){
                unos += "!";
                System.out.println(unos);
            }else {
                brojacAgresivnosti++;
                System.out.println(unos);
            }
        }
        int procenatAgresivnosti = (100 / n) * brojacAgresivnosti;
        System.out.println("Nivo agresivnosti " + procenatAgresivnosti);
    }
}
