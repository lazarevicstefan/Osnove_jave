package p18_09_2023.Zadatak_03;

public class Pravougaonik extends Figura{
    private int stranicaA;
    private int stranicaB;

    public Pravougaonik() {
    }

    public Pravougaonik(int stranicaA, int stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    @Override
    public double povrsina() {
        return stranicaA * stranicaB;
    }

    @Override
    public double obim() {
        return 2 * stranicaA + 2 * stranicaB;
    }
    public int getStranicaA() {
        return stranicaA;
    }
    public void setStranicaA(int stranicaA) {
        this.stranicaA = stranicaA;
    }
    public int getStranicaB() {
        return stranicaB;
    }
    public void setStranicaB(int stranicaB) {
        this.stranicaB = stranicaB;
    }
}
