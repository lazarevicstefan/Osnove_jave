package d07_09_2023.Zadatak_01;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.ime = "Stefan";
        s1.brojIndeksa = 147;
        s1.fakultet = "Fakultet 1";

        Student s2= new Student();
        s2.ime = "Petar";
        s2.brojIndeksa = 247;
        s2.fakultet = "Fakultet 2";

        Student s3 = new Student();
        s3.ime = "Milan";
        s3.brojIndeksa = 347;
        s3.fakultet = "Fakultet 3";

        System.out.println(s1.ime + " " + s1.brojIndeksa + " " + s1.fakultet);
        System.out.println(s2.ime + " " + s2.brojIndeksa + " " + s2.fakultet);
        System.out.println(s3.ime + " " + s3.brojIndeksa + " " + s3.fakultet);
    }
}
