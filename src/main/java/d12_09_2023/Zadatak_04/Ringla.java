package d12_09_2023.Zadatak_04;

public class Ringla {
    private String tipRingle;
    private int jacina;
    private double jacinaGrejaca;

    public Ringla(String tipRingle, double jacinaGrejaca) {
        this.tipRingle = tipRingle;
        this.jacinaGrejaca = jacinaGrejaca;
        this.jacina = 0;
    }
    public int getJacina() {
        return jacina;
    }


    private int maksimalanBrojPojacanjanja (){
        if (this.tipRingle.equals("obicna")){
            return 3;
        }else if (this.tipRingle.equals("ekspres")){
            return 12;
        }else {
            return 0;
        }
    }
    public void pojacajRinglu (){
        if (maksimalanBrojPojacanjanja() > this.jacina){
            this.jacina++;
        }
    }
    public void iskljuciRinglu (){
        this.jacina = 0;
    }
    public boolean daLiJeUkljucenaRingla (){
        return jacina > 0;
    }
    public double izracunajPotrosnju (int kolikoRadi){
        return 100.0 / maksimalanBrojPojacanjanja() * this.jacina * this.jacinaGrejaca * kolikoRadi;
    }
    public void stampaj (){
        String ukljucenaILIne = daLiJeUkljucenaRingla() ? "ukljucena" : "iskljucena";
        System.out.println("Ringla je " + ukljucenaILIne);
        System.out.println("Tip ringle: " + this.tipRingle);
        System.out.println("Jacina: " + this.jacina);
        System.out.println("Grejac: " + this.jacinaGrejaca + " KW");
    }
}
