package d18_09_2023.Zadatak_01;

public class QualityOptimizerControl extends Control{
    private double brzinaInterneta;

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double kvalitet = this.brzinaInterneta * 10.1;
        if (kvalitet > 0 && kvalitet < 144){
            videoPlayer.setKvalitetVidea(144);
        }else if (kvalitet < 240){
            videoPlayer.setKvalitetVidea(240);
        }else if (kvalitet < 360){
            videoPlayer.setKvalitetVidea(360);
        }else if (kvalitet < 480){
            videoPlayer.setKvalitetVidea(480);
        }else if (kvalitet < 720){
            videoPlayer.setKvalitetVidea(720);
        }else if (kvalitet >= 720){
            videoPlayer.setKvalitetVidea(1080);
        }
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }
    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
}
