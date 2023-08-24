package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_03 {
    public static void main(String[] args) {
        /*
        Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
        Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1
         */
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(7);

        for (int i = numbersList.size()-1; i >= 0 ; i--) {
            System.out.print(numbersList.get(i));
            if (i != 0){
                System.out.print(", ");
            }
        }
    }
}
