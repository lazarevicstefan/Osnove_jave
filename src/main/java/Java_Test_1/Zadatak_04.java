package Java_Test_1;

public class Zadatak_04 {
    public static void main(String[] args) {
        /*
        Napišite metode koje omogućavaju pakovanje teksta u HTML elemente. Prva metoda, kao parametre, prima tekst i tip, a vraća HTML element (String) s prosleđenim tekstom.
        Metoda podržava sledeće tipove:

        - "bold": Metoda pakuje tekst u <b>prosleđeni tekst</b>.
        - "italic": Metoda pakuje tekst u <em>prosleđeni tekst</em>.
        - "paragraph": Metoda pakuje tekst u <p>prosleđeni tekst</p>.

        Ako se prosledi tip koji nije podržan, vraća se neupakovan tekst, tj. vraća se takav kakav je bio prosleđen metodi.

        Druga metoda služi za kreiranje HTML anchor taga. Metoda kao parametre prima link i tekst koji treba da bude linkovan.
        Metoda vraća tekst u formatu <a href=prosleđeniLink>Prosleđeni tekst</a>.
        */
        System.out.println(anchorHTMLTag("google.com","Welcome to Google"));
        System.out.print(tipHTMLPakovanja("Ovaj deo je bold","bold"));
        System.out.print(tipHTMLPakovanja(", a",""));
        System.out.println(tipHTMLPakovanja("ovo je italic","italic"));
        System.out.println(tipHTMLPakovanja("Naravno samo je falio paragraf", "paragraph"));
    }
    public static String tipHTMLPakovanja (String tekst, String tip){
        if (tip.equals("bold")){
            return "<b>" + tekst + "</b>";
        }else if (tip.equals("italic")){
            return "<em>" + tekst + "</em>";
        }else if (tip.equals("paragraph")){
            return "<p>" + tekst + "</p>";
        }else {
            return tekst;
        }
    }
    public static String anchorHTMLTag (String link, String tekst){
        return "<a href=" + link + ">" + tekst + "</a>";
    }
}
