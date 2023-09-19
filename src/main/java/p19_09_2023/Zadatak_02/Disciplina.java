package p19_09_2023.Zadatak_02;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String imeDiscipline;
    private String tipDiscipline;
    private List<Atleticar> nizAtleticara;

    public Disciplina(String imeDiscipline, String tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;
        nizAtleticara = new ArrayList<>();
    }
    public void dodajAtleticara (Atleticar atleticar){
        this.nizAtleticara.add(atleticar);
    }
    public void diskvalifikujAtleticara (String imePrezime){
        for (int i = 0; i < this.nizAtleticara.size(); i++) {
            if (this.nizAtleticara.get(i).imePrezime.equals(imePrezime)){
                this.nizAtleticara.remove(i);
            }
        }
    }
    private Atleticar vratiNajboljegAtleticara (){
        Atleticar trenutni = this.nizAtleticara.get(0);
        for (int i = 0; i < this.nizAtleticara.size(); i++) {
            if (this.nizAtleticara.get(i).daLiJeRezultatBolji(trenutni)){
                trenutni = this.nizAtleticara.get(i);
            }
        }
        return trenutni;
    }
    public void prikaziNajboljegAtleticara (){
        Atleticar najbolji = vratiNajboljegAtleticara();
        najbolji.stampaj();
    }

    public List<Atleticar> getNizAtleticara() {
        return nizAtleticara;
    }
    public String getImeDiscipline() {
        return imeDiscipline;
    }
    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }
    public String getTipDiscipline() {
        return tipDiscipline;
    }
    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }
}
