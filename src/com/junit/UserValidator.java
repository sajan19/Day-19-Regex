package com.junit;
import java.util.Scanner;
//Create a class
public class UserValidator {
    //Variables
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String password;
    Scanner scanner = new Scanner(System.in);
    //first name validation
    public boolean firstNameValidate(String firstName) throws UserRegistrationException {
        //Regex for first Name
        String pattern = "^[A-Z][a-z]{2,}$";
        //Condition to check First Name Validity
        if (firstName.matches(pattern)) {
            System.out.println("Valid First name");
            return true;
        } else {
            throw new UserRegistrationException("Please enter a valid first name");
        }
    }
    //last name validation
    public boolean lastNameValidate(String lastName) throws UserRegistrationException {
        //Regex for last Name
        String pattern = "^[A-Z][a-z]{2,}$";
        //Condition
        if (lastName.matches(pattern)) {
            System.out.println("valid last name");
            return true;
        } else {
            throw new UserRegistrationException("Please enter a valid last name");
        }
    }
    //Email validation
    public boolean emailValidator(String email) throws UserRegistrationException {
        String pattern = "^[a-zA-Z]{1,}([.\\-+]?[a-zA-Z0-9]+)?\\@[a-z0-9]{1,}\\.([a-z]{2,4})(\\.[a-z]{2,4})?$";
        if (email.matches(pattern)) {
            System.out.println("valid email id");
            return true;
        } else {
            throw new UserRegistrationException("Please enter a valid email id");
        }
    }
    //Mobile number validation
    public boolean phoneNumberValidator(String phoneNumber) throws UserRegistrationException {
        String pattern = "^([\\+]?91)[6-9]{1}[0-9]{9}$";
        if (phoneNumber.matches(pattern)) {
            System.out.println("valid phone number");
            return true;
        } else {
            throw new UserRegistrationException("Please enter a valid phone number");
        }
    }
    //Password validation
    public boolean passwordValidator(String password) throws UserRegistrationException {
        String pattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$";
        if (password.matches(pattern)) {
            System.out.println("valid password");
            return true;
        } else {
            throw new UserRegistrationException("Please enter a valid password");
        }
    }
    //Method to take Input from the User
    public void userInput() {
        while (true) {
            System.out.println("Enter the First name :");
            firstName = scanner.next();
            try {
                boolean result = firstNameValidate(firstName);
                if (result == true) {
                    break;
                }
            } catch (UserRegistrationException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.println("Enter the Last name :");
            lastName = scanner.next();
            try {
                boolean result = lastNameValidate(lastName);
                if (result == true) {
                    break;
                }
            } catch (UserRegistrationException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.println("Enter the email id :");
            email = scanner.next();
            try {
                boolean result = emailValidator(email);
                if (result == true) {
                    break;
                }
            } catch (UserRegistrationException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.println("Enter the phone number:");
            phoneNumber = scanner.next();
            try {
                boolean result = phoneNumberValidator(phoneNumber);
                if (result == true) {
                    break;
                }
            } catch (UserRegistrationException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.println("Enter the password:");
            password = scanner.next();
            try {
                boolean result = passwordValidator(password);
                if (result == true) {
                    break;
                }
            } catch (UserRegistrationException e) {
                e.printStackTrace();
            }
        }
    }
    //Driver Main Class
    public static void main(String[] args) {
        System.out.println("Welcome to user registration");
    //Create an Object
        UserValidator user = new UserValidator();
        //Calling of Method
        user.userInput();
    }
}