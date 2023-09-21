package d19_09_2023.Zadatak_01;

public class Tetrapak extends Ambalaza{
    private boolean daLiMozeDaSeReciklira;
    private double osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean daLiMozeDaSeReciklira, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.daLiMozeDaSeReciklira = daLiMozeDaSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (daLiMozeDaSeReciklira){
            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        }else return this.osnovnaCena;
    }

    @Override
    public void print() {
        String reciklaza = this.daLiMozeDaSeReciklira ? ", moze da se reciklira" : ", ne moze da se reciklira";
        System.out.println("Barkod: " + super.barkod + ", naziv artikla: " + super.nazivArtikla + ", neto tezina: " + super.netoTezina +
                ", bruto tezina: " + super.brutoTezina + ", cena: " + this.cenaArtikla() + reciklaza);
    }

    public boolean isDaLiMozeDaSeReciklira() {
        return daLiMozeDaSeReciklira;
    }
    public void setDaLiMozeDaSeReciklira(boolean daLiMozeDaSeReciklira) {
        this.daLiMozeDaSeReciklira = daLiMozeDaSeReciklira;
    }
    public double getOsnovnaCena() {
        return osnovnaCena;
    }
    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
}
