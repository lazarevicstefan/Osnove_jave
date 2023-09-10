package d08_09_2023.Zadatak_03;

public class Main {
    public static void main(String[] args) {
        SmartAirConditioning smartAirConditioning = new SmartAirConditioning();
        smartAirConditioning.markaKlime = "Samsung";
        smartAirConditioning.potrosnjaDokHladi = 1;
        smartAirConditioning.potrosnjaDokGreje = 2;
        smartAirConditioning.temperatura = 22;
        smartAirConditioning.mod = "greje";

        smartAirConditioning.stampaj();
        System.out.println("Klima za mesec dana potrosi: " + smartAirConditioning.izracunajKolikoPotrosiZaMesecDana() +
                "rsd (" + smartAirConditioning.izracunajPotrosnju() + "KW)");

    }
}
