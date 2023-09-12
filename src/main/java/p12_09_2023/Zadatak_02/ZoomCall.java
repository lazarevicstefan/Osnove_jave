package p12_09_2023.Zadatak_02;

public class ZoomCall {
    private String linkZaPoziv;
    private String password;
    private Korisnik korisnikHost;
    private Korisnik korisnikGuest;

    public ZoomCall(String linkZaPoziv, String password, Korisnik korisnikHost) {
        this.linkZaPoziv = linkZaPoziv;
        this.password = password;
        this.korisnikHost = korisnikHost;
    }
    public ZoomCall(String linkZaPoziv, String password, Korisnik korisnikHost, Korisnik korisnikGuest) {
        this.linkZaPoziv = linkZaPoziv;
        this.password = password;
        this.korisnikHost = korisnikHost;
        this.korisnikGuest = korisnikGuest;
    }
    public void stampaj (){
        System.out.println("Zoom Call: " + this.linkZaPoziv);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.korisnikHost.getImePrezime());
        System.out.println("Guest: " + this.korisnikGuest.getImePrezime());
        System.out.println("Maksimalno trajanje poziva je " + this.korisnikHost.vratiDuzinuTrajanjaPoziva() + "min");

    }

    public void setKorisnikGuest(Korisnik korisnikGuest) {
        this.korisnikGuest = korisnikGuest;
    }

    public String getLinkZaPoziv() {
        return linkZaPoziv;
    }
    public String getPassword() {
        return password;
    }
    public Korisnik getKorisnikHost() {
        return korisnikHost;
    }
    public Korisnik getKorisnikGuest() {
        return korisnikGuest;
    }
}
