package miniProjekat;

import java.util.ArrayList;

public class Zadatak_03 {
    public static void main(String[] args) {
            /*
            Napišite program koji obavlja zamenu placeholdera u SQL upitu.
            Program će sačuvati sledeće informacije:

            1. SQL upit (string) nad kojim će se obaviti zamena.
            2. Niz vrednosti (niz stringova) koje treba da se ubace umesto placeholdera u SQL upitu.

            Placeholder je označeno mesto u stringu na kom treba da se postavi prava vrednost iz niza vrednosti.
            Placeholderi su označeni kombinacijom `%` i pozicijom za zamenu. Na primer, ukoliko SQL upit izgleda ovako:

            INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('%0', '%1', '%2', '%3', '%4', '%5');

            i niz vrednosti je:
            Cardinal, Tom B. Erichsen, Skagen 21, Stavanger, 4006, Norway

            Nakon izvršenja zamene, dobiće se SQL upit:

            INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('Cardinal','Tom B. Erichsen','Skagen 21','Stavanger','4006','Norway');

            Ovaj program koristi `replace` metodu da zameni placeholder pozicije u SQL upitu sa stvarnim vrednostima iz niza.

            Objasnjanje:
            Placeholder %0 je zamenjen sa Cardinal
            Placeholder %1 je zamenjen sa Tom B. Erichsen
            Placeholder %2 je zamenjen sa Skagen 21
            Placeholder %3 je zamenjen sa Stavanger
            Placeholder %4 je zamenjen sa 4006
            Placeholder %5 je zamenjen sa Norway
         */
        String sqlUpit = "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('%0', '%1', '%2', '%3', '%4', '%5');";
        System.out.println(sqlUpit);

        ArrayList<String> nizVrednosti = new ArrayList<>();
        nizVrednosti.add("Cardinal");
        nizVrednosti.add("Tom B. Erichsen");
        nizVrednosti.add("Skagen 21");
        nizVrednosti.add("Stavanger");
        nizVrednosti.add("4006");
        nizVrednosti.add("Norway");

        for (int i = 0; i < nizVrednosti.size(); i++) {
            String old = "%" + i;
            sqlUpit = sqlUpit.replace(old, nizVrednosti.get(i));
        }
        System.out.println(sqlUpit);
    }
}
