package p14_09_2023.Zadatak_04;

public class InstagramUser {
    private String username;
    private String imePrezime;
    private String email;

    public InstagramUser(String username, String imePrezime, String email) {
        this.username = username;
        this.imePrezime = imePrezime;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
    public String getImePrezime() {
        return imePrezime;
    }
    public String getEmail() {
        return email;
    }
}
