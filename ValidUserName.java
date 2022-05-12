package com.bridgelabz.username;
public class ValidUserName {

    @FunctionalInterface
    public interface Validate {
        public boolean validateName(String name);
    }

    public static Validate validateFirstName() {
        return firstName -> firstName.matches("^[A-Z][a-z]{3,}$");
    }


    public static Validate validateLastName() {
        return lastName -> lastName.matches("^[A-Z][a-z]{3,}$");
    }

    public static void main(String[] args) {
        boolean isValidFirstName = ValidUserName.validateFirstName().validateName("Pinkul");
        System.out.println(isValidFirstName);

        boolean isValidProductName = ValidUserName.validateLastName().validateName("Patra");
        System.out.println(isValidProductName);
    }
    
}

