package d14_09_2023.Zadatak_01;

public class Main {
    public static void main(String[] args) {
        /*
        Napisati klasu Student koja ima
        broj indeksa
        ime i prezime
        tip studija (osnovne, master, doktorske)
        niz ispita
        konstuktore koje mislite da ce vam trebati
        gettere i settere za indeks, ime i prezime, tip studija
        getter za niz predmeta
        metodu dodaj ispit u niz ispita
        metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
        metodu stampaj koja stampa u formatu:
        (broj indeksa) - (ime i prezime) - (tip studija)
        Predmeti:
        (naziv predmeta) - (profesor) - (ocena)
        (naziv predmeta) - (profesor) - (ocena)
        (naziv predmeta) - (profesor) - (ocena)
        Prosecna ocena: (prosecna ocena)


        Napisati klasu Ispit koja ima
        naziv predmeta
        ocenu (u rasponu od 5 do 10)
        Ime i prezime profesora koji predaje predmet
        konstuktore koje mislite da ce vam trebati
        gettere i settere za sve atribute
        metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
        metodu koja stampa ispit u formatu:
        (naziv predmeta) - (profesor) - (ocena)
         */
        Student student = new Student("153/23","Stefan Lazarevic", "Master");
        Ispit ispit = new Ispit("Java programiranje", 10, "Pera Peric");
        Ispit ispit2 = new Ispit("DB programiranje", 9, "Pera Peric");
        Ispit ispit3 = new Ispit("C programiranje", 5, "Pera Peric");

        student.dodajIspit(ispit);
        student.dodajIspit(ispit2);
        student.dodajIspit(ispit3);
        student.stampaj();
    }
}
