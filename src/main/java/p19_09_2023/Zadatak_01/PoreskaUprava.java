package p19_09_2023.Zadatak_01;

import java.util.ArrayList;
import java.util.List;

public class PoreskaUprava {
    private String imeGrada;
    private List<Objekat> nizObjekata;

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
        nizObjekata = new ArrayList<>();
    }

    public void dodajObjekat (Objekat objekat){
        this.nizObjekata.add(objekat);
    }
    public Objekat najveciPorez(){
        Objekat najveci = this.nizObjekata.get(0);
        for (Objekat o: this.nizObjekata){
            if (o.porezObjekta() > najveci.porezObjekta()){
                najveci = o;
            }
        }
        return najveci;
    }
    public Objekat najmanjiPorez(){
        Objekat najmanji = this.nizObjekata.get(0);
        for (Objekat o: this.nizObjekata){
            if (o.porezObjekta() < najmanji.porezObjekta()){
                najmanji = o;
            }
        }
        return najmanji;
    }
    public double ukupanPorezZaCeoGrad(){
        double ukupan = 0.0;
        for (Objekat o : this.nizObjekata){
            ukupan += o.porezObjekta();
        }
        return ukupan;
    }
    public void stampajSveObjekte(){
        for (Objekat o : this.nizObjekata){
            o.stampaj();
        }
    }
}
