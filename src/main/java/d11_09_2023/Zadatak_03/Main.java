package d11_09_2023.Zadatak_03;

public class Main {
    public static void main(String[] args) {
        /*
        Kreirati klasu Video koja ima:
        svi atributi su private
        id videa - koji je string i na primer izgleda v6tuOipj5mk
        naziv videa
        duzinu videa u sekundama (npr: ako je video 2min i 10s, duzina je 130)
        broj lajkova
        broj dislajkova
        broj pregleda
        metodu lajkuj - koja povecava broj lajkova za jedan
        metodu dislajkuj - koja povecava broj dislajkova za jedan
        metodu pogledaj - koja povecava broj pregleda za jedan
        gettere za sve atribute
        settere nemamo

        Kreirati klasu YoutubePlayer koja ima:
        svi atributi su private
        objekat video
        kvalitet videa (moze da bude 144, 240, 360, 480, 720, 1080)
        rezim koji moze da bude - mini player , bioskopski rezim , preko celog ekrana
        jacinu zvuka
        trenutno vreme videa u reprodukciji
        gettere za sve atribute
        nemamo setere!
        samo difoltni konstuktor, i njemu se svuk postavlja na 75 i kvalitet po difoltu na 144 kao i rezim na mini player.
        metodu ucitajVideo kojoj se prosledjuje referenca do videa koji se pusta. Trenutno vreme kada se ucita video se postavlja na nulu. Treba videu da povecamo broj pregleda!
        metodu pojacaj- koja povecava jacinu zvuka za 10. Znate da morate da vodite racuna da ne predje 100.
        metodu smanji - koja smanjuje jacinu zvuka za 10 (da ne padne ispod nule)
        metodu postaviKvalitet - metoda kao parametar prima brzinu interneta u megbajtima.
        Ako je brzina interneta ispod 2Mb -> kvalitet je 144
        Ako je brzina interneta do 4Mb -> kvalitet je 240
        Ako je brzina interneta do 6Mb -> kvalitet je 360
        Ako je brzina interneta do 8Mb -> kvalitet je 720
        Ako je brzina interneta preko 8Mb -> kvalitet je 1080
        metodu aktivirajMiniPlayerMod - koja postavlja rezim na mini player
        metodu aktivirajBioskopskiMod -  koja postavlja bioskopski rezim
        metodu aktivirajPrekoCelogEkranaMod -  koja postavlja rezim preko celog ekrana
        metodu premotajUnapred - metoda koja premotava trenutno vreme videa za 10s. Vodite racuna da ne predjete duzinu videa.
        metodu premotajUnazad - metoda vraca trenutno vreme videa za 10s. Vodite racuna da ne padnete ispod nule
        iscrtajZvuk - metoda koja ispisuje tekst koji simulira jacinu zvuka. Svaka crtica predstavlja jecinu od 10.
        Pa ako je jacina zvuka 75 - crtamo 7 crtica
        Primer stampe je:   <: |||||||
        Ako je jecina zvuka 32
        Primer stampe je: <: |||
        Ako je jacina nula
        Onda stampamo </
        [HELP] Broj crtica mozete da dobijete kao brCrtica = jacina zvuka / 10;
        Metodu iscrtaj rezim koja iscrtava rezim po izgledu:
        Ako je mini player stampa [ ]
        Ako je bioskopski stampa se  [ ..]
        Ako je preko celog ekrana  se [||||]
        Metodu iscrtajTrenutnoVreme - metoda ispisuje vreme video u formatu
        minut:sekund / minutUkupnogVideo:sekundUkupnogVidea
        minut - se racuna kao trenutno vreme / 60
        sekund - se racuna kao trenutno vreme % 60
        minutUkupnogVideo - racuna se kao ukupna duzina video u sekundama / 60
        sekundUkupnogVidea - racuna se kao ukupna duzina video u sekundama % 60
        metodu iscrtaj timeline - metoda simulira iscrtavanje timelin-a.
        Koristicemo zvezdice i tackice. idu 100 zvezdice/tackica. Zvezdice za ono sto je pogledano.
        ******************************......................................................................
        broj zvezdica = trenutno vreme * 100 / ukupno vreme videa
        A stackice su 100 - broj zvezdica
        metodu iscitaj - metoda simulira iscrtavanje celog playera
          1:03 / 2:05  Zvuk <: ||||||
         Timeline: ******************************.....................................................................
        Kvalitet: 720p
        Rezim: [||||]
         Ariana Grande - positions (official video)
        Likes  23 | Dislikes 32
        34893483 Pregleda

        metodu za sherovanje videa, metoda generise i vraca link do videa tako da link izgleda:
        https://youtu.be/v6tuOipj5mk
        Objasnjenje v6tuOipj5mk je id videa.
        */
        Video video = new Video("v6tuOipj5mk", "Ariana Grande - positions (official video)",140);
        for (int i = 0; i < 145; i++) { video.lajkuj(); }
        for (int i = 0; i < 34893; i++) { video.pogledaj(); }
        for (int i = 0; i < 32; i++) { video.dislajk(); }

        YoutubePlayer youtubePlayer = new YoutubePlayer();
        youtubePlayer.ucitajVideo(video);
        youtubePlayer.pojacaj();
        youtubePlayer.pojacaj();
        youtubePlayer.pojacaj();
        youtubePlayer.pojacaj();
        youtubePlayer.smanji();

        youtubePlayer.postaviKvalitet(6.8);
        youtubePlayer.aktivirajPrekoCelogEkranaMod();

        for (int i = 0; i < 7; i++) {youtubePlayer.premotajUnapred();}
        youtubePlayer.premotajUnazad();youtubePlayer.premotajUnazad();

        youtubePlayer.iscrtaj();

        System.out.println(youtubePlayer.serovanjeVidea());
    }
}
