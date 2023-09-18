package d15_09_2023.Zadatak_02;

import java.util.ArrayList;
import java.util.List;

public class Igrac extends Osoba{
    private int brojIgraca;
    private String pozicija;
    private List<Karton> nizKartona;
    private boolean daLiJeKapiten;

    public Igrac() {}
    public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int brojIgraca, String pozicija, boolean daLiJeKapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.brojIgraca = brojIgraca;
        this.pozicija = pozicija;
        this.nizKartona = new ArrayList<>();
        this.daLiJeKapiten = daLiJeKapiten;
    }

    public void dodajKarton (Karton karton){
        this.nizKartona.add(karton);
    }
    public int vratiZuteKartone (){
        int count = 0;
        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getTipKartona().equals("zuti")){
                count++;
            }
        }
        return count;
    }
    public int vratiCrveneKartone (){
        int count = 0;
        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getTipKartona().equals("crveni")){
                count++;
            }
        }
        return count;
    }
    @Override
    public void print (){
        super.print();

    }
    public int getBrojIgraca() {
        return brojIgraca;
    }
    public void setBrojIgraca(int brojIgraca) {
        this.brojIgraca = brojIgraca;
    }
    public String getPozicija() {
        return pozicija;
    }
    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }
    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }
    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }
}
