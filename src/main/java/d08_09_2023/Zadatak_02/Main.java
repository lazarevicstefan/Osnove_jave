package d08_09_2023.Zadatak_02;

public class Main {
    public static void main(String[] args) {
        FacebookPost facebookPost1 = new FacebookPost();
        facebookPost1.imePrezime = "Stefan Lazarevic";
        facebookPost1.imePrezimeNaKomJeObjavljenPost = "Petar Petrovic";
        facebookPost1.tekstObjave = "Hello Petar!";

        facebookPost1.like();
        facebookPost1.like();
        facebookPost1.like();
        facebookPost1.like();
        facebookPost1.dislike();

        facebookPost1.share();
        facebookPost1.share();

        facebookPost1.print();

        FacebookPost facebookPost2 = new FacebookPost();
        facebookPost2.imePrezime = "Petar Petrovic";
        facebookPost2.imePrezimeNaKomJeObjavljenPost = "Pera Peric";
        facebookPost2.tekstObjave = "Hello Pera!";

        facebookPost2.like();
        facebookPost2.like();
        facebookPost2.like();
        facebookPost2.like();
        facebookPost2.like();
        facebookPost2.like();
        facebookPost2.dislike();
        facebookPost2.share();
        facebookPost2.share();
        facebookPost2.share();

        facebookPost2.print();
    }
}
