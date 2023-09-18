package p18_09_2023.Zadatak_03;

import java.util.ArrayList;
import java.util.List;

public class FigureGenerator {

    public Figura generator (String figura){
        if (figura.equals("trougao")){
            return new JednakostranicniTrougao(5);
        }else if (figura.equals("pravougaonik")){
            return new Pravougaonik(5,10);
        }
        return null;
    }
    public List<Figura> kreirajNTrouglove (int brojN) {
        List<Figura> nizTrouglova = new ArrayList<>();
        Figura trougao;
        for (int i = 0; i < brojN; i++) {
            trougao = new JednakostranicniTrougao();
            nizTrouglova.add(trougao);
        }
        return nizTrouglova;
    }
    public List<Figura> kreirajNPravougaonik (int brojN) {
        List<Figura> nizPravougaonik = new ArrayList<>();
        Figura pravougaonik;
        for (int i = 0; i < brojN; i++) {
            pravougaonik = new JednakostranicniTrougao();
            nizPravougaonik.add(pravougaonik);
        }
        return nizPravougaonik;
    }
    public List<Figura> kreirajNTrougaoIPravougaonik (int brojN) {
        List<Figura> niz = new ArrayList<>();
        Figura figura;
        for (int i = 0; i < brojN; i++) {
            figura = new JednakostranicniTrougao();
            niz.add(figura);
            figura = new Pravougaonik();
            niz.add(figura);
        }
        return niz;
    }
}
