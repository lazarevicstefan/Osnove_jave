package d14_09_2023.Zadatak_03;

import java.util.ArrayList;
import java.util.List;

public class TableHeader {
    private List<String> nizCelijaUHeader;

    public TableHeader() {
        this.nizCelijaUHeader = new ArrayList<>();
    }
    public void addHeaderCell(String field) {
        this.nizCelijaUHeader.add(field);
    }
    public void print() {
        for (int i = 0; i < this.nizCelijaUHeader.size(); i++) {
            System.out.print(this.nizCelijaUHeader.get(i) + "\t\t|\t\t");
        }
        System.out.println();
    }
    public void printHTML() {
        System.out.print("<tr>");
        for (String s : this.nizCelijaUHeader) {
            System.out.print("<th>" + s + "</th>");
        }
        System.out.println("</tr>");
    }
    public List<String> getNizCelijaUHeader() {
        return nizCelijaUHeader;
    }
}
