import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class EmailValidation{
    String email;
    boolean expectedResult;

    public EmailValidation(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{ {"abc@yahoo.com", true},
            {"abc-100@yahoo.com", true}, {"abc.100@yahoo.com",true},{"abc-100@abc.net",true},
            {"abc.100@abc.com.au",true},{"abc@1.com",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true},
            {"abc",true},{"abc@.com.my",true},{"bc123@gmail.a",true},{"abc123@.com",true},
            {"abc123@.com.com",true},{".abc@abc.com",true},{"abc()*@gmail.com",true},{"abc@%*.com",true},{"\"abc..2002@gmail.com",true},
            {"abc.@gmail.com",true},{"abc@abc@gmail.com",true},{"abc@gmail.com.1a",true}

        });
    }
    @Test
    void givenEmail_ShouldReturnAsPerThePArameterisedResult(){

    }
}