package d19_09_2023.Zadatak_02;

public class RekreativniPlaninar extends Planinar {
    private int tezinaOpreme;
    private String nazivOkruga;
    private int maksimalniUsponPlaninarSavlada;


    public RekreativniPlaninar(int identifikacioniBroj, String imePrezimePlaninara, int tezinaOpreme, String nazivOkruga, int maksimalniUsponPlaninarSavlada) {
        super(identifikacioniBroj, imePrezimePlaninara);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maksimalniUsponPlaninarSavlada = maksimalniUsponPlaninarSavlada;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + this.identifikacioniBroj);
        System.out.println("Ime: " + this.imePrezimePlaninara);
        System.out.println("Okrug: " + this.nazivOkruga);
    }

    @Override
    public double vratiCenuClanarinePlaninara() {
        return 1000.0;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        this.maksimalniUsponPlaninarSavlada -= this.tezinaOpreme * 50;
        if (this.maksimalniUsponPlaninarSavlada < planina.getVisinaPlanine()){
            return true;
        }else {
            return false;
        }
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public int getMaksimalniUsponPlaninarSavlada() {
        return maksimalniUsponPlaninarSavlada;
    }
}
