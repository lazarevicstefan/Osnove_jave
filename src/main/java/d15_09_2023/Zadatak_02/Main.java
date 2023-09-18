package d15_09_2023.Zadatak_02;

public class Main {
    public static void main(String[] args) {
        /*
        Kreirati klasu Karton koja ima:
        tip kartona (crveni, zuti)
        konstuktore za koje mislite da ce vam trebati
        gettere i settere za karton

        Kreirati klasu Osoba koja ima:
        ime i prezime
        jmbg
        godinu rodjenja
        default-ni konstuktor
        konstuktor sa parametrima
        gettere i settere
        metodu stampaj koja stampa u formatu:
        (ime i prezime), (jmbg), (godina rodjenja)

        Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
        broj (broj koji igrac nosi)
        poziciju koju igra (odbrambeni, napadac, … )
        niz kartona
        kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
        default-ni konstuktor
        konstuktor sa parametrima
        gettere i settere za broj, kapiten i poziciju
        metodu dodaj karton, gde se dodaje karton u niz
        metodu koja vraca broj zutih kartona
        metodu koja vraca broj crvenih kartona
        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

        U glavnom programu kreirati igraca i dodati mu nekoliko kartona.
        */
        Igrac igrac = new Igrac("Stefan Lazarevic","2858994168161",1990,10,"napadac",true);
        Igrac igrac2 = new Igrac("Pera Peric","5964994168161",1980,20,"odbrana",false);

        igrac.dodajKarton(new Karton("zuti"));
        igrac2.dodajKarton(new Karton("crveni"));
        igrac.dodajKarton(new Karton("zuti"));

        igrac.print();
        System.out.println("Zuti kartoni:" + igrac.vratiZuteKartone());
        System.out.println("Crveni kartoni:" + igrac.vratiCrveneKartone());
        System.out.println();
        igrac2.print();
        System.out.println("Zuti kartoni:" + igrac2.vratiZuteKartone());
        System.out.println("Crveni kartoni:" + igrac2.vratiCrveneKartone());

    }
}
