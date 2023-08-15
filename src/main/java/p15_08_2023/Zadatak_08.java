package p15_08_2023;

public class Zadatak_08 {
    public static void main(String[] args) {
//        Napisati program koji racuna povrsinu kvadrata stranice a, i povrsinu kruga
//        poluprecnika r. PI = 3.14. Povrsina kruga je r (na kvadrat) * pi

        int a = 5;
        int r = 3;
        double PI = 3.14;
        int povrsinaKvadrata = a * a;
        double povrsinaKruga = r * r * PI;


        System.out.println("a: " + a);
        System.out.println("Povrsina kvadrata je: " + povrsinaKvadrata);
        System.out.println("r: " + r);
        System.out.println("Povrsina kruga je: " + povrsinaKruga);




    }
}
