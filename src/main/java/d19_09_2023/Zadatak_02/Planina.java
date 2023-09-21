package d19_09_2023.Zadatak_02;

public class Planina {
    private String imePlanine;
    private String nazivDrzave;
    private int visinaPlanine;

    public Planina() {}

    public Planina(String imePlanine, String nazivDrzave, int visinaPlanine) {
        this.imePlanine = imePlanine;
        this.nazivDrzave = nazivDrzave;
        this.visinaPlanine = visinaPlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }
    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }
    public String getNazivDrzave() {
        return nazivDrzave;
    }
    public void setNazivDrzave(String nazivDrzave) {
        this.nazivDrzave = nazivDrzave;
    }
    public int getVisinaPlanine() {
        return visinaPlanine;
    }
    public void setVisinaPlanine(int visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }
}
