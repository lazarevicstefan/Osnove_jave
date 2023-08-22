package p21_08_2023;

public class Zadatak_03 {
    public static void main(String[] args) {
        String skupBrojeva = "...";
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0){
                skupBrojeva = skupBrojeva + i;
            }else  {
                skupBrojeva = i + skupBrojeva;
            }
        }
        System.out.println(skupBrojeva);
    }
}
