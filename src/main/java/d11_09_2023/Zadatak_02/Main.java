package d11_09_2023.Zadatak_02;

public class Main {
    public static void main(String[] args) {
        Korisnik korisnik = new Korisnik("Pera", "Peric");
        Korisnik korisnik2 = new Korisnik("Sima");

        FacebookPost facebookPost = new FacebookPost("Neka objava!", korisnik);
        facebookPost.print();

        FacebookPost facebookPost2 = new FacebookPost("Neka druga objava!", korisnik2);
        facebookPost2.print();
    }
}
