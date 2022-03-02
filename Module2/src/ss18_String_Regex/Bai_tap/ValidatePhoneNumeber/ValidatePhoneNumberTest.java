package ss18_String_Regex.Bai_tap.ValidatePhoneNumeber;

import ss18_String_Regex.Bai_tap.ValidateNameClass.ValidateNameClass;

import java.util.Scanner;

public class ValidatePhoneNumberTest {
    public static void main(String[] args) {
        Boolean check = false;
        Scanner scanner = new Scanner(System.in);
        String phoneNum;
        ValidatePhoneNumber valid = new ValidatePhoneNumber();
        while (check != true){
            System.out.print("Enter phone number: ");
            phoneNum = scanner.nextLine();
            check = valid.validatePhoneNumber(phoneNum);
            if (check){
                System.out.println("Correct number!");
            }else {
                System.out.println("Please enter Phone number again!!!");
            }
        }
    }
}
