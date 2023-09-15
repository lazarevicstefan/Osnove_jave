package p15_09_2023.Zadatak_02;

public class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected int godina;
    protected int mesec;

    public PlatnaKartica() {
    }
    public PlatnaKartica(double suma, String brojKartice, int godina, int mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }

    public void dodajSredstva (double dodajSumu){
        this.suma += dodajSumu;
    }
    public void izvrsiTransakciju (double skiniSumu){
        this.suma -= skiniSumu;
    }
    public void stampaj (){
        System.out.println(this.brojKartice + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);
    }
    public double getSuma() {
        return suma;
    }
    public String getBrojKartice() {
        return brojKartice;
    }
    public int getGodina() {
        return godina;
    }
    public int getMesec() {
        return mesec;
    }
}
