package p11_09_2023.Zadatak_02;

public class Main {
    public static void main(String[] args) {
        Tacka t1 = new Tacka();
        t1.setX(10);
        t1.setY(20);

        Tacka t2 = new Tacka(30,40);

        t1.stampaj();
        System.out.println();
        t2.stampaj();

    }
}
