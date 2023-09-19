package p19_09_2023.Zadatak_01;

public class Lokal extends Objekat{
    public Lokal(String ulicaIBroj, double povrsinaObjekta, int zona) {
        super(ulicaIBroj, povrsinaObjekta, zona);
    }

    @Override
    public double porezObjekta() {
        return super.koeficijent(super.zona) * super.povrsinaObjekta * 1.3;
    }

    @Override
    public void stampaj() {
        System.out.println(this.ulicaIBroj + ", " + this.povrsinaObjekta + ", zona: " + this.zona + ", porez: " + this.porezObjekta());
    }
}
