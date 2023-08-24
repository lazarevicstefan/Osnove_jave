package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_05 {
    public static void main(String[] args) {
        /*
        Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
            Primer izvrsenja:
        Unesite N: 5
        Unesite broj: 1
        Unesite broj: 3
        Unesite broj: 7
        Unesite broj: 3
        Unesite broj: 9
        Unesite X: 3
         */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();

        System.out.print("Unesite N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            numbersList.add(scanner.nextInt());
        }

        System.out.print("Unesite X: ");
        int x = scanner.nextInt();

        for (int i = 0; i < numbersList.size(); i++){
            if (numbersList.get(i) == x){
                System.out.print(i + ", ");
            }
        }
    }
}
