package p18_08_2023;

import java.util.Scanner;

public class Zadatak_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj A: ");
        int brojA = scanner.nextInt();
        System.out.print("Unesite broj B: ");
        int brojB = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            if (!(i == brojA || i == brojB)){
                if (i != 10){
                    System.out.print(i + ", ");
                }else {
                    System.out.print(i);
                }
            }
        }
    }
}
