package d14_09_2023.Zadatak_03;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private TableHeader headerTable;
    private List<List<TableRow>> nizRedova;
    private int BROJREDOVAPOSTRANI = 5;

    public Table() {
        nizRedova = new ArrayList<>();
    }

    public void dodavanjeNovogRedaUTabeli (List<TableRow> red){
        this.nizRedova.add(red);
    }
    public void setHeaderTable(TableHeader headerTable) {
        this.headerTable = headerTable;
    }
    public void print (){
        for (int i = 0; i < this.nizRedova.size(); i++) {
            for (int j = 0; j < this.nizRedova.get(i).size(); j++) {
                this.nizRedova.get(i).get(j).print();
            }
        }
    }
    public void printHTML() {
        System.out.println("<table>" + System.lineSeparator() + "<thead>");
        this.headerTable.printHTML();
        System.out.println("</thead>" + System.lineSeparator() + "<tbody>");
        for (int i = 0; i < this.nizRedova.size(); i++) {
            for (int j = 0; j < this.nizRedova.get(i).size(); j++) {
                this.nizRedova.get(i).get(j).printHTML();
            }
        }
        System.out.println("</tbody>" + System.lineSeparator() + "</table>");
    }
    public void filter (String red){
        this.nizRedova.get(0).get(0).print();
        for (int i = 0; i < this.nizRedova.size(); i++) {
            for (int j = 0; j < this.nizRedova.get(i).size(); j++) {
                if (this.nizRedova.get(i).get(j).daLiSadrziRed(red)){
                    this.nizRedova.get(i).get(j).print();
                }
            }
        }
    }
    public void printPaginator (){
        int count = 0;
        for (int i = 0; i < this.nizRedova.size(); i++) {
            count += this.nizRedova.get(i).size();
        }
        count = count / BROJREDOVAPOSTRANI;
        for (int i = 1; i <= count; i++) {
            System.out.print("| " + i + " ");
        }
        System.out.println("|");
    }
}
