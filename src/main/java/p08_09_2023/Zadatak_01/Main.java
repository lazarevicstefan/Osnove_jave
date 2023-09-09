package p08_09_2023.Zadatak_01;

public class Main {
    public static void main(String[] args) {
        SlackMessage m1 = new SlackMessage();
        m1.ime = "Stefan";
        m1.prezime = "Lazarevic";
        m1.tekstPoruke = "Hello World";
        m1.datumIVremePoslatePoruke = "07.09.2023 21:34";

        m1.stampaj();
        m1.azuriranjePoruke("Nova poruka","08.09.2023 18:51");
        m1.stampaj();
    }
}
