package p12_09_2023.Zadatak_04;

public class Sastojak {
    private String nazivSastojka;
    private double cena;

    public Sastojak(String nazivSastojka, double cena) {
        this.nazivSastojka = nazivSastojka;
        this.cena = cena;
    }

    public String getNazivSastojka() {
        return nazivSastojka;
    }
    public void setNazivSastojka(String nazivSastojka) {
        this.nazivSastojka = nazivSastojka;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
}
