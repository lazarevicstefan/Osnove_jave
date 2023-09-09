package p08_09_2023.Zadatak_01;

public class SlackMessage {
    public String tekstPoruke;
    public String ime;
    public String prezime;
    public String datumIVremePoslatePoruke;
    public String azuriranaPorukaVreme = "";

    public void azuriranjePoruke (String novaPoruka, String noviDatum){
        this.tekstPoruke = novaPoruka;
        this.azuriranaPorukaVreme = noviDatum;
    }
    public void stampaj (){
        String vremeAkoJeAzurirano = "";
        if (!this.azuriranaPorukaVreme.isEmpty()) vremeAkoJeAzurirano = " (azurirana " + this.azuriranaPorukaVreme + ")";
        System.out.println(this.ime + " " + this.prezime + " - " + this.datumIVremePoslatePoruke + vremeAkoJeAzurirano + System.lineSeparator() + this.tekstPoruke);
    }
}
