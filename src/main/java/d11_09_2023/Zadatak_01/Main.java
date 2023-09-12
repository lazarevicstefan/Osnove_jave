package d11_09_2023.Zadatak_01;

public class Main {
    public static void main(String[] args) {
        /*
        Kreirati klasu Autor koja ima
        -ime i prezime
        -konstuktore koje mislite da su vam potrebni
        -gettere i settere za atribute
        -metodu print koja stampa u formatu:
        (ime autora) (prezime autora)

        Kreirati klasu Knjiga koji ima:
        -ISBN
        -naziv
        -godina izdanja
        -autor
        -konstuktore koje mislite da su vam potrebni
        -gettere i settere za atribute
        -metodu print koja stampa u formatu (izbegavati dupliranje koda):
        (ISBN)
        (naziv) - (godina izdanja)
        autor: (ime autora) (prezime autora)

            U glavnom programu napraviti vise autora sa vise knjiga.
         */
        Autor autor1 = new Autor("Pera Peric");
        Autor autor2 = new Autor("Sima Simic");

        Knjiga knjiga1 = new Knjiga(1234, "Knjiga 1", 2008);
        knjiga1.setAutor(autor1);

        Knjiga knjiga2 = new Knjiga(1471, "Knjiga 2", 2004);

        Knjiga knjiga3 = new Knjiga(2511, "Knjiga 3", 2004, autor2);

        Knjiga knjiga4 = new Knjiga(8415, "Knjiga 4", 1998, autor2);

        knjiga1.print();
        knjiga2.print();
        knjiga3.print();
        knjiga4.print();
    }
}
