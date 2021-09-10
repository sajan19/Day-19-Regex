import java.util.Scanner;
public class UserValidationUsingRegex {
    //Instance Variable Declaration
    private static String mobileNum;
    //Method to check Mobile Number Validation
    public static void mobileNumValidation(){
        //Scanner object to take Input from the User
        Scanner nw =new Scanner(System.in);
        mobileNum = nw.next();
//      boolean valid = name.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$");
        //Pattern to check the Last Name
        boolean valid = mobileNum.matches("(0|91)?[7-9][0-9]{9}");
        //Condition to check Validity
        if (valid) {
            System.out.println("Mobile NUmber Entered " + mobileNum + " is Valid.");
        }
        else{
            System.out.println("Mobile Number Entered is Invalid. Re-Enter Valid Mobile Number");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter User Mobile Number: ");
        //Last Name First Character should be Capital and should have Minimum 3 Characters.
        //Calling the method to check Last Name Validation.
        mobileNumValidation();
    }
}