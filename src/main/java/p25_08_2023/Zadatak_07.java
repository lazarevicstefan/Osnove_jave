package p25_08_2023;

public class Zadatak_07 {
    public static void main(String[] args) {
        System.out.println(daLiJePravougaoni(5,5,6)
                ? "Trougao je pavougli" : "Trougao nije pravougli");
    }
    public static boolean daLiJePravougaoni (int a , int b, int c){
        if (((a * a) + (b * b)) == (c * c)){
            return true;
        }else {
            return false;
        }
    }
}
