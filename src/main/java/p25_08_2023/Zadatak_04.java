package p25_08_2023;

import java.util.Scanner;

public class Zadatak_04 {
    public static void main(String[] args) {
        zbirRazlikaProizvodIKolicnik(10,5);
        zbirRazlikaProizvodIKolicnik(20,2);
        zbirRazlikaProizvodIKolicnik(15,3);
    }
    public static void zbirRazlikaProizvodIKolicnik(int a, int b){
        int c = a + b;
        System.out.println("Zbir: " + c);
        c = a - b;
        System.out.println("Razlika: " + c);
        c = a * b;
        System.out.println("Proizvod: " + c);
        c = a / b;
        System.out.println("Kolicnik: " + c);
    }
}
