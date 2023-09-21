package d19_09_2023.Zadatak_01;

import java.util.ArrayList;
import java.util.List;

public class Korpa {
    private List<Ambalaza> nizAmbalaza;

    public Korpa() {
        this.nizAmbalaza = new ArrayList<>();
    }

    public void dodajAmbalazu (Ambalaza ambalaza){
        this.nizAmbalaza.add(ambalaza);
    }
    public void izbaciAmbalazu (String barKod){
        for (int i = 0; i < this.nizAmbalaza.size(); i++) {
            if (this.nizAmbalaza.get(i).barkod.equals(barKod)){
                this.nizAmbalaza.remove(i);
            }
        }
    }
    private List<Ambalaza> vratiCenuSvihAmbalazaSaPopustom (double popust){
        List<Ambalaza> niz = new ArrayList<>();
        for (int i = 0; i < this.nizAmbalaza.size(); i++) {
            Ambalaza am = this.nizAmbalaza.get(i);
            if (am instanceof StaklenaAmbalaza){
                StaklenaAmbalaza staklenaAmbalaza = (StaklenaAmbalaza) am;
                double cena = staklenaAmbalaza.cenaArtikla();
                cena -= popust;
                staklenaAmbalaza.setOsnovnaCena(cena);
                niz.add(staklenaAmbalaza);
            }else if (am instanceof Tetrapak){
                Tetrapak tetrapak = (Tetrapak) am;
                double cena = tetrapak.cenaArtikla();
                cena -= popust;
                tetrapak.setOsnovnaCena(cena);
                niz.add(tetrapak);
            }
        }
        return niz;
    }
    public double vratiUkupnuCenuKorpe (SuperKartica superKartica){
        List<Ambalaza> artikli = vratiCenuSvihAmbalazaSaPopustom(superKartica.getPopust());
        double ukupnaCenaSaPopustom = 0;
        for (int i = 0; i < artikli.size(); i++) {
            if (artikli.get(i) instanceof StaklenaAmbalaza){
                StaklenaAmbalaza s = (StaklenaAmbalaza) artikli.get(i);
                ukupnaCenaSaPopustom += s.getOsnovnaCena();
            }else if (artikli.get(i) instanceof Tetrapak){
                Tetrapak t = (Tetrapak) artikli.get(i);
                ukupnaCenaSaPopustom += t.getOsnovnaCena();
            }
        }
        return ukupnaCenaSaPopustom;
    }
}
