import java.util.Scanner;
public class UserValidationUsingRegex {
    //Instance Variable Declaration
   private static String firstName;
   //Method to check First Name Validation
    public static void firstNameValidation(){
        //Scanner object to take Input from the User
        Scanner nw =new Scanner(System.in);
        firstName = nw.next();
//      boolean valid = name.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$");
        //Pattern to check the First Name
        boolean valid = firstName.matches("[A-Z]{1}[a-z]{0,10}");
        //Condition to check Validity
        if (valid) {
            System.out.println("First Name Entered " + firstName + " is Valid.");
        }
        else{
            System.out.println("Entered First Name is Invalid. Re-Enter Valid First Name");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the First Name: ");
        //Calling the method to check First Name Validation.
        firstNameValidation();
    }
}
