package d08_09_2023.Zadatak_03;

public class SmartAirConditioning {
    public String markaKlime;
    public int potrosnjaDokHladi;
    public int potrosnjaDokGreje;
    public int temperatura;
    public String mod;
    public void stampaj (){
        System.out.println(this.markaKlime + " - " + this.mod + " - " + this.temperatura);
    }
    public int izracunajPotrosnju (){
        int trenutniMod = 1;
        if (this.mod.equals("hladi")){
            trenutniMod = this.potrosnjaDokHladi;
        }else if (this.mod.equals("greje")){
            trenutniMod = this.potrosnjaDokGreje;
        }
        return 30 * 15 * trenutniMod;
    }
    public double izracunajKolikoPotrosiZaMesecDana (){
        int cena = 9;
        if (izracunajPotrosnju() <= 350){
            cena = 6;
        }
        return izracunajPotrosnju() * cena;
    }
}
