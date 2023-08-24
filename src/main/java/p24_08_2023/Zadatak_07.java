package p24_08_2023;

import java.util.ArrayList;

public class Zadatak_07 {
    public static void main(String[] args) {
        ArrayList<String> paste = new ArrayList<>();
        ArrayList<Integer> cene = new ArrayList<>();
        paste.add("AGLIO E OLIO");
        cene.add(500);
        paste.add("PRIMAVERA");
        cene.add(340);
        paste.add("ARRABBIATA");
        cene.add(420);
        paste.add("NAPOLITANA");
        cene.add(440);
        paste.add("POLLO E SPINACI");
        cene.add(550);


        for (int i = 0; i < paste.size(); i++) {
            System.out.println(paste.get(i) + " ................. " + cene.get(i) + " rsd");
        }
    }
}
