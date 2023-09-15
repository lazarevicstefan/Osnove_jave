package d14_09_2023.Zadatak_01;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String brojIndex;
    private String imePrezime;
    private String tipStudija;
    private List<Ispit> nizIspita;

    public Student(String brojIndex, String imePrezime, String tipStudija) {
        this.brojIndex = brojIndex;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;
        this.nizIspita = new ArrayList<>();
    }
    public double prosek (){
        int count = 0;
        double ocene = 0.0;
        for (int i = 0; i < this.nizIspita.size(); i++) {
            if (this.nizIspita.get(i).daLiJePolozen()){
                ocene += this.nizIspita.get(i).getOcena();
                count ++ ;
            }
        }
        return ocene / count;
    }
    public void stampaj (){
        System.out.println(this.brojIndex + " - " + this.imePrezime + " - " + this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.nizIspita.size(); i++) {
            this.nizIspita.get(i).stampaj();
        }
        System.out.println("Prosecna ocena: " + this.prosek());
    }
    public void dodajIspit (Ispit ispit) {
        this.nizIspita.add(ispit);
    }
    public List<Ispit> getNizIspita() {
        return nizIspita;
    }
    public String getBrojIndex() {
        return brojIndex;
    }
    public void setBrojIndex(String brojIndex) {
        this.brojIndex = brojIndex;
    }
    public String getImePrezime() {
        return imePrezime;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public String getTipStudija() {
        return tipStudija;
    }
    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }
}
