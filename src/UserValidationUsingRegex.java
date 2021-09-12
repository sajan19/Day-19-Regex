import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Java Program to validate Email Samples
class Email{
    //Declare ArrayList
    ArrayList<String> emails;
    //Constructor
    public Email() {
        this.emails = new ArrayList<>();
    }
    //Method to validate emails
    void emailValidation(ArrayList emails) {
        //Pattern to Validate Email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,17}$";
        Pattern p = Pattern.compile(emailRegex);
        for (Object e : emails) {
            Matcher m = p.matcher((CharSequence) e);
            System.out.println(e + " : " + m.matches());

        }
    }
}
class UserValidationUsingRegex {
    public static void main(String[] args) {
        System.out.println("Welocme to Validate Email Samples...");
        Email obj = new Email();
        //Valid Email Ids
        obj.emails.add("abc@yahoo.com");
        obj.emails.add("abc-100@yahoo.com");
        obj.emails.add("abc.100@yahoo.com");
        obj.emails.add("abc-100@abc.net");
        obj.emails.add("abc.100@abc.com.au");
        obj.emails.add("abc@1.com");
        obj.emails.add("abc@gmail.com.com");
        obj.emails.add("abc+100@gmail.com");
        //Invalid Emails
        obj.emails.add("abc");
        obj.emails.add("abc@.com.my");
        obj.emails.add("abc123@gmail.a");
        obj.emails.add("abc123@.com");
        obj.emails.add("abc123@.com.com");
        obj.emails.add(".abc@abc.com");
        obj.emails.add("abc()*@gmail.com");
        obj.emails.add("abc@%*.com");
        obj.emails.add("abc..2002@gmail.com");
        obj.emails.add("abc.@gmail.com");
        obj.emails.add("abc@abc@gmail.com");
        obj.emails.add("abc@gmail.com.1a");
//        obj.emails.add("abc@gmail.com.3a.au");
//        obj.emails.add("");
        //Method to print the Arraylist
//        for (Object e: obj.emails) {
//            System.out.println(e);
//        }
        //Calling the Method to Check Email validity
        obj.emailValidation(obj.emails);
    }
}

