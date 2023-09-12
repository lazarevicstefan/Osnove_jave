package d11_09_2023.Zadatak_01;

public class Autor {
    private String imePrezime;

    public Autor(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public void print (){
        System.out.println(this.imePrezime);
    }
    public String getImePrezime() {
        return imePrezime;
    }
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
}
