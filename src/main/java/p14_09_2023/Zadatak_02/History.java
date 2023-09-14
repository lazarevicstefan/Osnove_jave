package p14_09_2023.Zadatak_02;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<HistoryPage> listaStranica;

    public History() {
        this.listaStranica = new ArrayList<>();
    }

    public void otvoriStranicu (HistoryPage page){
        this.listaStranica.add(page);
    }
    public void obrisiPremaLinku (String link){
        for (int i = 0; i < this.listaStranica.size(); i++) {
            if (this.listaStranica.get(i).getLinkDoStranice().equals(link)){
                this.listaStranica.remove(i);
            }
        }
    }
    public void obrisiKolaciceZaLink (String link){
        for (int i = 0; i < this.listaStranica.size(); i++) {
            if (this.listaStranica.get(i).getLinkDoStranice().equals(link)){
                this.listaStranica.get(i).obrisiKolacice();
            }
        }
    }
    public void obrisiIstoriju (){
        this.listaStranica.clear();
    }
    public void sacuvajKredecijale (String nazivStranice, String username, String password){
        for (int i = 0; i < this.listaStranica.size(); i++) {
            if (this.listaStranica.get(i).getNazivStranice().equals(nazivStranice)){
                this.listaStranica.get(i).dodajKredencijale(username, password);
            }
        }
    }
    public void pogledajIstoriju (){
        if (!this.listaStranica.isEmpty()){
            for (int i = 0; i < this.listaStranica.size(); i++) {
                this.listaStranica.get(i).stampaj();
            }
        }else {
            System.out.println("Istorija je prazna!");
        }
    }
    public void obrisiSveKolacice (){
        for (int i = 0; i < this.listaStranica.size(); i++) {
            this.listaStranica.get(i).obrisiKolacice();
        }
    }
    public void obrisiSveKolaciceZaZadnjihSatVremena (int trenutnoVremeSati, int trenutnoVremeMinuti){
        int ukupno = (trenutnoVremeSati * 60) + trenutnoVremeMinuti;
        for (int i = 0; i < this.listaStranica.size(); i++) {
            int sat = this.listaStranica.get(i).getVremeOtvaranjaSat();
            int min = this.listaStranica.get(i).getVremeOtvaranjaMin();
            int zajedno = (sat * 60) + min;
            int razlika = ukupno - zajedno;
            if (razlika <= 60){
                this.listaStranica.get(i).obrisiKolacice();
            }
        }
    }
}
