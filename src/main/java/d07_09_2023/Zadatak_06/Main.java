package d07_09_2023.Zadatak_06;

public class Main {
    public static void main(String[] args) {
        Vozac vozac1 = new Vozac();
        vozac1.ime = "Stefan";
        vozac1.prezime = "Lazarevic";
        vozac1.jmbg = "1234567891234";
        vozac1.brojVozackeDozvole = 74185244;
        vozac1.datumIstekaDozvole = "06.2027";

        Vozilo vozilo1 = new Vozilo();
        vozilo1.marka = "Volkswagen";
        vozilo1.model = "Caddy";
        vozilo1.godina = 2018;
        vozilo1.registarskiBroj = "NI-123-AS";

        Ruta ruta1 = new Ruta();
        ruta1.polaznaTacka = "Nis";
        ruta1.odrediste = "Beograd";
        ruta1.duzinaRute = 230.8;
        ruta1.ocekivanoVremePutovanjaUMinutima = 200;

        System.out.printf("Auto marke: %s, model: %s, godiste: %d, sa registarskom oznakom: %s.\n" +
                "Vozilom upravlja vozac:\nIme: %s, prezime: %s, jmbg: %s, broj vozacke dozvolje: %d, datum isteka vozacke dozvole: %s\n" +
                "Krece se rutom od %s ka %s, vreme ocekivano za ovu rutu je %d sati i %d minuta (%.2fkm)",
                vozilo1.marka,vozilo1.model,vozilo1.godina,vozilo1.registarskiBroj,
                vozac1.ime,vozac1.prezime,vozac1.jmbg,vozac1.brojVozackeDozvole,vozac1.datumIstekaDozvole,
                ruta1.polaznaTacka,ruta1.odrediste,ruta1.ocekivanoVremePutovanjaUMinutima / 60,ruta1.ocekivanoVremePutovanjaUMinutima % 60,ruta1.duzinaRute);
    }
}
