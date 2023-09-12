package d12_09_2023.Zadatak_01;

public class Ugovor {
    private String danMesecGodinaSklapanja;
    private FizickoLice osobaKojaProdaje;
    private FizickoLice osobaKojaKupuje;
    private double cenaNekretnine;
    private String adresaNekretnine;

    public Ugovor(String danMesecGodinaSklapanja, FizickoLice osobaKojaProdaje, FizickoLice osobaKojaKupuje, double cenaNekretnine, String adresaNekretnine) {
        this.danMesecGodinaSklapanja = danMesecGodinaSklapanja;
        this.osobaKojaProdaje = osobaKojaProdaje;
        this.osobaKojaKupuje = osobaKojaKupuje;
        this.cenaNekretnine = cenaNekretnine;
        this.adresaNekretnine = adresaNekretnine;
    }

    public double procenatZarade (){
        if (osobaKojaKupuje.isDaLiJeOsobaVecKupovala()){
            return 0.02;
        }else {
            return 0.03;
        }
    }
    public double zaradaAgencije (){
        return 1000 + this.cenaNekretnine * this.procenatZarade();
    }
    public void stampaj (){
        System.out.printf("Dana %sgod sklopljen je ugovor izmedju %s i %s o kupovini nekretnine %s po ceni od %.2f " +
                "pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od %.2f",
                this.danMesecGodinaSklapanja,
                this.osobaKojaProdaje.getImePrezime(),
                this.osobaKojaKupuje.getImePrezime(),
                this.adresaNekretnine,
                this.cenaNekretnine,
                this.zaradaAgencije());
    }
}
