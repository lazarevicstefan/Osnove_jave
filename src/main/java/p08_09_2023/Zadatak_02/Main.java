package p08_09_2023.Zadatak_02;

public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto();
        a1.ime = "Stefan";
        a1.prezime = "Lazarevic";
        a1.marka = "Audi";
        a1.brojVrata = 5;
        a1.potrosnja = 7.5;
        a1.trenutnaBrzina = 160;
        a1.godinaProizvodnje = 2008;
        a1.mesecRegistracijeDo = 7;
        a1.kubikaza = 2000;
        a1.brojRegistracije = "NI-123-AS";
        a1.daLiJeUkljucenaKlima = true;
        a1.maksimalnaBrzina = 240;

        a1.dodajGas();
        a1.dodajGas();
        a1.dodajGas();
        a1.dodajGas();

        a1.koci();

        int ogranicenjeNaPutu = 130;
        int trenutniMesec = 9;

        a1.stampaj();

        if (a1.daLiJePrekoracio(ogranicenjeNaPutu)){
            System.out.println("Auto je prekoracio brzinu. Novcana kazna je: "+ a1.novcanaKazna(ogranicenjeNaPutu));
        }else {
            System.out.println("Auto nije prekoracio brzinu");
        }

        if (a1.daLiJeOldtimer()){
            System.out.println("Auto je Oldtimer!");
        }else {
            System.out.println("Auto nije Oldtimer.");
        }

        if (a1.daLiJeIsteklaregistracija(trenutniMesec)){
            System.out.println("Registracija je istekla!");
        }else {
            System.out.println("Registracija nije istekla.");
        }


        a1.stampajTablu();

    }
}
