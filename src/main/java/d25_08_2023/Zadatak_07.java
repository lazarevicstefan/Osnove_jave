package d25_08_2023;

public class Zadatak_07 {
    public static void main(String[] args) {
        /*
        Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

        Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
        Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4
         */
        System.out.println(najmanjiBroj(4,6,1));
        System.out.println(najmanjiBroj(4,6,33));
    }
    public static int najmanjiBroj (int a, int b, int c){
        int najmanji = a;
        if (b < najmanji) najmanji = b;
        if (c < najmanji) najmanji = c;
        return najmanji;
    }
}
