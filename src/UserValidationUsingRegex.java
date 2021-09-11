// Java program to check if an email address
// is valid using Regex.
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserValidationUsingRegex {
    public static void emailValidation() {
        //Take Input from the User
        System.out.println("Enter your Email: ");
        Scanner nw = new Scanner(System.in);
        String email = nw.next();
        //Pattern to Validate Email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        //Conditions to validate Email
        if (email == null) {
//            return false;
            System.out.println("No Email Entered.");
        }
       else if (pat.matcher(email).matches()){
            System.out.println("Entered Email is Valid");
        }
        else{
            System.out.println("Entered Email is Invalid");
        }
//        return pat.matcher(email).matches();
    }

    // driver class
        public static void main(String[] args) {
//        String email = "sajanmhatre@gmail.com";
//      Calling Email Validation method
        emailValidation();
//        System.out.println(emailValidation());
    }
}