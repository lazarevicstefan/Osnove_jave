package Java_Test_2;

public abstract class InstagramAddOn {
    protected int id;
    protected int xKoordinata;
    protected int yKoordinata;
    protected int sirinaDodatka;
    protected int visinaDodatka;

    public InstagramAddOn(int id, int xKoordinata, int yKoordinata, int sirinaDodatka, int visinaDodatka) {
        this.id = id;
        this.xKoordinata = xKoordinata;
        this.yKoordinata = yKoordinata;
        this.sirinaDodatka = sirinaDodatka;
        this.visinaDodatka = visinaDodatka;
    }

    public abstract int minimalnaSirina ();
    public abstract int minimalnaVisina ();
    public void povecanjeDimenzije (int visina, int sirina){
        this.visinaDodatka += visina;
        this.sirinaDodatka += sirina;
    }
    public void smanjenjeDimenzije (int visina, int sirina){
        if ((this.visinaDodatka - visina) >= this.minimalnaVisina()){
            this.visinaDodatka -= visina;
        }else {
            System.out.println("Izlazi iz opsega!");
        }
        if ((this.sirinaDodatka - sirina) >= this.minimalnaSirina()){
            this.sirinaDodatka -= sirina;
        }else {
            System.out.println("Izlazi iz opsega!");
        }
    }
    public abstract void stampaj ();

    public int getId() {
        return id;
    }
    public int getxKoordinata() {
        return xKoordinata;
    }
    public int getyKoordinata() {
        return yKoordinata;
    }
    public int getSirinaDodatka() {
        return sirinaDodatka;
    }
    public int getVisinaDodatka() {
        return visinaDodatka;
    }
}
