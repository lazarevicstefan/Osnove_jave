package p18_09_2023.Zadatak_03;

public abstract class Figura {
    public abstract double povrsina();
    public abstract double obim();

    public Figura() {}

    public void print (){
        System.out.println("Povrsina je: " + this.povrsina());
        System.out.println("Obim je: " + this.obim());
    }
}
