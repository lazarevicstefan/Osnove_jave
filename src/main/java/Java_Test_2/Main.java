package Java_Test_2;

public class Main {
    public static void main(String[] args) {
        InstagramUser user1 = new InstagramUser("pera_peric", "Pera Peric");
        InstagramUser user2 = new InstagramUser("stefan_lazarevic", "Stefan Lazarevic");
        InstagramUser user3 = new InstagramUser("marko_markovic", "Marko Markovic");
        InstagramUser user4 = new InstagramUser("dusan_d", "Dusan Dusanovic");

        InstagramStory instagramStory = new InstagramStory(user1,"https://www.instagram.com/p/CecrcPyrPMj/");
        instagramStory.dodajDodatakNaStory(new InstagramLocationAddOn(8531,10,15,70,120,"Key"));
        instagramStory.dodajDodatakNaStory(new InstagramMentionAddOn(8413,4,1,60,120,user2));
        instagramStory.dodajDodatakNaStory(new InstagramMentionAddOn(4731,11,2,60,100,user3));

        instagramStory.pogledajStory(user3);
        instagramStory.pogledajStory(user1);
        instagramStory.pogledajStory(user4);


        instagramStory.postaviStory();

        instagramStory.setLinkZaSwipeUp("http://google.com/");
        instagramStory.brisanjeDodatkaNaStory(4731);
        System.out.println();

        instagramStory.postaviStory();
        System.out.println();

        instagramStory.stampajSveKorisnike();
    }
}
