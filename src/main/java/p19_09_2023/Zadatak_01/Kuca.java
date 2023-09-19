package p19_09_2023.Zadatak_01;

public class Kuca extends Objekat{
    private int brojClanova;

    public Kuca(String ulicaIBroj, double povrsinaObjekta, int zona, int brojClanova) {
        super(ulicaIBroj, povrsinaObjekta, zona);
        this.brojClanova = brojClanova;
    }


    @Override
    public double porezObjekta() {
        return super.koeficijent(super.zona) * super.povrsinaObjekta;
    }

    @Override
    public void stampaj() {
        System.out.println(this.ulicaIBroj + ", " + this.povrsinaObjekta + ", zona: " + this.zona + ", broj clanova: " + this.brojClanova + ", porez: " + this.porezObjekta());
    }
    public int getBrojClanova() {
        return brojClanova;
    }
    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }
}
