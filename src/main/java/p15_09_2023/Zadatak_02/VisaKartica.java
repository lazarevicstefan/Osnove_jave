package p15_09_2023.Zadatak_02;

public class VisaKartica extends PlatnaKartica{
    private String imePrezimeOvlasceneOsobe;


    public VisaKartica(double suma, String brojKartice, int godina, int mesec, String imePrezimeOvlasceneOsobe) {
        super(suma, brojKartice, godina, mesec);
        this.imePrezimeOvlasceneOsobe = imePrezimeOvlasceneOsobe;
    }
    @Override
    public void izvrsiTransakciju(double skiniSumu){
        double provizija = skiniSumu * 0.018;
        if (provizija < 4){
            provizija = 4.0;
        }
        double ukupno = skiniSumu + provizija;
        super.suma -= ukupno;
    }
    @Override
    public void stampaj (){
        System.out.print("Visa Card: ");
        super.stampaj();
        System.out.println("Ovlasceno lice: " + this.imePrezimeOvlasceneOsobe);
    }

    public String getImePrezimeOvlasceneOsobe() {
        return imePrezimeOvlasceneOsobe;
    }
    public void setImePrezimeOvlasceneOsobe(String imePrezimeOvlasceneOsobe) {
        this.imePrezimeOvlasceneOsobe = imePrezimeOvlasceneOsobe;
    }
}
