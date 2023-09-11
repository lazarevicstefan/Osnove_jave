package p11_09_2023.Zadatak_01;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setIme("Stefan");
        student.setPrezime("Lazarevic");
        student.setBrojIndeksa(1234);
        student.setDaLiJeNaBudjetu(true);

        student.stampaj();
    }
}
