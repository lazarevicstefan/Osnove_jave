package p14_09_2023.Zadatak_01;

public class Zadatak_01 {
    public static void main(String[] args) {
        Pasta pasta = new Pasta();

        Sastojak sastojak1 = new Sastojak("Sastojak1",10);
        Sastojak sastojak2 = new Sastojak("Sastojak2",20);
        Sastojak sastojak3 = new Sastojak("Sastojak3",30);

        Sastojak sastojakZaBrisanje = new Sastojak("SastojakZaBrisanje",100);


        pasta.dodajtSastojak(sastojak1);
        pasta.dodajtSastojak(sastojak2);
        pasta.dodajtSastojak(sastojak3);
        pasta.dodajtSastojak(sastojakZaBrisanje);

        pasta.stampaj();

        pasta.obrisiSastojak("SastojakZaBrisanje");

        pasta.stampaj();

    }
}
