package p12_09_2023.Zadatak_01;

public class Main {
    public static void main(String[] args) {
        ClanskaKarta clanskaKarta1 = new ClanskaKarta(5,"5123-5123");
        ClanskaKarta clanskaKarta2 = new ClanskaKarta(10,"6143-6891");

        Kupac kupac1 = new Kupac("Stefan Lazarevic",clanskaKarta1);
        Kupac kupac2 = new Kupac("Petar Petrovic",clanskaKarta2);

        Proizvod proizvod1 = new Proizvod("proizvod 1",kupac1,1890.99);
        Proizvod proizvod2 = new Proizvod("proizvod 2",kupac2,199.99);

        kupac1.stampaj();
        kupac2.stampaj();


        System.out.println();

        System.out.println("Cena za proizvod \"proizvod1\" je: " + proizvod1.racunanjeCeneProizvoda());
        System.out.println("Cena za proizvod \"proizvod2\" je: " + proizvod2.racunanjeCeneProizvoda());
        System.out.println();

        proizvod1.stampaj();
        proizvod2.stampaj();

    }
}
