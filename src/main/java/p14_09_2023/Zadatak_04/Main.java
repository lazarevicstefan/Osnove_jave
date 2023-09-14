package p14_09_2023.Zadatak_04;

public class Main {
    public static void main(String[] args) {
        InstagramUser user = new InstagramUser("stefanlazarevic","Stefan Lazarevic","mail@mail.com");
        InstagramUser user2 = new InstagramUser("petarpetrovic","Petar Petrovic","petar@mail.com");

        InstagramImage image = new InstagramImage(100,100,"instagram.com/korsnik-pera/profilna.jpg");

        InstagramTag tag = new InstagramTag(10,40,user);
        InstagramTag tag2 = new InstagramTag(20,60,user2);

        image.dodajTag(tag);
        image.dodajTag(tag2);

        InstagramPost post = new InstagramPost("Neke slike sa tagovima!");
        post.dodajSliku(image);

        post.stampaj();


    }
}
