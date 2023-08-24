package d24_08_2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_06 {
    public static void main(String[] args) {
        /*
        Napisati program koji vrsi proveru linkova sa stranice. Program cuva 3 niza:
        niz linkova
        niz ocekivanih status kodova za linkove iz prvog niza (expected status codes)
        niz status kodova koje vracaju linkovi iz prvog niza (actual status codes)
            Nizovi potrebni za ovaj primer:
        linkovi
        https://cms.demo.katalon.com/cart/
        https://cms.demo.katalon.com/shop/
        https://cms.demo.katalon.com/account/
        https://cms.demo.katalon.com/cart/
        https://cms.demo.katalon.com/test/
        expected status codes
        200
        200
        404
        204
        200
        actual status codes
        200
        200
        400
        200
        404
        Program za svaki link vrsi proveru ocekivane i dobijene vrednosti za status kod.
        Ukoliko se actual i expected vrednosti ne poklapaju ispisati gresku u formatu:
        Assertion Error: Link <link> expected status code <expected code> but got <actual code>
        Primer izvrsenja:
        Assertion Error: https://cms.demo.katalon.com/account/ expected 404 but got 400
        Assertion Error: https://cms.demo.katalon.com/cart/ expected 204 but got 200
        Assertion Error: https://cms.demo.katalon.com/test/ expected 200 but got 404
         */
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nizLinova = new ArrayList<>();
        ArrayList<Integer> nizOcekivanih = new ArrayList<>();
        ArrayList<Integer> nizDobijenih = new ArrayList<>();

        nizLinova.add("https://cms.demo.katalon.com/cart/");
        nizLinova.add("https://cms.demo.katalon.com/shop/");
        nizLinova.add("https://cms.demo.katalon.com/account/");
        nizLinova.add("https://cms.demo.katalon.com/cart/");
        nizLinova.add("https://cms.demo.katalon.com/test/");

        nizOcekivanih.add(200);
        nizOcekivanih.add(200);
        nizOcekivanih.add(404);
        nizOcekivanih.add(204);
        nizOcekivanih.add(200);

        nizDobijenih.add(200);
        nizDobijenih.add(200);
        nizDobijenih.add(400);
        nizDobijenih.add(200);
        nizDobijenih.add(404);

        for (int i = 0; i < nizLinova.size(); i++) {
            if (!nizOcekivanih.get(i).equals(nizDobijenih.get(i))){
                System.out.println("Assertion Error: " + nizLinova.get(i) +
                        " expected " + nizOcekivanih.get(i) + " but got " + nizDobijenih.get(i));
            }
        }
    }
}
