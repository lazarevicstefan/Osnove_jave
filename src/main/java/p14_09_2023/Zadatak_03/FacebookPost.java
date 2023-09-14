package p14_09_2023.Zadatak_03;

import java.util.ArrayList;
import java.util.List;

public class FacebookPost {
    private String imePrezimeKoJePostavio;
    private String tekstObjave;
    private List<Reakcija> reakcijaLista;

    public FacebookPost(String imePrezimeKoJePostavio, String tekstObjave) {
        this.imePrezimeKoJePostavio = imePrezimeKoJePostavio;
        this.tekstObjave = tekstObjave;
        reakcijaLista = new ArrayList<>();
    }

    public void reaguj (String imePrezime, String reakcija){
        Reakcija trenutni = new Reakcija(reakcija,imePrezime);
        for (int i = 0; i < this.reakcijaLista.size(); i++) {
            if (this.reakcijaLista.get(i).getImePrezime().equals(imePrezime)){
                this.reakcijaLista.remove(i);
            }
        }
        this.reakcijaLista.add(trenutni);
        if (reakcija.equals("smajli")) System.out.println(imePrezime + " - daje smajli");
        if (reakcija.equals("srce")) System.out.println(imePrezime + " - daje srce");
        if (reakcija.equals("like")) System.out.println(imePrezime + " - lajkuje");
        if (reakcija.equals("cry")) System.out.println(imePrezime + " - place");
    }
    private int vratiBrojReakcija(String reakcija){
        int count = 0;
        for (int i = 0; i < this.reakcijaLista.size(); i++) {
            if (this.reakcijaLista.get(i).getTipReakcije().equals(reakcija)){
                count++;
            }
        }
        return count;
    }
    public void stampaj (){
        System.out.println(this.imePrezimeKoJePostavio);
        System.out.println(this.tekstObjave);
        String ispis = "";
        if (this.vratiBrojReakcija("smajli") > 0){
            ispis += "Smajli " + this.vratiBrojReakcija("smajli") + " | ";
        }
        if (this.vratiBrojReakcija("like") > 0){
            ispis += "Like " + this.vratiBrojReakcija("like") + " | ";
        }
        if (this.vratiBrojReakcija("srce") > 0){
            ispis += "Srce " + this.vratiBrojReakcija("srce") + " | ";
        }
        if (this.vratiBrojReakcija("cry") > 0){
            ispis += "Cry " + this.vratiBrojReakcija("cry") + " | ";
        }
        ispis = ispis.substring(0,ispis.length()-3);
        System.out.println(ispis);
    }
}
