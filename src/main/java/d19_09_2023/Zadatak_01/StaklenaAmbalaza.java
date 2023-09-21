package d19_09_2023.Zadatak_01;

public class StaklenaAmbalaza extends Ambalaza{
    private double kaucijaZaFlasu;
    private boolean placaSeKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucijaZaFlasu, boolean placaSeKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucijaZaFlasu = kaucijaZaFlasu;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (this.placaSeKaucija){
            return this.osnovnaCena * 1.2 + this.kaucijaZaFlasu;
        }else return this.osnovnaCena * 1.2;
    }

    @Override
    public void print() {
        String kaucija = this.placaSeKaucija ? ", placa se kaucija za ambalazu" : ", ne placa se kaucija za ambalazu";
        System.out.println("Barkod: " + super.barkod + ", naziv artikla: " + super.nazivArtikla + ", neto tezina: " + super.netoTezina +
                ", bruto tezina: " + super.brutoTezina + ", kaucija za flasu: " + this.kaucijaZaFlasu + ", cena: " + this.cenaArtikla() + kaucija);
    }

    public double getKaucijaZaFlasu() {
        return kaucijaZaFlasu;
    }
    public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
        this.kaucijaZaFlasu = kaucijaZaFlasu;
    }
    public boolean isPlacaSeKaucija() {
        return placaSeKaucija;
    }
    public void setPlacaSeKaucija(boolean placaSeKaucija) {
        this.placaSeKaucija = placaSeKaucija;
    }
    public double getOsnovnaCena() {
        return osnovnaCena;
    }
    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
}
