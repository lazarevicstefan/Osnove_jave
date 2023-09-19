package d18_09_2023.Zadatak_02;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult {
    private boolean hasErrors;
    private List<String> errors;

    public ValidationResult() {
        this.errors = new ArrayList<>();
    }

    public void addError (String error){
        this.hasErrors = true;
        this.errors.add(error);
    }
    public void print (){
        if (!this.hasErrors){
            System.out.println("No validation errors");
        }else {
            for (String s: this.errors){
                System.out.println(s);
            }
        }
    }
    public boolean isHasErrors() {
        return hasErrors;
    }
    public List<String> getErrors() {
        return errors;
    }
}
