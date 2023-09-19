package p19_09_2023.Zadatak_02;

public class Trkac extends Atleticar{

    @Override
    public boolean daLiJeRezultatBolji(Atleticar atleticar) {
        if (this.rezultat < atleticar.rezultat){
            return true;
        }else return false;
    }

}
