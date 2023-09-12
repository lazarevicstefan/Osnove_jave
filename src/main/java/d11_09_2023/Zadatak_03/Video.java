package d11_09_2023.Zadatak_03;

public class Video {
    private String id;
    private String nazivVidea;
    private int duzinaVidea;
    private int brojLajkova;
    private int brojDislajkova;
    private int brojPregleda;

    public Video(String id, String nazivVidea, int duzinaVidea) {
        this.id = id;
        this.nazivVidea = nazivVidea;
        this.duzinaVidea = duzinaVidea;
    }

    public void lajkuj (){
        this.brojLajkova++;
    }
    public void dislajk (){
        this.brojDislajkova++;
    }
    public void pogledaj (){
        this.brojPregleda++;
    }
    public String getId() {
        return id;
    }
    public String getNazivVidea() {
        return nazivVidea;
    }
    public int getDuzinaVidea() {
        return duzinaVidea;
    }
    public int getBrojLajkova() {
        return brojLajkova;
    }
    public int getBrojDislajkova() {
        return brojDislajkova;
    }
    public int getBrojPregleda() {
        return brojPregleda;
    }
}
