package p14_09_2023.Zadatak_02;

public class HistoryPage {
    private String nazivStranice;
    private String linkDoStranice;
    private int vremeOtvaranjaSat;
    private int vremeOtvaranjaMin;

    private String username;
    private String password;

    public HistoryPage(String nazivStranice, String linkDoStranice, int vremeOtvaranjaSat, int vremeOtvaranjaMin) {
        this.nazivStranice = nazivStranice;
        this.linkDoStranice = linkDoStranice;
        this.vremeOtvaranjaSat = vremeOtvaranjaSat;
        this.vremeOtvaranjaMin = vremeOtvaranjaMin;
    }
    public void dodajKredencijale (String username, String password){
        this.username = username;
        this.password = password;
    }
    public void obrisiKolacice (){
        this.username = null;
        this.password = null;
    }
    public void stampaj (){
        String zvezdica = (this.username == null) && (this.password == null) ? "" : "*";
        System.out.println(this.vremeOtvaranjaSat + " - " + this.vremeOtvaranjaMin + " - " + this.nazivStranice + "..." + this.linkDoStranice + zvezdica );
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getNazivStranice() {
        return nazivStranice;
    }
    public void setNazivStranice(String nazivStranice) {
        this.nazivStranice = nazivStranice;
    }
    public String getLinkDoStranice() {
        return linkDoStranice;
    }
    public void setLinkDoStranice(String linkDoStranice) {
        this.linkDoStranice = linkDoStranice;
    }
    public int getVremeOtvaranjaSat() {
        return vremeOtvaranjaSat;
    }
    public void setVremeOtvaranjaSat(int vremeOtvaranjaSat) {
        this.vremeOtvaranjaSat = vremeOtvaranjaSat;
    }
    public int getVremeOtvaranjaMin() {
        return vremeOtvaranjaMin;
    }
    public void setVremeOtvaranjaMin(int vremeOtvaranjaMin) {
        this.vremeOtvaranjaMin = vremeOtvaranjaMin;
    }
}
