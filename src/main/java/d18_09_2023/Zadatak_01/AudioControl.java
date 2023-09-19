package d18_09_2023.Zadatak_01;

public class AudioControl extends Control{
    private boolean pojacivanjeZvuka; // true pojacaj / false smanji za 1 (opseg 0 do 100)

    public AudioControl(boolean pojacivanjeZvuka) {
        this.pojacivanjeZvuka = pojacivanjeZvuka;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.pojacivanjeZvuka){
            if ((videoPlayer.getJacinaZvuka() + 1) < 100){
                videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() + 1);
            }else videoPlayer.setJacinaZvuka(100);
        }else if ((videoPlayer.getJacinaZvuka() - 1) > 0) {
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() - 1);
        }else videoPlayer.setJacinaZvuka(0);
    }
}
