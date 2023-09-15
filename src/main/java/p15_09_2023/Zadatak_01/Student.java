package p15_09_2023.Zadatak_01;

public class Student extends Osoba{
    private int brojIndeksa;
    private double dugZaSkolarinu;
    public Student(){}
    public Student(String imePrezime, String jmbg, int brojIndeksa, double dugZaSkolarinu) {
        super(imePrezime,jmbg);
        this.brojIndeksa = brojIndeksa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }
    public void uplatiSkolarinu (double iznosRateSkolarine){
        this.dugZaSkolarinu -= iznosRateSkolarine;
    }

    @Override
    public void stampaj (){
        super.stampaj();
        System.out.println("Broj indeksa: " + this.brojIndeksa);
        System.out.println("Dug za skolarinu: " + this.dugZaSkolarinu);
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }
    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    public double getDugZaSkolarinu() {
        return dugZaSkolarinu;
    }
    public void setDugZaSkolarinu(double dugZaSkolarinu) {
        this.dugZaSkolarinu = dugZaSkolarinu;
    }
}
