package p14_09_2023.Zadatak_04;

public class InstagramTag {
    private int xKordinata;
    private int yKordinata;
    private InstagramUser korisnikKojiJeTagovan;

    public InstagramTag(int xKordinata, int yKordinata, InstagramUser korisnikKojiJeTagovan) {
        this.xKordinata = xKordinata;
        this.yKordinata = yKordinata;
        this.korisnikKojiJeTagovan = korisnikKojiJeTagovan;
    }

    public int getxKordinata() {
        return xKordinata;
    }

    public int getyKordinata() {
        return yKordinata;
    }

    public InstagramUser getKorisnikKojiJeTagovan() {
        return korisnikKojiJeTagovan;
    }
}
