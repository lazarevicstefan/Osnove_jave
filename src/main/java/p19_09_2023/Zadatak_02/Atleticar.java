package p19_09_2023.Zadatak_02;

public abstract class Atleticar {
    protected String imePrezime;
    protected double rezultat;

    public abstract boolean daLiJeRezultatBolji (Atleticar atleticar);
    public void stampaj (){
        System.out.println(this.imePrezime + ", " + this.rezultat);
    }
}
