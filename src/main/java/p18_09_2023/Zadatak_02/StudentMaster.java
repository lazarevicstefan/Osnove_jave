package p18_09_2023.Zadatak_02;

public class StudentMaster extends Student{
    public StudentMaster(String imePrezimeStudenta, String brojIndeksa, int godinaStudija) {
        super(imePrezimeStudenta, brojIndeksa, godinaStudija);
    }

    @Override
    public double cenaSkolarine() {
        return 100000;
    }
    @Override
    public boolean daLiJeNaBudzetu() {
        if (this.godinaStudija <= 2){
            return true;
        }
        return false;
    }
}
