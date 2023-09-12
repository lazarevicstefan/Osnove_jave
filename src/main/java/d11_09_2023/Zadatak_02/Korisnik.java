package d11_09_2023.Zadatak_02;

public class Korisnik {
    private String ime;
    private String prezime;

    public Korisnik(String ime) {
        this.ime = ime;
    }
    public Korisnik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
    public void print (){
        if (this.prezime != null) {
            System.out.println(this.ime + " " + this.prezime);
        }else {
            System.out.println(this.ime);
        }
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}
