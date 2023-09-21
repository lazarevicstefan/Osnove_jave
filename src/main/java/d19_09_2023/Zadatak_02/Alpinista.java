package d19_09_2023.Zadatak_02;

public class Alpinista extends Planinar{
    private int brojPoena;

    public Alpinista(int identifikacioniBroj, String imePrezimePlaninara, int brojPoena) {
        super(identifikacioniBroj, imePrezimePlaninara);
        this.brojPoena = brojPoena;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + this.identifikacioniBroj);
        System.out.println("Ime: " + this.imePrezimePlaninara);
        System.out.println("Broj poena: " + this.brojPoena);
    }

    @Override
    public double vratiCenuClanarinePlaninara() {
        double popust = this.brojPoena * 50;
        return 1500.0 - popust;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if (planina.getVisinaPlanine() < 4000){
            return true;
        }else {
            return false;
        }
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }
}
