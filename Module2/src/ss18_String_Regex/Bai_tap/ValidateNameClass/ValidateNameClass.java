package ss18_String_Regex.Bai_tap.ValidateNameClass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    public Boolean validateNameClass(String string){
        Pattern pattern = Pattern.compile("^(A|P|C){1}\\d{4}[A-Z]{1}$");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
