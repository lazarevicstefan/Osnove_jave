package p12_09_2023.Zadatak_01;

public class Kupac {
    private String imePrezime;
    private ClanskaKarta clanskaKarta;
    public Kupac(String imePrezime, ClanskaKarta clanskaKarta) {
        this.imePrezime = imePrezime;
        this.clanskaKarta = clanskaKarta;
    }
    public void stampaj (){
        System.out.println(this.imePrezime + " - " + this.clanskaKarta.getBrojKartice());
    }
    public String getImePrezime() {
        return imePrezime;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public ClanskaKarta getClanskaKarta() {
        return clanskaKarta;
    }
}
