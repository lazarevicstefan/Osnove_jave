package d12_09_2023.Zadatak_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Kreirati klasu ZeleniKarton koja ima:
        ime i prezime studenta
        broj indeksa
        naziv predmeta
        ime i prezime profesora
        ocenu - od 5 do 10
        gettere i settere
        konstruktore
        metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
        metodu stampaj koja stampa podatke u formatu:
                (naziv predmeta) - (ocena)
                Student: ime i prezime, broj indeksa
                Profesor: ime i prezime

            U glavnoj klasi:
        kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
        Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
        (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo za polozene ispite
        */
        List<ZeleniKarton> list = new ArrayList<>();
        list.add(new ZeleniKarton("Stefan Lazarevic",48923,"Java Programiranje","Milan Milovanovic",10));
        list.add(new ZeleniKarton("Pera Peric",52323,"JS Programiranje","Dusan Dusanovic",6));
        list.add(new ZeleniKarton("Mika MIkic",84523,"Java Programiranje","Zeljko Stankovic",7));
        list.add(new ZeleniKarton("Zika Zikic",12423,"C# Programiranje","Milan Milovanovic",5));
        list.add(new ZeleniKarton("Ana Jovic",49723,"Kotlin Programiranje","Petar Petrovic",8));



        stampajListu(list);
        prosek(list);
        prosekKojiSuPolozili(list);

    }
    public static void stampajListu (List<ZeleniKarton> list){
        for (ZeleniKarton zk : list){
            zk.stampaj();
            System.out.println();
        }
    }
    public static void prosekKojiSuPolozili (List<ZeleniKarton> list){
        double prosek = 0.0;
        int brojac = 0;
        for (ZeleniKarton zk : list){
            if (zk.getOcena() > 5){
                prosek += zk.getOcena();
                brojac++;
            }
        }
        prosek = prosek / brojac;
        System.out.println("Prosek onih koji su polozili: " + prosek + " (" + brojac + "/" + list.size() + ")");

    }
    public static void prosek (List<ZeleniKarton> list){
        double prosek = 0.0;
        for (ZeleniKarton zk : list){ prosek += zk.getOcena(); }
        prosek = prosek / list.size();
        System.out.println("Prosek: " + prosek);

    }
}
