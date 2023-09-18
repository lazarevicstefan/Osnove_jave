package p18_09_2023.Zadatak_03;

public class JednakostranicniTrougao extends Figura{
    private int stranicaA;

    public JednakostranicniTrougao() {
    }

    public JednakostranicniTrougao(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    @Override
    public double povrsina() {
        return (stranicaA * stranicaA) * 1.73205 / 4;
    }

    @Override
    public double obim() {
        return 3 * stranicaA;
    }

    public int getStranicaA() {
        return stranicaA;
    }
    public void setStranicaA(int stranicaA) {
        this.stranicaA = stranicaA;
    }
}
