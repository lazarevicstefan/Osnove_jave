package p12_09_2023.Zadatak_03;

public class Main {
    public static void main(String[] args) {
        ViberKorisnik viberKorisnik1 = new ViberKorisnik("Stefan Lazarevic","065/154-64-64",true);
        ViberKorisnik viberKorisnik2 = new ViberKorisnik("Petar Petrovic","062/815-49-85",true);

        ViberPoruka viberPoruka1 = new ViberPoruka("Poruka koja je poslata","12/09/2023 20:46",viberKorisnik1,viberKorisnik2);
        viberPoruka1.stampa();

        System.out.println();
        viberPoruka1.reakcija("like",viberKorisnik2);
        viberPoruka1.stampa();
    }
}
