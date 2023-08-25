package d25_08_2023;

public class Zadatak_02 {
    public static void main(String[] args) {
        /*
        Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu
        vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
         */
        System.out.println(concateNumbers(2,3));
        System.out.println(concateNumbers(6,2));
    }
    public static int concateNumbers (int numb1, int numb2){
        return numb1 * 10 + numb2;
    }
}
