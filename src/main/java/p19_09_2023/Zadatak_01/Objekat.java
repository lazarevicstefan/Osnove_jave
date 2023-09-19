package p19_09_2023.Zadatak_01;

public abstract class Objekat {
    protected String ulicaIBroj;
    protected double povrsinaObjekta;
    protected int zona;

    public Objekat(String ulicaIBroj, double povrsinaObjekta, int zona) {
        this.ulicaIBroj = ulicaIBroj;
        this.povrsinaObjekta = povrsinaObjekta;
        this.zona = zona;
    }
    public double koeficijent (int zona){
        if (zona == 1){
            return 1.4;
        }else if (zona == 2) {
            return 1.1;
        }else if (zona == 3) {
            return 1.05;
        }else return 1;
    }
    public abstract double porezObjekta ();
    public abstract void stampaj ();

    public String getUlicaIBroj() {
        return ulicaIBroj;
    }
    public void setUlicaIBroj(String ulicaIBroj) {
        this.ulicaIBroj = ulicaIBroj;
    }
    public double getPovrsinaObjekta() {
        return povrsinaObjekta;
    }
    public void setPovrsinaObjekta(double povrsinaObjekta) {
        this.povrsinaObjekta = povrsinaObjekta;
    }
    public int getZona() {
        return zona;
    }
    public void setZona(int zona) {
        this.zona = zona;
    }
}
