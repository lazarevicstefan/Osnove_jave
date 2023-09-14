package p14_09_2023.Zadatak_02;

public class Main {
    public static void main(String[] args) {
        HistoryPage page1 = new HistoryPage("google", "http://google.com",19,15);
        HistoryPage page2 = new HistoryPage("facebook", "http://facebook.com",16,35);
        HistoryPage page3 = new HistoryPage("linkedin", "http://linkedin.com",21,45);

        History history = new History();
        history.otvoriStranicu(page1);
        history.otvoriStranicu(page2);
        history.otvoriStranicu(page3);
        System.out.println("Ispis cele istorije bez kolacicima.");
        history.pogledajIstoriju();
        System.out.println();

        page1.dodajKredencijale("user1","pass1");
        history.sacuvajKredecijale("facebook", "user2","pass2");
        history.sacuvajKredecijale("linkedin","userlink","passlink");
        System.out.println("Ispis cele istorije sa kolacicima.");
        history.pogledajIstoriju();

        System.out.println();
        System.out.println("Obrisani su kolacici za stranicu \"http://google.com\".");
        history.obrisiKolaciceZaLink("http://google.com");
        history.pogledajIstoriju();

        System.out.println();
        System.out.println("Obrisan je link \"http://google.com\" iz istorije.");
        history.obrisiPremaLinku("http://google.com");
        history.pogledajIstoriju();

        System.out.println();
        System.out.println("Trenutno vreme je 22:30, obrisani su kolacici u zadnjih sat vremena.");
        history.obrisiSveKolaciceZaZadnjihSatVremena(22,30);
        history.pogledajIstoriju();

        System.out.println();
        System.out.println("Obrisani su svi kolacici za sve sajtove.");
        history.obrisiSveKolacice();
        history.pogledajIstoriju();

        System.out.println();
        System.out.println("Obrisanja je cela istorija.");
        history.obrisiIstoriju();
        history.pogledajIstoriju();

    }
}
