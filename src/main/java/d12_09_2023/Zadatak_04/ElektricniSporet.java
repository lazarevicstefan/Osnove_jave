package d12_09_2023.Zadatak_04;

public class ElektricniSporet {
    private String markaSporeta;
    private int garancijaGodina;
    private int maksimalanBrojUkljucenihRingli;
    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;

    public ElektricniSporet(String markaSporeta, int garancijaGodina, int maksimalanBrojUkljucenihRingli, Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.markaSporeta = markaSporeta;
        this.garancijaGodina = garancijaGodina;
        this.maksimalanBrojUkljucenihRingli = maksimalanBrojUkljucenihRingli;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }
    public void pojacaj (int pozicija){
        int brojac = 1;
        if (this.goreLevo.daLiJeUkljucenaRingla()) brojac++;
        if (this.goreDesno.daLiJeUkljucenaRingla()) brojac++;
        if (this.doleLevo.daLiJeUkljucenaRingla()) brojac++;
        if (this.doleDesno.daLiJeUkljucenaRingla()) brojac++;

        if (pozicija == 1){
            if (brojac > this.maksimalanBrojUkljucenihRingli){
                iskljuciRunglu(2);
                iskljuciRunglu(3);
                iskljuciRunglu(4);
            }
            this.goreLevo.pojacajRinglu();
        }else if (pozicija == 2){
            if (brojac > this.maksimalanBrojUkljucenihRingli){
                iskljuciRunglu(1);
                iskljuciRunglu(3);
                iskljuciRunglu(4);
            }
            this.goreDesno.pojacajRinglu();
        }else if (pozicija == 3){
            if (brojac > this.maksimalanBrojUkljucenihRingli){
                iskljuciRunglu(1);
                iskljuciRunglu(2);
                iskljuciRunglu(4);
            }
            this.doleLevo.pojacajRinglu();
        }else if (pozicija == 4){
            if (brojac > this.maksimalanBrojUkljucenihRingli){
                iskljuciRunglu(1);
                iskljuciRunglu(3);
                iskljuciRunglu(2);
            }
            this.doleDesno.pojacajRinglu();
        }
    }
    public double ukupnaPotrosnjaSporeta (int vreme){
        return this.goreLevo.izracunajPotrosnju(vreme) +
                this.goreDesno.izracunajPotrosnju(vreme) +
                this.doleLevo.izracunajPotrosnju(vreme) +
                this.doleDesno.izracunajPotrosnju(vreme);
    }
    public void stampaj (){
        System.out.println(this.markaSporeta + " - " + this.garancijaGodina);
        System.out.println("Ringle:");
        System.out.println("Gore levo:");
        this.goreLevo.daLiJeUkljucenaRingla();
        this.goreLevo.stampaj();

        System.out.println("Gore desno:");
        this.goreDesno.daLiJeUkljucenaRingla();
        this.goreDesno.stampaj();

        System.out.println("Dole levo:");
        this.doleLevo.daLiJeUkljucenaRingla();
        this.doleLevo.stampaj();

        System.out.println("Dole desno:");
        this.doleDesno.daLiJeUkljucenaRingla();
        this.doleDesno.stampaj();
    }
    public void iskljuciRunglu (int pozicija){
        if (pozicija == 1){
            this.goreLevo.iskljuciRinglu();
        }else if (pozicija == 2){
            this.goreDesno.iskljuciRinglu();
        }else if (pozicija == 3){
            this.doleLevo.iskljuciRinglu();
        }else if (pozicija == 4){
            this.doleDesno.iskljuciRinglu();
        }
    }

    public String getMarkaSporeta() {
        return markaSporeta;
    }
    public int getGarancijaGodina() {
        return garancijaGodina;
    }
    public int getMaksimalanBrojUkljucenihRingli() {
        return maksimalanBrojUkljucenihRingli;
    }
    public Ringla getGoreLevo() {
        return goreLevo;
    }
    public Ringla getGoreDesno() {
        return goreDesno;
    }
    public Ringla getDoleLevo() {
        return doleLevo;
    }
    public Ringla getDoleDesno() {
        return doleDesno;
    }
}
