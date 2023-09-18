package d14_09_2023.Zadatak_03;

import java.util.ArrayList;
import java.util.List;

public class TableRow {
    private List<String> nizCelijaUTeluTabele;

    public TableRow() {
        nizCelijaUTeluTabele = new ArrayList<>();
    }

    public void addRowCell(String field) {
        this.nizCelijaUTeluTabele.add(field);
    }

    public void print() {
        for (int i = 0; i < this.nizCelijaUTeluTabele.size(); i++) {
            System.out.print(this.nizCelijaUTeluTabele.get(i) + "\t\t\t|\t\t");
        }
        System.out.println();
    }

    public void printHTML() {
        System.out.print("<tr>");
        for (String s : this.nizCelijaUTeluTabele) {
            System.out.print("<td>" + s + "</td>");
        }
        System.out.println("</tr>");
    }

    public boolean daLiSadrziRed(String prosledjeniTekst) {
        for (String s : this.nizCelijaUTeluTabele){
            if (s.equals(prosledjeniTekst)){
                return true;
            }
        }
        return false;
    }


}
