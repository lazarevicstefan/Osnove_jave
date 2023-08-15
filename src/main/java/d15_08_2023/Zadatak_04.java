package d15_08_2023;

public class Zadatak_04 {
    public static void main(String[] args) {
       /*
       Napisati proram koji ima promenljivu a za koju ispisuje tablicu mnozenja.
        Napomena: Rezultati tablice mnozenja se racunaju.
        Primer izvrsenja, ako je a = 5 ispisace se
        5 x 1 = 5
        5 x 2 = 10
        5 x 3 = 15
        5 x 4 = 20
        5 x 5 = 25
        5 x 6 = 30
        5 x 7 = 35
        5 x 8 = 40
        5 x 9 = 45
        5 x 10 = 50
        */
        int a = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }


    }
}
