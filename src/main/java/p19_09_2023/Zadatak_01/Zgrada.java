package p19_09_2023.Zadatak_01;

public class Zgrada extends Objekat{
    private int brojStanova;

    public Zgrada(String ulicaIBroj, double povrsinaObjekta, int zona, int brojStanova) {
        super(ulicaIBroj, povrsinaObjekta, zona);
        this.brojStanova = brojStanova;
    }

    @Override
    public double porezObjekta() {
        return super.koeficijent(super.zona) * super.povrsinaObjekta * this.brojStanova;
    }

    @Override
    public void stampaj() {
        System.out.println(this.ulicaIBroj + ", " + this.povrsinaObjekta + ", zona: " + this.zona + ", broj stanova: " + this.brojStanova + ", porez: " + this.porezObjekta());
    }
    public int getBrojStanova() {
        return brojStanova;
    }
    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }
}
