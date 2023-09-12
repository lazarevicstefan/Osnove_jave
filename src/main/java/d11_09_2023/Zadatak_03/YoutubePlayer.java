package d11_09_2023.Zadatak_03;

public class YoutubePlayer {
    private Video video;
    private int kvalitetVidea;
    private String rezimRada;
    private int jacinaZvuka;
    private int trenutnoVreme;

    public YoutubePlayer() {
        this.jacinaZvuka = 75;
        this.kvalitetVidea = 144;
        this.rezimRada = "mini player";
    }
    public void ucitajVideo (Video video){
        this.video = video;
        this.trenutnoVreme = 0;
    }
    public void pojacaj (){
        if (this.jacinaZvuka != 100){
            this.jacinaZvuka += 10;
        }
    }
    public void smanji (){
        if (this.jacinaZvuka != 0){
            this.jacinaZvuka -= 10;
        }
    }
    public void postaviKvalitet (double brzinaInterneta){
        if (brzinaInterneta < 2){
            this.kvalitetVidea = 144;
        }else if (brzinaInterneta < 4){
            this.kvalitetVidea = 240;
        }else if (brzinaInterneta < 6){
            this.kvalitetVidea = 360;
        }else if (brzinaInterneta < 8){
            this.kvalitetVidea = 720;
        }else {
            this.kvalitetVidea = 1080;
        }
    }
    public void aktivirajMiniPlayerMod (){
        this.rezimRada = "mini player";
    }
    public void aktivirajBioskopskiMod (){
        this.rezimRada = "bioskopski rezim";
    }
    public void aktivirajPrekoCelogEkranaMod (){
        this.rezimRada = "preko celog ekrana";
    }
    public void premotajUnazad (){
        if (this.trenutnoVreme > 10){
            this.trenutnoVreme -= 10;
        }else{
            this.trenutnoVreme = 0;
        }
    }
    public void premotajUnapred (){
        if (this.video.getDuzinaVidea() > this.trenutnoVreme){
            this.trenutnoVreme += 10;
        }else{
            this.trenutnoVreme = this.video.getDuzinaVidea();
        }
    }
    public void iscrtajZvuk (){
        int brojCrtica = jacinaZvuka / 10;
        if (brojCrtica == 0){
            System.out.println("</");
        }else {
            System.out.print("<: ");
            for (int i = 0; i < brojCrtica; i++) {
                System.out.print("|");
            }
        }
        System.out.println();
    }
    public void iscrtajRezim (){
        if (this.rezimRada.equals("mini player")){
            System.out.println("[]");
        }else if (this.rezimRada.equals("bioskopski rezim")){
            System.out.println("[..]");
        }else if (this.rezimRada.equals("preko celog ekrana")){
            System.out.println("[|||||]");
        }
    }
    public void iscrtajTrenutnoVreme(){
        int minut = this.trenutnoVreme / 60;
        int sekund = this.trenutnoVreme % 60;
        int minutukupnogVidea = this.video.getDuzinaVidea() / 60;
        int sekundkupnogVidea = this.video.getDuzinaVidea() % 60;
        System.out.print(minut + ":" + sekund + " / " + minutukupnogVidea + ":" + sekundkupnogVidea);
    }
    public void iscrtajTimeLine (){
        int brojZvezdica = this.trenutnoVreme * 100 / video.getDuzinaVidea();
        int brojTackica = 100 - brojZvezdica;
        for (int i = 0; i < brojZvezdica; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < brojTackica; i++) {
            System.out.print(".");
        }
        System.out.println();
    }
    public void iscrtaj (){
        this.iscrtajTrenutnoVreme();
        System.out.print(" ");
        this.iscrtajZvuk();
        System.out.print("Timeline: ");
        this.iscrtajTimeLine();
        System.out.println("Kvalitet: " + this.kvalitetVidea + "p");
        System.out.print("Rezim: ");
        this.iscrtajRezim();
        System.out.println(this.video.getNazivVidea());
        System.out.println("Likes: " + this.video.getBrojLajkova() + " | Dislikes: " + this.video.getBrojDislajkova());
        System.out.println(this.video.getBrojPregleda() + " Pregleda");
    }
    public String serovanjeVidea (){
        return "https://youtu.be/" + this.video.getId();
    }
    public Video getVideo() {
        return video;
    }
    public int getKvalitetVidea() {
        return kvalitetVidea;
    }
    public String getRezimRada() {
        return rezimRada;
    }
    public int getJacinaZvuka() {
        return jacinaZvuka;
    }
    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }
}
