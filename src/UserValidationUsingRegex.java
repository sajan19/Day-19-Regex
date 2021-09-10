import java.util.Scanner;
public class UserValidationUsingRegex {
    //Instance Variable Declaration
    private static String lastName;
    //Method to check Last Name Validation
    public static void lastNameValidation(){
        //Scanner object to take Input from the User
        Scanner nw =new Scanner(System.in);
        lastName = nw.next();
//      boolean valid = name.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$");
        //Pattern to check the Last Name
        boolean valid = lastName.matches("[A-Z]{1}[a-z]{0,15}");
        //Condition to check Validity
        if (valid) {
            System.out.println("Last Name Entered " + lastName + " is Valid.");
        }
        else{
            System.out.println("Entered Last Name is Invalid. Re-Enter Valid Last Name");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the Last Name: ");
        //Last Name First Character should be Capital and should have Minimum 3 Characters.
        //Calling the method to check Last Name Validation.
        lastNameValidation();
    }
}