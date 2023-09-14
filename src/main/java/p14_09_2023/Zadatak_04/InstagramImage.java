package p14_09_2023.Zadatak_04;

import java.util.ArrayList;
import java.util.List;

public class InstagramImage {
    private List<InstagramTag> nizTagova;
    private int duzinaSlike;
    private int visinaSlike;
    private String putanjaDoSlike;

    public InstagramImage( int duzinaSlike, int visinaSlike, String putanjaDoSlike) {
        this.nizTagova = new ArrayList<>();
        this.duzinaSlike = duzinaSlike;
        this.visinaSlike = visinaSlike;
        this.putanjaDoSlike = putanjaDoSlike;
    }

    public List<InstagramTag> getNizTagova() {
        return nizTagova;
    }

    public void dodajTag (InstagramTag tag){
        nizTagova.add(tag);
    }

    public int getDuzinaSlike() {
        return duzinaSlike;
    }

    public int getVisinaSlike() {
        return visinaSlike;
    }

    public String getPutanjaDoSlike() {
        return putanjaDoSlike;
    }
}
