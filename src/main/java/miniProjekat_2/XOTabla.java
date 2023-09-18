package miniProjekat_2;

public class XOTabla {
    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeXIgraca;
    private String imeOIgraca;
    private String naPotezu; // X ili O

    public XOTabla() {}

    public void pokreniIgru() {
        this.polje1 = " ";
        this.polje2 = " ";
        this.polje3 = " ";
        this.polje4 = " ";
        this.polje5 = " ";
        this.polje6 = " ";
        this.polje7 = " ";
        this.polje8 = " ";
        this.polje9 = " ";
        this.naPotezu = "X";
    }

    public void stampaj() {
        System.out.println(this.polje1 + " | " + this.polje2 + " | " + this.polje3);
        System.out.println(this.polje4 + " | " + this.polje5 + " | " + this.polje6);
        System.out.println(this.polje7 + " | " + this.polje8 + " | " + this.polje9);
        System.out.println();
        System.out.println("Igrac X: " + this.imeXIgraca);
        System.out.println("Igrac O: " + this.imeOIgraca);
    }

    public boolean poljePrazno(int brojPolja) {
        if (brojPolja == 1) {
            if (this.polje1.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (brojPolja == 2) {
            if (this.polje2.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (brojPolja == 3) {
            if (this.polje3.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (brojPolja == 4) {
            if (this.polje4.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (brojPolja == 5) {
            if (this.polje5.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (brojPolja == 6) {
            if (this.polje6.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (brojPolja == 7) {
            if (this.polje7.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (brojPolja == 8) {
            if (this.polje8.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (brojPolja == 9) {
            if (this.polje9.equals(" ")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void zameniIgraca() {
        if (this.naPotezu.equals("X")) {
            this.naPotezu = "O";
        } else if (this.naPotezu.equals("O")) {
            this.naPotezu = "X";
        }
    }

    public void odigrajPotez(int brojPolja) {

        if (brojPolja == 1) {
            if (this.poljePrazno(brojPolja)){ this.polje1 = getNaPotezu(); }
        } else if (brojPolja == 2) {
            if (this.poljePrazno(brojPolja)){ this.polje2 = getNaPotezu(); }
        } else if (brojPolja == 3) {
            if (this.poljePrazno(brojPolja)){ this.polje3 = getNaPotezu(); }
        } else if (brojPolja == 4) {
            if (this.poljePrazno(brojPolja)){ this.polje4 = getNaPotezu(); }
        } else if (brojPolja == 5) {
            if (this.poljePrazno(brojPolja)){ this.polje5 = getNaPotezu(); }
        } else if (brojPolja == 6) {
            if (this.poljePrazno(brojPolja)){ this.polje6 = getNaPotezu(); }
        } else if (brojPolja == 7) {
            if (this.poljePrazno(brojPolja)){ this.polje7 = getNaPotezu(); }
        } else if (brojPolja == 8) {
            if (this.poljePrazno(brojPolja)){ this.polje8 = getNaPotezu(); }
        } else if (brojPolja == 9) {
            if (this.poljePrazno(brojPolja)){ this.polje9 = getNaPotezu(); }
        }
    }
    public boolean popunjenaTabla(){
        int count = 0;
        if (!this.poljePrazno(1)) { count++; }
        if (!this.poljePrazno(2)) { count++; }
        if (!this.poljePrazno(3)) { count++; }
        if (!this.poljePrazno(4)) { count++; }
        if (!this.poljePrazno(5)) { count++; }
        if (!this.poljePrazno(6)) { count++; }
        if (!this.poljePrazno(7)) { count++; }
        if (!this.poljePrazno(8)) { count++; }
        if (!this.poljePrazno(9)) { count++; }

        if (count == 9) { return true; }
        else { return false; }
    }
    public boolean pobednikX (){
        if (this.polje1.equals("X") && this.polje2.equals("X") && this.polje3.equals("X")) return true;
        if (this.polje4.equals("X") && this.polje5.equals("X") && this.polje6.equals("X")) return true;
        if (this.polje7.equals("X") && this.polje8.equals("X") && this.polje9.equals("X")) return true;
        if (this.polje1.equals("X") && this.polje4.equals("X") && this.polje7.equals("X")) return true;
        if (this.polje2.equals("X") && this.polje5.equals("X") && this.polje8.equals("X")) return true;
        if (this.polje3.equals("X") && this.polje6.equals("X") && this.polje9.equals("X")) return true;
        if (this.polje1.equals("X") && this.polje5.equals("X") && this.polje9.equals("X")) return true;
        if (this.polje7.equals("X") && this.polje5.equals("X") && this.polje3.equals("X")) return true;
        return false;
    }
    public boolean pobednikO(){
        if (this.polje1.equals("O") && this.polje2.equals("O") && this.polje3.equals("O")) return true;
        if (this.polje4.equals("O") && this.polje5.equals("O") && this.polje6.equals("O")) return true;
        if (this.polje7.equals("O") && this.polje8.equals("O") && this.polje9.equals("O")) return true;
        if (this.polje1.equals("O") && this.polje4.equals("O") && this.polje7.equals("O")) return true;
        if (this.polje2.equals("O") && this.polje5.equals("O") && this.polje8.equals("O")) return true;
        if (this.polje3.equals("O") && this.polje6.equals("O") && this.polje9.equals("O")) return true;
        if (this.polje1.equals("O") && this.polje5.equals("O") && this.polje9.equals("O")) return true;
        if (this.polje7.equals("O") && this.polje5.equals("O") && this.polje3.equals("O")) return true;
        return false;
    }
    public String getNaPotezu() {
        return naPotezu;
    }

    public String getImeXIgraca() {
        return imeXIgraca;
    }

    public void setImeXIgraca(String imeXIgraca) {
        this.imeXIgraca = imeXIgraca;
    }

    public String getImeOIgraca() {
        return imeOIgraca;
    }

    public void setImeOIgraca(String imeOIgraca) {
        this.imeOIgraca = imeOIgraca;
    }
}
