package p11_09_2023.Zadatak_02;

public class Tacka {
    private int x;
    private int y;

    public Tacka() {
    }
    public Tacka(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void stampaj (){
        System.out.println("X: " + this.x + System.lineSeparator() + "Y: " + this.y);
    }

    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
