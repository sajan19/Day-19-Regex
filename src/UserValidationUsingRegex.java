
// Java program to validate
// the password using ReGex

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import java.util.regex.*;
class UserValidationUsingRegex {

    // Method to validate the password.
    public static boolean passwordValidation(){
        //Take Input from the User
        System.out.println("Enter Password: ");
        Scanner ps = new Scanner(System.in);
        String password = ps.next();
        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);

        // Return if the password
        // matched the ReGex
        return m.matches();
    }

    // Driver Code.
    public static void main(String args[])
    {
        System.out.println("Welcome to Password Validation...");
//        passwordValidation();
        //Print statement
        System.out.println(passwordValidation());


//        // Test Case 1:
//        String str1 = "Geeks@portal20";
//        System.out.println(passwordValidation(str1));


    }
}


