package Java_Test_2;

import java.util.ArrayList;
import java.util.List;

public class InstagramStory {
    private InstagramUser korisnikKreiraoStory;
    private String linkZaSwipeUp = "";
    private String linkDoSlike;
    private List<InstagramAddOn> nizDodatkaNaStory;
    private List<InstagramUser> nizKorisnikKojiSuPogledaliStory;

    public InstagramStory(InstagramUser korisnikKreiraoStory, String linkDoSlike) {
        this.korisnikKreiraoStory = korisnikKreiraoStory;
        this.linkDoSlike = linkDoSlike;
        this.nizDodatkaNaStory = new ArrayList<>();
        this.nizKorisnikKojiSuPogledaliStory = new ArrayList<>();
    }
    public void dodajDodatakNaStory (InstagramAddOn instagramAddOn) {
        this.nizDodatkaNaStory.add(instagramAddOn);
    }
    public void brisanjeDodatkaNaStory (int idDodatka){
        for (int i = 0; i < this.nizDodatkaNaStory.size(); i++) {
            if (this.nizDodatkaNaStory.get(i).getId() == idDodatka){
                this.nizDodatkaNaStory.remove(i);
            }
        }
    }
    private boolean daLiJeKorisnikPogledaoStory (String username){
        for (InstagramUser user: this.nizKorisnikKojiSuPogledaliStory) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
    public void postaviStory (){
        this.korisnikKreiraoStory.stampaj();
        System.out.println("Story: ");
        System.out.println("Image: " + this.linkDoSlike);
        for (int i = 0; i < this.nizDodatkaNaStory.size(); i++) {
            if (this.nizDodatkaNaStory.get(i) instanceof InstagramLocationAddOn){
                InstagramLocationAddOn locationAddOn = (InstagramLocationAddOn) this.nizDodatkaNaStory.get(i);
                locationAddOn.stampaj();
            }else if (this.nizDodatkaNaStory.get(i) instanceof InstagramMentionAddOn){
                InstagramMentionAddOn mentionAddOn = (InstagramMentionAddOn) this.nizDodatkaNaStory.get(i);
                mentionAddOn.stampaj();
            }
        }
        if (!this.linkZaSwipeUp.equals("")){
            System.out.println("<<< swipe up >>>");
            System.out.println(this.linkZaSwipeUp);
        }
    }
    public int brojPregleda (){
        return nizKorisnikKojiSuPogledaliStory.size();
    }
    public void stampajSveKorisnike (){
        System.out.println("Viewers " + this.brojPregleda());
        for (InstagramUser user : this.nizKorisnikKojiSuPogledaliStory){
            user.stampaj();
        }
    }
    public void pogledajStory (InstagramUser instagramUser){
        if (!daLiJeKorisnikPogledaoStory(instagramUser.getUsername())){
            this.nizKorisnikKojiSuPogledaliStory.add(instagramUser);
        }
    }
    public void setLinkZaSwipeUp(String linkZaSwipeUp) {
        this.linkZaSwipeUp = linkZaSwipeUp;
    }
    public InstagramUser getKorisnikKreiraoStory() {
        return korisnikKreiraoStory;
    }
    public String getLinkZaSwipeUp() {
        return linkZaSwipeUp;
    }
    public String getLinkDoSlike() {
        return linkDoSlike;
    }
    public List<InstagramAddOn> getNizDodatkaNaStory() {
        return nizDodatkaNaStory;
    }
    public List<InstagramUser> getNizKorisnikKojiSuPogledaliStory() {
        return nizKorisnikKojiSuPogledaliStory;
    }
}
