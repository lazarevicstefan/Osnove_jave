package d14_09_2023.Zadatak_01;

public class Ispit {
    private String nazivPredmeta;
    private int ocena;
    private String imePrezimeProfesora;

    public Ispit(String nazivPredmeta, int ocena, String imePrezimeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imePrezimeProfesora = imePrezimeProfesora;
    }

    public boolean daLiJePolozen (){
        if (this.ocena > 5) {
            return true;
        }else {
            return false;
        }
    }
    public void stampaj (){
        System.out.println(this.nazivPredmeta + " - " + this.imePrezimeProfesora + " - " + this.ocena);
    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public int getOcena() {
        return ocena;
    }
    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }
}
