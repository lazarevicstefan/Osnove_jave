package p12_09_2023.Zadatak_03;

public class ViberReakcija {
    private String emoji;
    private ViberKorisnik korisnikKojiJeReagovao;

    public ViberReakcija(String emoji, ViberKorisnik korisnikKojiJeReagovao) {
        this.emoji = emoji;
        this.korisnikKojiJeReagovao = korisnikKojiJeReagovao;
    }

    public String getEmoji() {
        return emoji;
    }
    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }
    public ViberKorisnik getKorisnikKojiJeReagovao() {
        return korisnikKojiJeReagovao;
    }
    public void setKorisnikKojiJeReagovao(ViberKorisnik korisnikKojiJeReagovao) {
        this.korisnikKojiJeReagovao = korisnikKojiJeReagovao;
    }
}
