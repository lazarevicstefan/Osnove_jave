package d07_09_2023.Zadatak_02;

public class Main {
    public static void main(String[] args) {
        Automobil a1 = new Automobil();
        a1.marka = "Audi";
        a1.model = "A4";
        a1.godinaProizvodnje = 2008;

        Automobil a2 = new Automobil();
        a2.marka = "BMW";
        a2.model = "320";
        a2.godinaProizvodnje = 2009;

        Automobil a3 = new Automobil();
        a3.marka = "Mercedes";
        a3.model = "C200";
        a3.godinaProizvodnje = 2009;

        System.out.println(a1.marka + " " + a1.model + " " + a1.godinaProizvodnje);
        System.out.println(a2.marka + " " + a2.model + " " + a2.godinaProizvodnje);
        System.out.println(a3.marka + " " + a3.model + " " + a3.godinaProizvodnje);
    }
}
