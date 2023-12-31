package p12_09_2023.Zadatak_01;

public class Proizvod {
    private String naziv;
    private Kupac kupac;
    private double cenaIzrade;
    public Proizvod(String naziv, Kupac kupac, double cenaIzrade) {
        this.naziv = naziv;
        this.kupac = kupac;
        this.cenaIzrade = cenaIzrade;
    }
    public double racunanjeCeneProizvoda (){
        return this.cenaIzrade * 1.9 * (100 - this.kupac.getClanskaKarta().getPopust()) / 100;
    }
    public void stampaj (){
        System.out.println(this.naziv + " - " + this.racunanjeCeneProizvoda());
        System.out.println(this.kupac.getImePrezime() + " - " + this.kupac.getClanskaKarta().getBrojKartice());
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public Kupac getKupac() {
        return kupac;
    }
    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }
    public double getCenaIzrade() {
        return cenaIzrade;
    }
    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }
}
