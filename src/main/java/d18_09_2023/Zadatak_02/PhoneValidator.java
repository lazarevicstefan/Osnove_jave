package d18_09_2023.Zadatak_02;

public class PhoneValidator extends Validator{
    private String phoneNumber;

    public PhoneValidator(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public ValidationResult validate() {
        ValidationResult vr = new ValidationResult();
        // start with +
        if (!this.phoneNumber.startsWith("+")){
            System.out.println("Phone number must start with +");
            vr.addError("Phone number must start with +");
        }
        // cannot contain spaces
        if (this.phoneNumber.contains(" ")){
            System.out.println("Phone number cannot contain spaces");
            vr.addError("Phone number cannot contain spaces");
        }
        // phone can only contains numbers
        boolean onlyNumbers = false;
        for (int i = 0; i < this.phoneNumber.length(); i++) {
            char a = this.phoneNumber.charAt(i);
            if (!Character.isDigit(a)){
                onlyNumbers = true;
            }
        }
        if (onlyNumbers){
            System.out.println("Phone number can only contain numbers");
            vr.addError("Phone number can only contain numbers");
        }
        return vr;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
