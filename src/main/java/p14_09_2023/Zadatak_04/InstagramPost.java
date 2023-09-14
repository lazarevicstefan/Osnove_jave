package p14_09_2023.Zadatak_04;

import java.util.ArrayList;
import java.util.List;

public class InstagramPost {
    private List<InstagramImage> nizSlika;
    private String opis;

    public InstagramPost(String opis) {
        this.opis = opis;
        this.nizSlika = new ArrayList<>();
    }

    public void stampaj (){
        System.out.println("--------------------------------");
        System.out.println("Opis: " + this.opis);
        System.out.print("Dimeznije slike");
        for (int i = 0; i < nizSlika.size(); i++) {
            System.out.print(" Duzina: " + nizSlika.get(i).getDuzinaSlike());
            System.out.println(" Visina: " + nizSlika.get(i).getVisinaSlike());
            System.out.println("Lokacija: " + nizSlika.get(i).getPutanjaDoSlike());
            System.out.println("Tagovi na slici: ");
            for (int j = 0; j < nizSlika.get(i).getNizTagova().size(); j++) {
                System.out.print("Korisnik: " + nizSlika.get(i).getNizTagova().get(j).getKorisnikKojiJeTagovan().getImePrezime()
                        + " username: " + nizSlika.get(i).getNizTagova().get(j).getKorisnikKojiJeTagovan().getUsername()
                        + " email: " + nizSlika.get(i).getNizTagova().get(j).getKorisnikKojiJeTagovan().getEmail());
                System.out.println(" -> Tagovan na x: " + nizSlika.get(i).getNizTagova().get(j).getxKordinata() + " y: " + nizSlika.get(i).getNizTagova().get(j).getyKordinata());
            }
        }
        System.out.println("--------------------------------");
    }
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void dodajSliku (InstagramImage slika){
        nizSlika.add(slika);
    }
}
