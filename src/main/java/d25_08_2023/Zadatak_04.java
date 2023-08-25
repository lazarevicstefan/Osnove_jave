package d25_08_2023;

public class Zadatak_04 {
    public static void main(String[] args) {
        /*
        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
        / / / / /
         */
        printN(5,'/');
    }
    public static void printN (int n, char character){
        for (int i = 0; i < n; i++) {
            System.out.print(character);
        }
    }
}
