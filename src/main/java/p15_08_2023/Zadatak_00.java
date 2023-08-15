package p15_08_2023;


import java.time.LocalDate;

public class Zadatak_00 {
    public static void main(String[] args) {

        String firstName = "Stefan";
        String lastName = "Lazarevic";
        int yearOfBirth = 1995;
        int currentYear = LocalDate.now().getYear();

        double avg = 5.8;
        boolean active = true;

        int age = currentYear - yearOfBirth;

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Active: " + (active ? "Aktivan" : "Neaktivan"));


    }
}
