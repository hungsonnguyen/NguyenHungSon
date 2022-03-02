package ss18_String_Regex.Bai_tap.ValidatePhoneNumeber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public Boolean validatePhoneNumber(String phoneNum){
        Pattern pattern = Pattern.compile("^\\([8][4]\\)-\\([0]\\d{9}\\)$");
        Matcher matcher = pattern.matcher(phoneNum);
        return matcher.matches();
    }
}
