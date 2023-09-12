package p12_09_2023.Zadatak_03;

public class ViberKorisnik {
    private String imePrezime;
    private String brojTelefona;
    private boolean daLiJeAktivan;

    public ViberKorisnik(String imePrezime, String brojTelefona, boolean daLiJeAktivan) {
        this.imePrezime = imePrezime;
        this.brojTelefona = brojTelefona;
        this.daLiJeAktivan = daLiJeAktivan;
    }
    public String getImePrezime() {
        return imePrezime;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public String getBrojTelefona() {
        return brojTelefona;
    }
    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }
    public boolean isDaLiJeAktivan() {
        return daLiJeAktivan;
    }
    public void setDaLiJeAktivan(boolean daLiJeAktivan) {
        this.daLiJeAktivan = daLiJeAktivan;
    }
}
