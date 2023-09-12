package p12_09_2023.Zadatak_02;

public class Main {
    public static void main(String[] args) {
        Korisnik korisnikHost = new Korisnik("Stefan Lazarevic");
        Korisnik korisnikGuest = new Korisnik("Petar Petrovic");
        korisnikHost.preplatiSe(100);
        korisnikHost.stampaj();

        korisnikGuest.preplatiSe(150);
        korisnikGuest.ponistiPreplatu();

        ZoomCall zoomCall = new ZoomCall("http://zoomcall.com/1tfef32ce3","1tfef32ce3",korisnikHost);
        zoomCall.setKorisnikGuest(korisnikGuest);
        zoomCall.stampaj();


    }
}
