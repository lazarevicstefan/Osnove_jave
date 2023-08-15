package p15_08_2023;

public class Zadatak_04 {
    public static void main(String[] args) {
//        Napisati program koji na ekranu stampa podatke u formatu:
//        Sifra [SIFRA PROIZVODA]
//        [NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//        [BOJA], [VELICINA]
//
//        Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//                Primer izvrsenja:
//        Sifra x932k20
//        Nike Patike - $90 - Popust 13.5%
//                Crna, 46.5

        String productId = "x8613";
        String productName = "T-Shirt";
        double price = 134.90;
        double discount = 13.5;
        String color = "Black";
        double size = 46.5;

        System.out.println("Product ID " + productId);
        System.out.println(productName + " - $" + price + " - Discount " + discount + "%");
        System.out.println(color + ", " + size);



    }
}
