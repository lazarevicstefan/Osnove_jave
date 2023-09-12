package d12_09_2023.Zadatak_02;

public class ZeleniKarton {
    private String imePrezimeStudenta;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String imePrezimeProfesora;
    private int ocena;

    public ZeleniKarton(String imePrezimeStudenta, int brojIndeksa, String nazivPredmeta, String imePrezimeProfesora, int ocena) {
        this.imePrezimeStudenta = imePrezimeStudenta;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imePrezimeProfesora = imePrezimeProfesora;
        this.ocena = ocena;
    }

    public void proveraDaLiJePolozen(){
        if (this.ocena > 5){
            System.out.println("Ispit je polozen!");
        }else {
            System.out.println("Ispit nije polozen!");
        }
    }
    public void stampaj (){
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.imePrezimeStudenta + ", " + this.brojIndeksa);
        System.out.println("Profesor: " + this.imePrezimeProfesora);
    }
    public String getImePrezimeStudenta() {
        return imePrezimeStudenta;
    }
    public void setImePrezimeStudenta(String imePrezimeStudenta) {
        this.imePrezimeStudenta = imePrezimeStudenta;
    }
    public int getBrojIndeksa() {
        return brojIndeksa;
    }
    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }
    public void setImePrezimeProfesora(String imePrezimeProfesora) {
        this.imePrezimeProfesora = imePrezimeProfesora;
    }
    public int getOcena() {
        return ocena;
    }
    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
}
