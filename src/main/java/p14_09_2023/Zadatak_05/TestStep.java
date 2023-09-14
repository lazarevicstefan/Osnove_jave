package p14_09_2023.Zadatak_05;

public class TestStep {
    private String opis;
    private String actualVrednost;
    private String expectVrednost;
    private String errorPoruka;

    public TestStep(String opis, String actualVrednost, String expectVrednost, String errorPoruka) {
        this.opis = opis;
        this.actualVrednost = actualVrednost;
        this.expectVrednost = expectVrednost;
        this.errorPoruka = errorPoruka;
    }
    public boolean validacijaVrednosti (){
        if (this.actualVrednost.equals(this.expectVrednost)){
            return true;
        }else {
            return false;
        }
    }
    public void stampaj (){
        System.out.println("| " + this.opis + " |");
        String failIliPass = this.validacijaVrednosti() ? "passed)" : "failed) | Error message: " + this.errorPoruka;
        System.out.println("| Status(" + failIliPass);
    }

    public String getOpis() {
        return opis;
    }
    public String getActualVrednost() {
        return actualVrednost;
    }
    public String getExpectVrednost() {
        return expectVrednost;
    }
    public String getErrorPoruka() {
        return errorPoruka;
    }
}
