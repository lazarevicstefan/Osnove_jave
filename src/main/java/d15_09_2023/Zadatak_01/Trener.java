package d15_09_2023.Zadatak_01;

public class Trener extends Osoba{
    private int godineIskustva;
    private String tipTrenera;

    public Trener(String imePrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }
    @Override
    public void stampaj (){
        System.out.println("=Trener=");
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva + ", tip trenera: " + this.tipTrenera);
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }
    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }
    public String getTipTrenera() {
        return tipTrenera;
    }
    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }
}
