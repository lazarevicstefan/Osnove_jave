package d12_09_2023.Zadatak_03;

public class Racun {
    private String brojRacuna;
    private String imePrezime;
    private double trenutnoStanjeNaRacunu;

    public Racun(String brojRacuna, String imePrezime, double trenutnoStanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imePrezime = imePrezime;
        this.trenutnoStanjeNaRacunu = trenutnoStanjeNaRacunu;
    }
    public void uplatiNaRacun (double uplata){
        this.trenutnoStanjeNaRacunu += uplata;
    }
    public void skiniSaRacuna (double isplata){
        this.trenutnoStanjeNaRacunu -= isplata;
    }
    public void stampaj (){
        System.out.println(this.imePrezime + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je: " + this.trenutnoStanjeNaRacunu + " rsd");
        System.out.println();
    }

    public double getTrenutnoStanjeNaRacunu() {
        return trenutnoStanjeNaRacunu;
    }
    public String getBrojRacuna() {
        return brojRacuna;
    }
    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }
    public String getImePrezime() {
        return imePrezime;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
}
