package d12_09_2023.Zadatak_03;

public class Transakcija {
    private int id;
    private Racun racunOdKogSePrenose;
    private Racun racunNaKogSePrenose;

    public Transakcija(int id, Racun racunOdKogSePrenose, Racun racunNaKogSePrenose) {
        this.id = id;
        this.racunOdKogSePrenose = racunOdKogSePrenose;
        this.racunNaKogSePrenose = racunNaKogSePrenose;
    }
    private double izracunajProviziju (double iznos){
        if (iznos < 4500){
            return 45;
        }else {
            return iznos * 0.01;
        }
    }
    public void izvrsiTransakciju (double iznos){
        if (this.racunOdKogSePrenose.getTrenutnoStanjeNaRacunu() > (iznos + izracunajProviziju(iznos))) {
            this.racunOdKogSePrenose.skiniSaRacuna((iznos + izracunajProviziju(iznos)));
            this.racunNaKogSePrenose.uplatiNaRacun(iznos);
            System.out.println("Transakcija je uspesno izvrsena!");
        }else {
        System.out.println("Transakcija nije uspela, nemate dovoljno sredstva na racunu!");
        }
        System.out.println();
    }
    public void stampaj (){
        System.out.println(this.getId());
        System.out.println("Racun sa: " + this.racunOdKogSePrenose.getImePrezime() + " - " + this.racunOdKogSePrenose.getBrojRacuna());
        System.out.println("Racun na: " + this.racunNaKogSePrenose.getImePrezime() + " - " + this.racunNaKogSePrenose.getBrojRacuna());
        System.out.println();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Racun getRacunOdKogSePrenose() {
        return racunOdKogSePrenose;
    }
    public void setRacunOdKogSePrenose(Racun racunOdKogSePrenose) {
        this.racunOdKogSePrenose = racunOdKogSePrenose;
    }
    public Racun getRacunNaKogSePrenose() {
        return racunNaKogSePrenose;
    }
    public void setRacunNaKogSePrenose(Racun racunNaKogSePrenose) {
        this.racunNaKogSePrenose = racunNaKogSePrenose;
    }
}
