package p17_08_2023;


import java.util.Scanner;

public class ScannerMetoda {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite vase ime: ");
        String ime = scanner.nextLine();
        System.out.print("Unesite vase prezime: ");
        String prezime = scanner.nextLine();
        System.out.println();

        System.out.println("Ime: " + ime + " Prezime: " + prezime);






    }
}
