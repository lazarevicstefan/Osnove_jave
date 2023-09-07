package p07_09_2023.Zadatak_02;

public class Main {
    public static void main(String[] args) {
        SlackMessage m1 = new SlackMessage();
        m1.ime = "Stefan";
        m1.prezime = "Lazarevic";
        m1.tekstPoruke = "Hello World";
        m1.datumIVremePoslatePoruke = "07.09.2023 21:34";

        SlackMessage m2 = new SlackMessage();
        m2.ime = "Pera";
        m2.prezime = "Peric";
        m2.tekstPoruke = "Hello Everyone";
        m2.datumIVremePoslatePoruke = "07.09.2023 21:36";

        System.out.println(m1.ime + " " + m1.prezime + " - " + m1.datumIVremePoslatePoruke + System.lineSeparator() + m1.tekstPoruke);
        System.out.println();
        System.out.println(m2.ime + " " + m2.prezime + " - " + m2.datumIVremePoslatePoruke + System.lineSeparator() + m2.tekstPoruke);

    }
}
