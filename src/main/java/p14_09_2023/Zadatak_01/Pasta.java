package p14_09_2023.Zadatak_01;

import java.util.ArrayList;
import java.util.List;

public class Pasta {
    private List<Sastojak> listaSastojaka;

    public Pasta() {
        this.listaSastojaka = new ArrayList<>();
    }
    public double cenaPaste (){
        double sum = 0;
        for (int i = 0; i < this.listaSastojaka.size(); i++) {
            sum += this.listaSastojaka.get(i).getCena();
        }
        return sum;
    }
    public void stampaj (){
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < this.listaSastojaka.size(); i++) {
            this.listaSastojaka.get(i).stampaj();
        }
        System.out.println("Cena paste je: " + this.cenaPaste() + " din");
    }
    public void obrisiSastojak (String nazivSastojka){
        for (int i = 0; i < this.listaSastojaka.size(); i++) {
            if (this.listaSastojaka.get(i).getNaziv().equals(nazivSastojka)){
                this.listaSastojaka.remove(i);
            }
        }
    }

    public void dodajtSastojak (Sastojak sastojak){
        this.listaSastojaka.add(sastojak);
    }
}
