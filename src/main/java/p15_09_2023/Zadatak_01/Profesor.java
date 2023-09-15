package p15_09_2023.Zadatak_01;

public class Profesor extends Osoba{
    private String nazivPredmeta;
    private double iznosPlate;

    public Profesor() {}
    public Profesor(String imePrezime, String jmbg, String nazivPredmeta, double iznosPlate) {
        super(imePrezime,jmbg);
        this.nazivPredmeta = nazivPredmeta;
        this.iznosPlate = iznosPlate;
    }
    public void povecajPlatu (int procenat){
        double pr = procenat / 100.0;
        this.iznosPlate += this.iznosPlate * pr;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Naziv predmeta: " + this.nazivPredmeta);
        System.out.println("Iznos plate: " + this.iznosPlate);
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
    public double getIznosPlate() {
        return iznosPlate;
    }

    public void setIznosPlate(double iznosPlate) {
        this.iznosPlate = iznosPlate;
    }
}
