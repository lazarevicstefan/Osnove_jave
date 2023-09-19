package p19_09_2023.Zadatak_01;

public class Main {
    public static void main(String[] args) {
        /*
        Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi. NE NAZIVAJTE KLASU OBJECT !!
        adresa (ulica i broj)
        povrsina objekta
        zona (1, 2 ili 3)
        konstuktore, gettere i settere
        metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
        zona 1, koeficijent je 1.4
        zona 2, koeficijent je 1.1
        zona 3, koeficijent je 1.05
        abstraktnu metodu koja racuna i vraca porez objekta
        abstraktnu metodu stampaj

            Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
        konstuktore, gettere i setter
        porez racuna po formuli: koeficijent * povrsina.
        prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
            Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
        broj stanova
        konstuktore, gettere i setter
        porez racuna po formuli koeficijent * povrsina * broj stanova
        prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
            Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
        konstuktore
        porez racuna po formuli koeficijent * povrsina * 1.3
        prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
            Kreirati klasu PoreskaUprava koja za atribute ima:
        ime grada u kom se nalazi
        niz objekata
        metodu dodaj objekat
        metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
        metodu koja vraca objekat sa najmanjim porezom
        metodu koja racuna ukupan porez za ceo grad
        metodu koja stampa sve objekte
        U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 5 razlicita objekta i istestirati sve metode.
        */

        Kuca kuca1 = new Kuca("Ulica neka 1",114,1,6);
        Kuca kuca2 = new Kuca("Ulica neka 2", 97,3,7);

        Zgrada zgrada1 = new Zgrada("Ulica neka 3",920,2,20);
        Zgrada zgrada2 = new Zgrada("Ulica neka 4",1200,1,15);

        Lokal lokal1 = new Lokal("Ulica neka 5",40,1);
        Lokal lokal2 = new Lokal("Ulica neka 6", 28,1);

        PoreskaUprava poreskaUprava = new PoreskaUprava("Nis");
        poreskaUprava.dodajObjekat(kuca1);
        poreskaUprava.dodajObjekat(kuca2);
        poreskaUprava.dodajObjekat(zgrada1);
        poreskaUprava.dodajObjekat(zgrada2);
        poreskaUprava.dodajObjekat(lokal1);
        poreskaUprava.dodajObjekat(lokal2);

        System.out.print("Najveci porez: ");
        poreskaUprava.najveciPorez().stampaj();
        System.out.print("Najmanji porez: ");
        poreskaUprava.najmanjiPorez().stampaj();
        System.out.print("Ukupno porez: " + poreskaUprava.ukupanPorezZaCeoGrad());
        System.out.println();

        poreskaUprava.stampajSveObjekte();
    }
}
