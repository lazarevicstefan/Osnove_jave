package Java_Test_2;

public class InstagramMentionAddOn extends InstagramAddOn{
    private InstagramUser korisnikTagovan;

    public InstagramMentionAddOn(int id, int xKoordinata, int yKoordinata, int sirinaDodatka, int visinaDodatka, InstagramUser korisnikTagovan) {
        super(id, xKoordinata, yKoordinata, sirinaDodatka, visinaDodatka);
        this.korisnikTagovan = korisnikTagovan;
    }

    @Override
    public int minimalnaSirina() {
        return 80;
    }

    @Override
    public int minimalnaVisina() {
        return 50;
    }

    @Override
    public void stampaj() {
        System.out.printf("[%d, %d] (%d, %d) @%s/%s\n",super.xKoordinata,super.yKoordinata,super.visinaDodatka,super.sirinaDodatka,
                this.korisnikTagovan.getUsername(),this.korisnikTagovan.generisiLinkKorisnika());
    }

    public InstagramUser getKorisnikTagovan() {
        return korisnikTagovan;
    }
    public void setKorisnikTagovan(InstagramUser korisnikTagovan) {
        this.korisnikTagovan = korisnikTagovan;
    }
}
