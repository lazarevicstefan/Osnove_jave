package p15_09_2023.Zadatak_01;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Stefan Lazarevic","468461684168468",3445,20000);
        Student student2 = new Student("Pera Peric","64964684168468",8425,40000);

        Profesor profesor1 = new Profesor("Mika Mikic","1561184168468","Java Programiranje",120000);
        Profesor profesor2 = new Profesor("Sasa Sasic","7684864168468","C# Programiranje",110000);


        student1.stampaj();
        System.out.println();
        student1.uplatiSkolarinu(10000);
        student1.stampaj();
        System.out.println();

        student2.stampaj();
        System.out.println();

        profesor1.stampaj();
        System.out.println();
        profesor1.povecajPlatu(20);
        profesor1.stampaj();
        System.out.println();

        profesor2.stampaj();
    }
}
