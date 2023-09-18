package p18_09_2023.Zadatak_03;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Kreirati abstraktnu klasu Figura koja ima
        abstraktnu metodu povrsina
        abstraktnu metodu obim
        metodu koja stampa podatke u formatu:
        Povrsina je (povrsina)
        Obim je (obim)

        Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
        stranicu a
        gettere/settere/konstruktore
        implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
        implementira metodu obim

        Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
        stranice a i b
        gettere/settere/konstruktore
        implementira metodu povrsina
        implementira metodu obim
        */
        JednakostranicniTrougao jednakostranicniTrougao = new JednakostranicniTrougao(15);
        System.out.println("Jednakostranicni trougao:");
        jednakostranicniTrougao.print();

        System.out.println();
        Pravougaonik pravougaonik = new Pravougaonik(18,24);
        System.out.println("Pravougaonik:");
        pravougaonik.print();

        System.out.println();
        System.out.println();

        FigureGenerator figureGenerator = new FigureGenerator();

        Figura figura1 = figureGenerator.generator("trougao");
        Figura figura2 = figureGenerator.generator("pravougaonik");

        figura1.print();
        figura2.print();

        List<Figura> nizFigura = figureGenerator.kreirajNTrougaoIPravougaonik(10);

        System.out.println(nizFigura.size());



    }
}
