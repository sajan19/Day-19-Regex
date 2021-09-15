package com.junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationUsingRegex {
    //Variable
    private String email;
    //Method to Validate Email
    public boolean emailValidationTest(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,17}$";
        Pattern p = Pattern.compile(emailRegex);
        Matcher m = p.matcher(email);
        System.out.println(email + " : " + m.matches());
        return m.matches();
    }
}

