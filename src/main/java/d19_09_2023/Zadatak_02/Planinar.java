package d19_09_2023.Zadatak_02;

public abstract class Planinar {
    protected int identifikacioniBroj;
    protected String imePrezimePlaninara;

    public Planinar(int identifikacioniBroj, String imePrezimePlaninara) {
        this.identifikacioniBroj = identifikacioniBroj;
        this.imePrezimePlaninara = imePrezimePlaninara;
    }

    public abstract void stampaj ();
    public abstract double vratiCenuClanarinePlaninara ();
    public abstract boolean uspesanUspon (Planina planina);
    public int getIdentifikacioniBroj() {
        return identifikacioniBroj;
    }
    public String getImePrezimePlaninara() {
        return imePrezimePlaninara;
    }
}
