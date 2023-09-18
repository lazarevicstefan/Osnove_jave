package p18_09_2023.Zadatak_02;

public class StudentOsnovnih extends Student {
    public StudentOsnovnih(String imePrezimeStudenta, String brojIndeksa, int godinaStudija) {
        super(imePrezimeStudenta, brojIndeksa, godinaStudija);
    }
    @Override
    public double cenaSkolarine() {
        return 90000;
    }
    @Override
    public boolean daLiJeNaBudzetu() {
        if (this.godinaStudija <= 5){
            return true;
        }
        return false;
    }
}
