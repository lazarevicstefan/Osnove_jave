package p11_09_2023.Zadatak_03;

public class Film {
    private String naziv;
    private int godina;
    private Reziser reziser;

    public Film() {
    }
    public Film(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }
    public void stampaj (){
        System.out.println(this.naziv + ", " + this.godina);
        if (this.reziser != null){
            this.reziser.stampaj();
        }
    }

    public Reziser getReziser() {
        return reziser;
    }

    public void setReziser(Reziser reziser) {
        this.reziser = reziser;
    }

    public String getNaziv() {
        return this.naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public int getGodina() {
        return this.godina;
    }
    public void setGodina(int godina) {
        this.godina = godina;
    }
}
