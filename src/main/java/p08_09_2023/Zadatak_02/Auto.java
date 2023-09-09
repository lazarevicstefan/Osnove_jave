package p08_09_2023.Zadatak_02;

public class Auto {
    public String ime;
    public String prezime;
    public String marka;
    public int brojVrata;
    public double potrosnja;
    public int trenutnaBrzina;
    public int godinaProizvodnje;
    public int mesecRegistracijeDo;
    public int kubikaza;
    public String brojRegistracije;
    public boolean daLiJeUkljucenaKlima;
    public int maksimalnaBrzina;
    public void stampajTablu (){
        int brzina = (this.trenutnaBrzina * 100) / maksimalnaBrzina;
        for (int i = 0; i < 100; i++) {
            if (i < brzina){
                System.out.print("|");
            }else {
                System.out.print(".");
            }
        }
        System.out.println(this.trenutnaBrzina + " / " + this.maksimalnaBrzina + "km/h");
    }
    public void dodajGas (){
        int brzina = this.trenutnaBrzina + 10;
        if (brzina < this.maksimalnaBrzina){
            this.trenutnaBrzina += 10;
        }else this.trenutnaBrzina = this.maksimalnaBrzina;
    }
    public void koci (){
        int brzina = trenutnaBrzina - 10;
        if (brzina > 0){
            this.trenutnaBrzina = brzina;
        }else this.trenutnaBrzina = 0;
    }
    public double trenutnaPotrosnja (){
        double klima = 1.0;
        if (daLiJeUkljucenaKlima){
            klima = 1.2;
        }
        return (this.trenutnaBrzina / 100.0 * this.potrosnja) * klima;
    }
    public boolean daLiJeOldtimer (){
        return this.godinaProizvodnje < 1950;
    }
    public boolean daLiJeIsteklaregistracija (int trenutniMesec){
        return trenutniMesec < this.mesecRegistracijeDo;
    }
    public double cenaRegistracije (){
        double cena = this.kubikaza * 100.0;
        if (this.kubikaza > 2000){
            cena *= 1.3;
        }
        return cena;
    }

    public void stampaj (){
        System.out.println(this.ime + " " + this.prezime);
        System.out.println(this.marka + " - " + this.brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + " l na 100km");
        System.out.println(this.trenutnaBrzina + " km/h je trenutna brzina.");
        System.out.println("Cena registracije vozila je: " + this.cenaRegistracije());
        System.out.println("Trenutna potrosnja: " + this.trenutnaPotrosnja());
    }
    public boolean daLiJePrekoracio (int ogranicenjeBrzine){
        return this.trenutnaBrzina > ogranicenjeBrzine;
    }
    public double novcanaKazna (int ogranicenjeBrzine){
        if (this.daLiJePrekoracio(ogranicenjeBrzine)){
            double razlika = this.trenutnaBrzina - ogranicenjeBrzine;
            return razlika * 1000.00;
        }
        return 0.0;
    }
}
