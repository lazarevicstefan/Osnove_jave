package d18_09_2023.Zadatak_01;

public class TimeControl extends Control{
    private boolean pomeranjeVidea; // true desno / false levo 15s

    public TimeControl(boolean pomeranjeVidea) {
        this.pomeranjeVidea = pomeranjeVidea;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.pomeranjeVidea){
            if ((videoPlayer.getTrenutnoVremeVideaUSec() + 15) < videoPlayer.getDuzinaVidea()){
                videoPlayer.setTrenutnoVremeVideaUSec(videoPlayer.getTrenutnoVremeVideaUSec() + 15);
            }else videoPlayer.setTrenutnoVremeVideaUSec(videoPlayer.getDuzinaVidea());
        }else {
            if ((videoPlayer.getTrenutnoVremeVideaUSec() - 15) >= 0){
                videoPlayer.setTrenutnoVremeVideaUSec(videoPlayer.getTrenutnoVremeVideaUSec() - 15);
            }else videoPlayer.setTrenutnoVremeVideaUSec(0);
        }
    }
}
