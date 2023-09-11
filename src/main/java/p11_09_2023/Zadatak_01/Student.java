package p11_09_2023.Zadatak_01;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private boolean daLiJeNaBudjetu;
    public void stampaj(){
        System.out.println("Ime: " + this.ime + ", Prezime: " + this.prezime);
        System.out.println("Broj indeksa: " + this.brojIndeksa);
        if (this.daLiJeNaBudjetu){
            System.out.println("Student je na budzetu!");
        }else {
            System.out.println("Student nije na budzetu!");
        }
    }

    public String getIme() {
        return this.ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getPrezime() {
        return this.prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public int getBrojIndeksa() {
        return this.brojIndeksa;
    }
    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    public boolean isDaLiJeNaBudjetu() {
        return this.daLiJeNaBudjetu;
    }
    public void setDaLiJeNaBudjetu(boolean daLiJeNaBudjetu) {
        this.daLiJeNaBudjetu = daLiJeNaBudjetu;
    }
}
