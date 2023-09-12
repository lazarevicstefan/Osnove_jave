package p12_09_2023.Zadatak_02;

public class Korisnik {
    private String imePrezime;
    private String tipLicence;

    public Korisnik(String imePrezime) {
        this.imePrezime = imePrezime;
        this.tipLicence = "basic";
    }
    public void preplatiSe (int uplacenaSuma){
        if (uplacenaSuma == 100){
            this.tipLicence = "pro";
        }else if (uplacenaSuma == 150){
            this.tipLicence = "premium";
        }
    }
    public void ponistiPreplatu (){
        this.tipLicence = "basic";
    }
    public int vratiDuzinuTrajanjaPoziva (){
        if (this.tipLicence.equals("basic")){
            return 40;
        }else if (this.tipLicence.equals("pro")){
            return 240;
        }else if (this.tipLicence.equals("premium")){
            return 1440;
        }else {
            return 0;
        }
    }
    public void stampaj (){
        System.out.println(this.imePrezime);
    }
    public String getTipLicence() {
        return tipLicence;
    }
    public String getImePrezime() {
        return imePrezime;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
}
