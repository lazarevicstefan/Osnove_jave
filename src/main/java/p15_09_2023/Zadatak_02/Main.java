package p15_09_2023.Zadatak_02;

public class Main {
    public static void main(String[] args) {
        VisaKartica visaKartica = new VisaKartica(20000,"117-16816164684-95",2028,8,"Stefan Lazarevic");
        MasterKartica masterKartica = new MasterKartica(40000,"110-1651864684-84",2026,2);

        visaKartica.stampaj();
        System.out.println();

        visaKartica.dodajSredstva(1000);
        visaKartica.stampaj();
        System.out.println();

        visaKartica.izvrsiTransakciju(1000);
        visaKartica.stampaj();
        System.out.println();

        masterKartica.stampaj();
        System.out.println();
        masterKartica.izvrsiTransakciju(2000);

        masterKartica.stampaj();
        System.out.println();

        masterKartica.naplatiOdrzavanje();
        masterKartica.stampaj();

    }
}
