package p18_09_2023.Zadatak_02;

public abstract class Student {
    protected String imePrezimeStudenta;
    protected String brojIndeksa;
    protected int godinaStudija;

    public Student(String imePrezimeStudenta, String brojIndeksa, int godinaStudija) {
        this.imePrezimeStudenta = imePrezimeStudenta;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudija = godinaStudija;
    }
    public abstract double cenaSkolarine ();
    public abstract boolean daLiJeNaBudzetu ();

    public void print (){
        System.out.println(this.imePrezimeStudenta + ", " + this.brojIndeksa + ", " + this.godinaStudija);
        String finansiranje = daLiJeNaBudzetu() ? "budzet" : "samofinansirajuci";
        System.out.println("Finansiranje: " + finansiranje);
        System.out.println("Cena skolarine: " + cenaSkolarine());
    }

    public String getImePrezimeStudenta() {
        return imePrezimeStudenta;
    }
    public void setImePrezimeStudenta(String imePrezimeStudenta) {
        this.imePrezimeStudenta = imePrezimeStudenta;
    }
    public String getBrojIndeksa() {
        return brojIndeksa;
    }
    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    public int getGodinaStudija() {
        return godinaStudija;
    }
    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
}
