package d14_09_2023.Zadatak_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kombinacija {
    private String id;
    private List<Integer> nizSedamBrojeva;

    public Kombinacija(String id,int broj1, int broj2, int broj3, int broj4, int broj5,int broj6, int broj7) {
        this.id = id;
        this.nizSedamBrojeva = new ArrayList<>();
        this.nizSedamBrojeva.add(broj1);
        this.nizSedamBrojeva.add(broj2);
        this.nizSedamBrojeva.add(broj3);
        this.nizSedamBrojeva.add(broj4);
        this.nizSedamBrojeva.add(broj5);
        this.nizSedamBrojeva.add(broj6);
        this.nizSedamBrojeva.add(broj7);
    }

    public boolean daLiJeIstaKombinacija (List<Integer> noviNizSedamBrojeva){
        Collections.sort(this.nizSedamBrojeva);
        Collections.sort(noviNizSedamBrojeva);
        boolean bingo = true;

        for (int i = 0; i < this.nizSedamBrojeva.size(); i++) {
            if (!this.nizSedamBrojeva.get(i).equals(noviNizSedamBrojeva.get(i))){
                bingo = false;
            }
        }
        return bingo;
    }
    public void stampaj (){
        System.out.println("ID: " + this.id);

        System.out.print("brojevi: ");
        for (int i = 0; i < this.nizSedamBrojeva.size(); i++) {
            if (i != this.nizSedamBrojeva.size()-1){
                System.out.print(this.nizSedamBrojeva.get(i) + ", ");
            }else {
                System.out.print(this.nizSedamBrojeva.get(i));
            }
        }
        System.out.println();
    }
    public String getId() {
        return id;
    }
    public List<Integer> getNizSedamBrojeva() {
        return nizSedamBrojeva;
    }
}
