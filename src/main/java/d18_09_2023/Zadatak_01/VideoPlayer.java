package d18_09_2023.Zadatak_01;

public class VideoPlayer {
    private int duzinaVidea;
    private int trenutnoVremeVideaUSec;
    private int jacinaZvuka;
    private int kvalitetVidea;

    public VideoPlayer(int duzinaVidea, int trenutnoVremeVidea, int jacinaZvuka, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVremeVideaUSec = trenutnoVremeVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public void stampaj (){
        int min = this.trenutnoVremeVideaUSec / 60;
        int sec = this.trenutnoVremeVideaUSec % 60;

        int ukupnomin = this.duzinaVidea / 60;
        int ukupnosec = this.duzinaVidea % 60;
        System.out.println("Trenutno vreme: " + min + ":" + sec + "/" + ukupnomin + ":" + ukupnosec);
        System.out.println("Jacina zvuka: " + this.jacinaZvuka);
        System.out.println("Kvalitet videa: " + this.getKvalitetVidea() + "p");
    }
    public int getDuzinaVidea() {
        return duzinaVidea;
    }
    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }
    public int getTrenutnoVremeVideaUSec() {
        return trenutnoVremeVideaUSec;
    }
    public void setTrenutnoVremeVideaUSec(int trenutnoVremeVideaUSec) {
        this.trenutnoVremeVideaUSec = trenutnoVremeVideaUSec;
    }
    public int getJacinaZvuka() {
        return jacinaZvuka;
    }
    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }
    public int getKvalitetVidea() {
        return kvalitetVidea;
    }
    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }
}
