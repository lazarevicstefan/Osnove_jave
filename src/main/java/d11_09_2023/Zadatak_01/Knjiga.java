package d11_09_2023.Zadatak_01;

public class Knjiga {
    private int isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public Knjiga(int isbn, String naziv, int godinaIzdanja) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
    }

    public Knjiga(int isbn, String naziv, int godinaIzdanja, Autor autor) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }

    public void print (){
        System.out.println(this.isbn + System.lineSeparator() + this.naziv + " - " + this.godinaIzdanja);
        if (this.autor != null){
            System.out.print("Autor: ");
            this.autor.print();
        }
        System.out.println();
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }
    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }
}
