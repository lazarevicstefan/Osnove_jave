package p12_09_2023.Zadatak_01;

public class ClanskaKarta {
    private int popust;
    private String brojKartice;
    public ClanskaKarta(int popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }
    public int getPopust() {
        return popust;
    }
    public void setPopust(int popust) {
        this.popust = popust;
    }
    public String getBrojKartice() {
        return brojKartice;
    }
    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }
}
