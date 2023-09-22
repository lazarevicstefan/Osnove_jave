package Java_Test_2;

public class InstagramUser {
    private String username;
    private String imePrezime;

    public InstagramUser(String username) {
        this.username = username;
    }
    public InstagramUser(String username, String imePrezime) {
        this.username = username;
        this.imePrezime = imePrezime;
    }
    public void stampaj (){
        System.out.println("@" + this.username + " \t " + this.imePrezime);
    }
    public String generisiLinkKorisnika(){
        return "https://www.instagram.com/" + this.username + "/";
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public String getUsername() {
        return username;
    }
    public String getImePrezime() {
        return imePrezime;
    }
}
