package p15_09_2023.Zadatak_01;

public class Osoba {
    protected String imePrezime;
    protected String jmbg;

    public Osoba() {
    }
    public Osoba(String imePrezime, String jmbg) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
    }
    public void stampaj (){
        System.out.println(this.imePrezime + ", " + this.jmbg);
    }

    public String getImePrezime() {
        return imePrezime;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public String getJmbg() {
        return jmbg;
    }
    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
}
