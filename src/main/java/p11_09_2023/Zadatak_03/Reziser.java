package p11_09_2023.Zadatak_03;

public class Reziser {
    private String imePrezime;
    private int starost;

    public Reziser() {
    }

    public Reziser(String imePrezime, int starost) {
        this.imePrezime = imePrezime;
        this.starost = starost;
    }
    public void stampaj (){
        System.out.println(this.imePrezime + ", " + this.starost);
    }

    public String getImePrezime() {
        return this.imePrezime;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public int getStarost() {
        return this.starost;
    }
    public void setStarost(int starost) {
        this.starost = starost;
    }
}
