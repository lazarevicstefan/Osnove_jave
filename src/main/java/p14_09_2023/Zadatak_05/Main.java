package p14_09_2023.Zadatak_05;

public class Main {
    public static void main(String[] args) {
        TestStep testStep1 = new TestStep("Provera1" , "userrr", "userrr", "Ocekivana error poruka");
        TestStep testStep2 = new TestStep("Provera2" , "userrr2", "userrr2", "Ocekivana error poruka");
        TestStep testStep3 = new TestStep("Provera3" , "userrr3", "userrr3", "Ocekivana error poruka");
        TestStep testStep4 = new TestStep("Provera4" , "userrr4", "greska", "Ocekivana error poruka");

        TestCase testCase = new TestCase(17,"Naziv test case");
        testCase.addTestStep(testStep1);
        testCase.addTestStep(testStep2);
        testCase.addTestStep(testStep3);
        testCase.addTestStep(testStep4);

        testCase.stampaj();
    }
}
