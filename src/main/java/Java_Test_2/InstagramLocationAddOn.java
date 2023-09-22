package Java_Test_2;

public class InstagramLocationAddOn extends InstagramAddOn{
    public String nazivLokacije;

    public InstagramLocationAddOn(int id, int xKoordinata, int yKoordinata, int sirinaDodatka, int visinaDodatka, String nazivLokacije) {
        super(id, xKoordinata, yKoordinata, sirinaDodatka, visinaDodatka);
        this.nazivLokacije = nazivLokacije;
    }


    @Override
    public int minimalnaSirina() {
        return 100;
    }

    @Override
    public int minimalnaVisina() {
        return 50;
    }

    @Override
    public void stampaj() {
        System.out.println("[" + super.xKoordinata + ", " + super.yKoordinata + "] (" + super.visinaDodatka + ", " + super.sirinaDodatka + ") L " + this.nazivLokacije);
    }

    public String getNazivLokacije() {
        return nazivLokacije;
    }
    public void setNazivLokacije(String nazivLokacije) {
        this.nazivLokacije = nazivLokacije;
    }
}
