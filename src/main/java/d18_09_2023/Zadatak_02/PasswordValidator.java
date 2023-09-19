package d18_09_2023.Zadatak_02;

public class PasswordValidator extends Validator{
    private String password;

    public PasswordValidator(String password) {
        this.password = password;
    }


    @Override
    public ValidationResult validate() {
        ValidationResult vr = new ValidationResult();
        // must contain @ # / *
        if (this.password.contains("@") || this.password.contains("#") || this.password.contains("/") || this.password.contains("*")){
        }else {
            System.out.println("Password must contain at least one special character @, #, / or *");
            vr.addError("Password must contain at least one special character @, #, / or *");
        }
        // minimum 8 char
        if (this.password.length() >= 8){
        }else {
            System.out.println("Password must be minimum 8 characters");
            vr.addError("Password must be minimum 8 characters");
        }
        // Upper Case
        boolean upper = false;
        for (int i = 0; i < this.password.length(); i++) {
            char a = this.password.charAt(i);
            if (Character.isUpperCase(a)){
                upper = true;
            }
        }
        if (!upper){
            System.out.println("Password must contain at least one uppercase letter");
            vr.addError("Password must contain at least one uppercase letter");
        }
        // Lower Case
        boolean lover = false;
        for (int i = 0; i < this.password.length(); i++) {
            char a = this.password.charAt(i);
            if (Character.isLowerCase(a)){
                lover = true;
            }
        }
        if (!lover){
            System.out.println("Password must contain at least one lowercase letter");
            vr.addError("Password must contain at least one lowercase letter");
        }
        // Digit case
        boolean digit = false;
        for (int i = 0; i < this.password.length(); i++) {
            char a = this.password.charAt(i);
            if (Character.isDigit(a)){
                digit = true;
            }
        }
        if (!digit){
            System.out.println("Password must contain at least one digit");
            vr.addError("Password must contain at least one digit");
        }
        return vr;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
