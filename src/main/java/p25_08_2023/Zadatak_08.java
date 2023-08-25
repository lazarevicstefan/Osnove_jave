package p25_08_2023;

public class Zadatak_08 {
    public static void main(String[] args) {
        System.out.println(koverzijaIzRimskogUArapskog("V"));
        System.out.println(koverzijaIzRimskogUArapskog("III"));
    }
    public static int koverzijaIzRimskogUArapskog (String rimskiBroj){
        if (rimskiBroj.equals("I")) return 1;
        else if (rimskiBroj.equals("II")) return 2;
        else if (rimskiBroj.equals("III")) return 3;
        else if (rimskiBroj.equals("IV")) return 4;
        else if (rimskiBroj.equals("V")) return 5;
        else return 0;
    }
}
