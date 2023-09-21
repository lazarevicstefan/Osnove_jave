package d19_09_2023.Zadatak_02;

import java.util.ArrayList;
import java.util.List;

public class PlaninarskiDom {
    private String nazivDoma;
    private int godinaOsnivanja;
    private List<Planinar> nizPlaninara;

    public PlaninarskiDom() {
        this.nizPlaninara = new ArrayList<>();
    }

    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
        this.nizPlaninara = new ArrayList<>();
    }
    public void uclaniPlaninara (Planinar planinar){
        this.nizPlaninara.add(planinar);
    }
    public int brojPlaninaraKojiCeSePopeti (Planina planina){
        int count = 0;
        for (Planinar p : this.nizPlaninara){
            if (p.uspesanUspon(planina)){
                count++;
            }
        }
        return count;
    }
    public void izbaciPlaninara (int identifikacioniBroj){
        int index = -1;
            for (Planinar p : this.nizPlaninara){
                if (p.getIdentifikacioniBroj() == identifikacioniBroj){
                    index = this.nizPlaninara.indexOf(p);
                }
        }
            this.nizPlaninara.remove(index);
    }
    public void stamapjSvePodatke(){
        System.out.println("Naziv doma: " + this.nazivDoma + ", osnovan: " + this.godinaOsnivanja);
        for (Planinar p : this.nizPlaninara) p.stampaj();
    }
    public double izracunajMesecniPrihod (){
        double ukupno = 0;
        for (Planinar p : this.nizPlaninara){
            ukupno += p.vratiCenuClanarinePlaninara();
        }
        return ukupno;
    }

    public List<Planinar> getNizPlaninara() {
        return nizPlaninara;
    }

    public String getNazivDoma() {
        return nazivDoma;
    }

    public void setNazivDoma(String nazivDoma) {
        this.nazivDoma = nazivDoma;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }
}
