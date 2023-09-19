package p19_09_2023.Zadatak_02;

public class Main {
    public static void main(String[] args) {
        /*
        Kreirati apstraktnu klasu Atleticar čiji su tributi:
        ime i prezime privatni
        i rezultat ostvaren na takmičenju koji je zasticen
        Javne metode klase su:
        apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
        metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)
        Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat, a kod skakača veći.
        Kreirati i klasu Disciplina čiji su privatni atributi:
        ime discipline
        tip discipline (Trkacka ili Skakacka)
        niz atletičara koji učestvuju u toj disciplini.
        U javnom delu klase definisati:
        konstuktore, gettere i settere
        konstruktor koji postavlja ime discipline i tip
        metodu dodaj atleticara u disciplinu
        metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
        (za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom
        (za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.
        U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,
        (za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.

         */

        Skakac skakac = new Skakac();
        skakac.imePrezime = "Stefan Lazarevic";
        skakac.rezultat = 100.1;
        Skakac skakac2 = new Skakac();
        skakac2.imePrezime = "Milos Milosevic";
        skakac2.rezultat = 112.1;

        Trkac trkac = new Trkac();
        trkac.imePrezime = "Pera Peric";
        trkac.rezultat = 200.8;
        Trkac trkac2 = new Trkac();
        trkac2.imePrezime = "Petar Petrovic";
        trkac2.rezultat = 199.8;

        Disciplina disciplina = new Disciplina("110m s preponama","Trkac");
        disciplina.dodajAtleticara(skakac);
        disciplina.dodajAtleticara(skakac2);
        disciplina.prikaziNajboljegAtleticara();

        Disciplina disciplina2 = new Disciplina("Skok u dalj","Skakac");
        disciplina2.dodajAtleticara(trkac);
        disciplina2.dodajAtleticara(trkac2);
        disciplina2.prikaziNajboljegAtleticara();

    }
}
