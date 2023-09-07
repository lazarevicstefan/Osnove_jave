package p07_09_2023.Zadatak_00;

public class UvodOOP {
    public static void main(String[] args) {
        User u1 = new User();
        u1.ime = "Stefan";
        u1.email = "stefan@gmail.com";
        u1.starost = 30;

        User u2 = new User();
        u2.ime = "Petar";
        u2.email = "petar@gmail.com";
        u2.starost = u1.starost + 3;

    }
}
