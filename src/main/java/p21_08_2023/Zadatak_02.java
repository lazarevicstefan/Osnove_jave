package p21_08_2023;

public class Zadatak_02 {
    public static void main(String[] args) {
        String skupBrojeva = "";
        for (int i = 1; i <= 10; i++) {
            String trenutni = skupBrojeva + i;
            skupBrojeva = trenutni;
        }
        System.out.println(skupBrojeva);
    }
}
