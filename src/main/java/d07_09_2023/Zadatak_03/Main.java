package d07_09_2023.Zadatak_03;

public class Main {
    public static void main(String[] args) {
        Proizvod p1 = new Proizvod();
        p1.naziv = "Hleb";
        p1.cena = 80.0;

        Proizvod p2 = new Proizvod();
        p2.naziv = "Mleko";
        p2.cena = 120.0;

        Proizvod p3 = new Proizvod();
        p3.naziv = "Sladoled";
        p3.cena = 150.0;

        System.out.println(p1.naziv + " " + p1.cena);
        System.out.println(p2.naziv + " " + p2.cena);
        System.out.println(p3.naziv + " " + p3.cena);
    }
}
