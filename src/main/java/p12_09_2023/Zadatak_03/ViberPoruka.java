package p12_09_2023.Zadatak_03;

public class ViberPoruka {
    private String poruka;
    private String vremePoslatePoruke;
    private ViberKorisnik korisnikKojiJePoslao;
    private ViberKorisnik korisnikKomeJePoslata;
    private ViberReakcija viberReakcija;
    public ViberPoruka(String poruka, String vremePoslatePoruke, ViberKorisnik korisnikKojiJePoslao, ViberKorisnik korisnikKomeJePoslata) {
        this.poruka = poruka;
        this.vremePoslatePoruke = vremePoslatePoruke;
        this.korisnikKojiJePoslao = korisnikKojiJePoslao;
        this.korisnikKomeJePoslata = korisnikKomeJePoslata;
    }
    public void stampa (){
        String aktivan = korisnikKojiJePoslao.isDaLiJeAktivan() ? "Active Now" : "Not Active";
        System.out.println("From: " + this.korisnikKojiJePoslao.getImePrezime() + " * " + aktivan + " - at " + this.vremePoslatePoruke);
        System.out.println("To: " + this.korisnikKomeJePoslata.getImePrezime());
        System.out.print(this.poruka);
        if (this.viberReakcija != null){
            System.out.println(" : " + this.viberReakcija.getEmoji() + " from " + this.viberReakcija.getKorisnikKojiJeReagovao().getImePrezime());
        }else {
            System.out.println();
        }
    }

    public void reakcija(String emoji, ViberKorisnik korisnikKojiJeReagovao) {
        ViberReakcija vr = new ViberReakcija(emoji,korisnikKojiJeReagovao);
        this.viberReakcija = vr;
    }

    public String getPoruka() {
        return poruka;
    }
    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }
    public String getVremePoslatePoruke() {
        return vremePoslatePoruke;
    }
    public void setVremePoslatePoruke(String vremePoslatePoruke) {
        this.vremePoslatePoruke = vremePoslatePoruke;
    }
    public ViberKorisnik getKorisnikKojiJePoslao() {
        return korisnikKojiJePoslao;
    }
    public void setKorisnikKojiJePoslao(ViberKorisnik korisnikKojiJePoslao) {
        this.korisnikKojiJePoslao = korisnikKojiJePoslao;
    }
    public ViberKorisnik getKorisnikKomeJePoslata() {
        return korisnikKomeJePoslata;
    }
    public void setKorisnikKomeJePoslata(ViberKorisnik korisnikKomeJePoslata) {
        this.korisnikKomeJePoslata = korisnikKomeJePoslata;
    }
}
