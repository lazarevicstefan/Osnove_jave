package d18_09_2023.Zadatak_02;

public class EmailValidator extends Validator{
    private String email;

    public EmailValidator(String email) {
        this.email = email;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult vr = new ValidationResult();
        if (email.contains("@") && (email.endsWith(".com") || email.endsWith(".net"))){
        }else {
            System.out.println("Email is invalid");
            vr.addError("Email is invalid");
        }
        return vr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
