package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaBrojeva = new ArrayList<>();

        System.out.print("Unesite N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            listaBrojeva.add(scanner.nextInt());
        }

        for (int i = 0; i < listaBrojeva.size(); i++) {
            System.out.print(listaBrojeva.get(i));
            if (listaBrojeva.size()-1 != i){
                System.out.print(", ");
            }
        }

    }
}
