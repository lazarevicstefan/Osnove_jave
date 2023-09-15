package p15_09_2023.Zadatak_02;

public class MasterKartica extends PlatnaKartica{

    public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);
    }
    @Override
    public void izvrsiTransakciju(double skiniSumu){
        double provizija = skiniSumu * 0.015;
        if (provizija < 4){
            provizija = 4.0;
        }
        double ukupno = skiniSumu + provizija;
        super.suma -= ukupno;
    }
    public void naplatiOdrzavanje (){
        super.suma -= 2.0;
    }
    @Override
    public void stampaj (){
        System.out.print("Master Card: ");
        super.stampaj();
    }


}
