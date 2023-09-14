package p14_09_2023.Zadatak_05;

import java.util.ArrayList;
import java.util.List;

public class TestCase {
    private int id;
    private String naziv;
    private List<TestStep> nizKoraka;
    public TestCase(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
        this.nizKoraka = new ArrayList<>();
    }
    public void addTestStep (TestStep testStep){
        this.nizKoraka.add(testStep);
    }
    public int vratiStanjeKojiSuFail (){
        int count = 0;
        for (int i = 0; i < this.nizKoraka.size(); i++) {
            if (!this.nizKoraka.get(i).validacijaVrednosti()){
                count ++ ;
            }
        }
        return count;
    }
    public void vratiStanjeTestcase (){
        boolean fail = false;
        for (int i = 0; i < this.nizKoraka.size(); i++) {
            if (!this.nizKoraka.get(i).validacijaVrednosti()){
                fail = true;
            }
        }
        if (fail){
            System.out.println("FAILED");
        }else {
            System.out.println("PASSED");
        }
    }
    public void stampaj (){
        System.out.println(this.id + " - " + this.naziv);
        for (int i = 0; i < this.nizKoraka.size(); i++) {
            this.nizKoraka.get(i).stampaj();
        }
        System.out.println("Ukupno: " + this.nizKoraka.size() + " / " + this.vratiStanjeKojiSuFail() + "(fail)");
        vratiStanjeTestcase();
    }

    public int getId() {
        return id;
    }
    public String getNaziv() {
        return naziv;
    }
    public List<TestStep> getNizKoraka() {
        return nizKoraka;
    }
}
