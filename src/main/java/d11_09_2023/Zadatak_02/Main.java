package d11_09_2023.Zadatak_02;

public class Main {
    public static void main(String[] args) {
        /*
        Zadatak
        Kreirati klasu Korisnik koja ima
        ime
        prezime
        gettere i settere za ime i prezime
        konstuktore koje mislite da su vam potrebni
        metoda koja stampa u formatu:
        (ime) (prezime)

        Kreirati klasu FacebookPost
        opis
        korisnik (referenca na korisnika koji je kreirao post)
        konstrukore koje mislite da su vam potrebni
        metoda print, stampa u formatu:
        (ime) (prezime)
        (opis post-a)

        U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda
        */
        Korisnik korisnik = new Korisnik("Pera", "Peric");
        Korisnik korisnik2 = new Korisnik("Sima");

        FacebookPost facebookPost = new FacebookPost("Neka objava!", korisnik);
        facebookPost.print();

        FacebookPost facebookPost2 = new FacebookPost("Neka druga objava!", korisnik2);
        facebookPost2.print();
    }
}
