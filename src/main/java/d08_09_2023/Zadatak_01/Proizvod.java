package d08_09_2023.Zadatak_01;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezinaUgramima;
    public void stampaj (){
        System.out.println(this.naziv + ", " + this.cena + ", " + this.tezinaUgramima);
    }
    public void povecajCenu (double povecanje){
        this.cena += povecanje;
    }
    public double vratiCenuSaPopustom (int popust){
        return this.cena / 100.0 * (100.0 - popust);
    }
    public double racunajPostarinu (){
        if (this.tezinaUgramima <= 100){
            return 200.0;
        }else if (this.tezinaUgramima <= 500){
            return 400.0;
        }else {
            return 1000.0;
        }
    }
}
