package d15_09_2023.Zadatak_01;

public class Igrac extends Osoba{
    private int brojKojiNosiIgrac;
    private String pozicijaKojuIgra;
    private boolean daLiJeKapiten;

    public Igrac (){}
    public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int brojKojiNosiIgrac, String pozicijaKojuIgra, boolean daLiJeKapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.brojKojiNosiIgrac = brojKojiNosiIgrac;
        this.pozicijaKojuIgra = pozicijaKojuIgra;
        this.daLiJeKapiten = daLiJeKapiten;
    }
    @Override
    public void stampaj (){
        System.out.println("=Igrac=");
        super.stampaj();
        String kapiten = this.daLiJeKapiten ? ", kapiten tima" : "";
        System.out.println("Nosi broj: " + this.brojKojiNosiIgrac + ", pozicija: " + this.pozicijaKojuIgra + kapiten);
    }

    public int getBrojKojiNosiIgrac() {
        return brojKojiNosiIgrac;
    }
    public void setBrojKojiNosiIgrac(int brojKojiNosiIgrac) {
        this.brojKojiNosiIgrac = brojKojiNosiIgrac;
    }
    public String getPozicijaKojuIgra() {
        return pozicijaKojuIgra;
    }
    public void setPozicijaKojuIgra(String pozicijaKojuIgra) {
        this.pozicijaKojuIgra = pozicijaKojuIgra;
    }
    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }
    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }
}
