package d11_09_2023.Zadatak_02;

public class FacebookPost {
    private String opis;
    private Korisnik korisnik;
    public FacebookPost(String opis, Korisnik korisnik) {
        this.opis = opis;
        this.korisnik = korisnik;
    }
    public void print (){
        this.korisnik.print();
        System.out.println(this.opis);
    }
}
