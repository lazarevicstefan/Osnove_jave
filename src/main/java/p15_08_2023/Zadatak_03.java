package p15_08_2023;

public class Zadatak_03 {
    public static void main(String[] args) {
//        Napisati program koji na ekranu stampa podatke u formatu:
//        [IME I PREZIME]
//        [BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//        [EMAIL]



        String name = "Stefan Lazarevic";
        String number = "38162/416-4347";
        String streetAndNumber = "Street 1/44";
        String city = "Nis";
        String email = "mail@mail.com";

        System.out.println(name);
        System.out.println(number + ", " + streetAndNumber + ", " + city);
        System.out.println(email);


    }
}
