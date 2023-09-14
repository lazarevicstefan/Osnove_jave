package p14_09_2023.Zadatak_03;

public class Main {
    public static void main(String[] args) {
        FacebookPost facebookPost = new FacebookPost("Stefan Lazarevic","Neka objava!");
        facebookPost.reaguj("ime1","smajli");
        facebookPost.reaguj("ime2","smajli");
        facebookPost.reaguj("ime3","smajli");
        facebookPost.reaguj("ime4","srce");
        facebookPost.reaguj("ime5","srce");
        facebookPost.reaguj("ime6","srce");

        facebookPost.reaguj("ime6","like");
        System.out.println();

        facebookPost.stampaj();
    }
}
