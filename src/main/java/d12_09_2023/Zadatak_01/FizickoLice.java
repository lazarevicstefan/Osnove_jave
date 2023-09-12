package d12_09_2023.Zadatak_01;

public class FizickoLice {
    private String imePrezime;
    private int brojLicneKarte;
    private String jmbg;
    private boolean daLiJeOsobaVecKupovala;

    public FizickoLice(String imePrezime, int brojLicneKarte, String jmbg) {
        this.imePrezime = imePrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
        this.daLiJeOsobaVecKupovala = false;
    }
    public void stampaj (){
        System.out.println(this.imePrezime + ", " + this.brojLicneKarte);
    }

    public String getJmbg() {
        return jmbg;
    }
    public String getImePrezime() {
        return imePrezime;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public int getBrojLicneKarte() {
        return brojLicneKarte;
    }
    public void setBrojLicneKarte(int brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }
    public boolean isDaLiJeOsobaVecKupovala() {
        return daLiJeOsobaVecKupovala;
    }
    public void setDaLiJeOsobaVecKupovala(boolean daLiJeOsobaVecKupovala) {
        this.daLiJeOsobaVecKupovala = daLiJeOsobaVecKupovala;
    }
}
