package ss18_String_Regex.Bai_tap.ValidateNameClass;

import java.util.Scanner;

public class ValidateNameClassTesst {
    public static void main(String[] args) {
        Boolean check = false;
        Scanner scanner = new Scanner(System.in);
        String nameClass;
        ValidateNameClass valid = new ValidateNameClass();
        while (check != true){
            System.out.print("Enter name Class: ");
            nameClass = scanner.nextLine();
            check = valid.validateNameClass(nameClass);
            if (check){
                System.out.println("Correct name Class!");
            }else {
                System.out.println("Please enter Name Class again!!!");
            }
        }
    }
}
