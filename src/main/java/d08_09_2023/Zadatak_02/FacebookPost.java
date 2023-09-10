package d08_09_2023.Zadatak_02;


public class FacebookPost {
    public String imePrezime;
    public String imePrezimeNaKomJeObjavljenPost;
    public String tekstObjave;
    public int brojLakova;
    public int brojDeljenja;

    public void like() {
        this.brojLakova++;
    }

    public void dislike() {
        if (this.brojLakova != 0) this.brojLakova--;
    }

    public void share() {
        this.brojDeljenja++;
    }
    public void print(){
        System.out.println(this.imePrezime + " >>> "+ this.imePrezimeNaKomJeObjavljenPost);
        System.out.println(this.tekstObjave);
        System.out.println("Likes " + this.brojLakova + " | Shares " + this.brojDeljenja);
    }
}
