package d25_08_2023;

public class Zadatak_06 {
    public static void main(String[] args) {
        /*
        Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.

        Primer izvrsenja:
        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
        */
        System.out.println("ima za rezultat: " + izbroji(5, 10));
        System.out.println("ima za rezultat: " + izbroji(-5, 1));
    }

    public static int izbroji(int a, int b) {
        int count = 0;
        for (int i = a + 1; i < b; i++) {
            count++;
        }
        return count;
    }
}
