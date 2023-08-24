package p24_08_2023;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak_08 {
    public static void main(String[] args) {
        ArrayList<String> nizPoljaZaRegistraciju = new ArrayList<>();
        ArrayList<Boolean> nizObaveznihPolja = new ArrayList<>();

        nizPoljaZaRegistraciju.add("first name");
        nizPoljaZaRegistraciju.add("last name");
        nizPoljaZaRegistraciju.add("email");
        nizPoljaZaRegistraciju.add("password");
        nizPoljaZaRegistraciju.add("phone");
        nizPoljaZaRegistraciju.add("address");

        nizObaveznihPolja.add(true);
        nizObaveznihPolja.add(true);
        nizObaveznihPolja.add(true);
        nizObaveznihPolja.add(true);
        nizObaveznihPolja.add(false);
        nizObaveznihPolja.add(false);

        for (int i = 0; i < nizPoljaZaRegistraciju.size(); i++) {
            System.out.print(nizPoljaZaRegistraciju.get(i) + ": ");

            if (nizObaveznihPolja.get(i)){
                System.out.print("* ");
            }
            System.out.println("_____________________");
        }
    }
}
