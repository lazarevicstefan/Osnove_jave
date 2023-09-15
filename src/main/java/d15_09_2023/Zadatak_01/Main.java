package d15_09_2023.Zadatak_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Igrac> igracList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.print("Ime igraca: ");
            String ime = scanner.next();
            System.out.print("JMBG igraca: ");
            String jmbg = scanner.next();
            System.out.print("Godina rodjenja: ");
            int godinaRodjenja = Integer.parseInt(scanner.next());
            System.out.print("Broj koji igrac nosi: ");
            int brojKojiIgracNosi = Integer.parseInt(scanner.next());
            System.out.print("Pozicija koju igra: ");
            String pozicijaKojuIgra = scanner.next();
            System.out.print("Da li je kapiten (true/false): ");
            boolean daLiJeKapiten = Boolean.parseBoolean(scanner.next());
            igracList.add(new Igrac(ime,jmbg,godinaRodjenja,brojKojiIgracNosi,pozicijaKojuIgra,daLiJeKapiten));
        }
        List<Trener> trenerList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.print("Ime trenera: ");
            String ime = scanner.next();
            System.out.print("JMBG trenera: ");
            String jmbg = scanner.next();
            System.out.print("Godina rodjenja: ");
            int godinaRodjenja = Integer.parseInt(scanner.next());
            System.out.print("Godine iskustva: ");
            int godineIskustva = Integer.parseInt(scanner.next());
            System.out.print("Tip trenera: ");
            String tipTrenera = scanner.next();
            trenerList.add(new Trener(ime,jmbg,godinaRodjenja,godineIskustva,tipTrenera));
        }

        for (Igrac i : igracList){
            i.stampaj();
            System.out.println();
        }
        for (Trener t : trenerList){
            t.stampaj();
            System.out.println();
        }
    }
}
