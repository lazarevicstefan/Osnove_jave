package d11_09_2023.Zadatak_03;

public class Main {
    public static void main(String[] args) {
        Video video = new Video("v6tuOipj5mk", "Ariana Grande - positions (official video)",140);
        for (int i = 0; i < 145; i++) { video.lajkuj(); }
        for (int i = 0; i < 34893; i++) { video.pogledaj(); }
        for (int i = 0; i < 32; i++) { video.dislajk(); }

        YoutubePlayer youtubePlayer = new YoutubePlayer();
        youtubePlayer.ucitajVideo(video);
        youtubePlayer.pojacaj();
        youtubePlayer.pojacaj();
        youtubePlayer.pojacaj();
        youtubePlayer.pojacaj();
        youtubePlayer.smanji();

        youtubePlayer.postaviKvalitet(6.8);
        youtubePlayer.aktivirajPrekoCelogEkranaMod();

        for (int i = 0; i < 7; i++) {youtubePlayer.premotajUnapred();}
        youtubePlayer.premotajUnazad();youtubePlayer.premotajUnazad();

        youtubePlayer.iscrtaj();

        System.out.println(youtubePlayer.serovanjeVidea());
    }
}
