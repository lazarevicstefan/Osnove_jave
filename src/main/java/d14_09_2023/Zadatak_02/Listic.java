package d14_09_2023.Zadatak_02;

import java.util.ArrayList;
import java.util.List;

public class Listic {
    private List<Kombinacija> nizKombinacija;

    public Listic() {
        this.nizKombinacija = new ArrayList<>();
    }
    public void dodajKombinaciju (Kombinacija kombinacija){
        if (this.nizKombinacija.size() != 7){
            this.nizKombinacija.add(kombinacija);
        }
    }
    public boolean daLiJeDobitnaKombinacija (Kombinacija kombinacija){
        for (int i = 0; i < this.nizKombinacija.size(); i++) {
            if (this.nizKombinacija.get(i).daLiJeIstaKombinacija(kombinacija.getNizSedamBrojeva())){
                return  true;
            }
        }
        return false;
    }

    public void stampaj (){
        for (Kombinacija k: this.nizKombinacija) {
            k.stampaj();
        }
    }
}
