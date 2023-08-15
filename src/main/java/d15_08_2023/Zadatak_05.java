package d15_08_2023;

public class Zadatak_05 {
    public static void main(String[] args) {
        /*
        Napisati program koji racuna i ispisuje povrsinu i obim trougla.
        KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla
        postavite proizvoljnu vrednost.
        Primer izvrsenja programa:
        a: 10
        Povrsina je 43.25
        Obim je 30
         */
        int a = 10;
        double KONSTANTA = 1.73;
        double povrsina = (a * a * KONSTANTA) / 4;
        int obim = 3 * a;

        System.out.println("a: " + a);
        System.out.println("Povrsina je " + povrsina);
        System.out.println("Obim je " + obim);



    }
}
