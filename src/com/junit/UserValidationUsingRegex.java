package com.junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidationUsingRegex {
   private static String firstName;
   private static String lastName;
//    public UserValidationUsingRegex(String firstName) {
//        this.firstName = firstName;
//    }

    //Method to validate firstName
    boolean firstNameValidaion(String firstName) {
        //Pattern to Validate First Name
        String fnameRegex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(fnameRegex);
        Matcher m = p.matcher(firstName);
        System.out.println(firstName + " : " + m.matches());
        return m.matches();
    }
    //Method to validate lastName
    public boolean lastNameValidaion(String lastName) {
        //Pattern to Validate First Name
        String lnameRegex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(lnameRegex);
        Matcher m = p.matcher(lastName);
        System.out.println(lastName + " : " + m.matches());
        return m.matches();
    }
    //Method to validate email
    public boolean emailValidation(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,17}$";
        Pattern p = Pattern.compile(emailRegex);
        Matcher m = p.matcher(email);
        System.out.println(email + " : " + m.matches());
        return m.matches();
    }
    //Method to validate Mobile Number
    public boolean mobileNumValidation(String mobileNum) {
        String mobileRegex = "(0|91)?[\\s][7-9][0-9]{9}";
        Pattern p = Pattern.compile(mobileRegex);
        Matcher m = p.matcher(mobileNum);
        System.out.println(mobileNum + " : " + m.matches());
        return m.matches();
    }
    //Method to validate password
    public boolean passwordValidation(String password) {
        String passwordRegex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(passwordRegex);
        Matcher m = p.matcher(password);
        System.out.println(password + " : " + m.matches());
        return m.matches();
    }
//    public static void main(String[] args) {
//        System.out.println("Welcome to Validate First Name...");
//        UserValidationUsingRegex obj = new UserValidationUsingRegex("Sa");
//        obj.firstNameValidation();
//    }
}
