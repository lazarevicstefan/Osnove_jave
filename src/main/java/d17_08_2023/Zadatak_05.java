package d17_08_2023;

import java.util.Scanner;

public class Zadatak_05 {
    public static void main(String[] args) {
        /*
        Napisati program koji u zavisnosti od operatora koji unosi korisnik sa
        tastature (operator je string i moze imati vrednosti +, - , *, /) racuna
        i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili kolicnik za
        dva broja a i b uneta sa tastature.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = scanner.nextInt();

        System.out.print("Unesite b: ");
        int b = scanner.nextInt();

        System.out.print("Unesite operator: ");
        String operator = scanner.next();

        int resenje = 0;
        if (operator.equals("+")){
            resenje = a + b;
        }else if (operator.equals("-")){
            resenje = a - b;
        }else if (operator.equals("*")) {
            resenje = a * b;
        }else if (operator.equals("/")){
            resenje = a / b;
        }

        System.out.println("Rezultat: " + resenje);

    }
}
