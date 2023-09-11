package p11_09_2023.Zadatak_03;

public class Main {
    public static void main(String[] args) {
        Film film = new Film();
        film.setNaziv("The Adam Project");
        film.setGodina(2022);
//        film.stampaj();

        Reziser reziser = new Reziser("Shawn Levy", 55);
//        reziser.stampaj();

        film.setReziser(reziser);
        film.stampaj();
    }
}
