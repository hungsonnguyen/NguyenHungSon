package ss11_DSA_Stack_Queue.Bai_tap.CountCharacter;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        String character;
        Map<String, Integer> myCharacter = new TreeMap<String, Integer>();
        for (int i = 0; i < str.length(); i++) {
            character = String.valueOf(str.charAt(i));
            if (myCharacter.containsKey(character)){
                int currentValue = myCharacter.get(character);
                currentValue +=1;
                myCharacter.put(character, currentValue);
                //or use replace();
                //myCharacter.replace(character,currentValue);
            }else {
                myCharacter.put(character,1);
            }
        }
        System.out.println(myCharacter);


        // Cách duyệt treeMap với forEach() trong Java 8
        // đối số thứ nhất bên trong forEach là key
        // đối số thứ hai bên trong forEach là value
        System.out.println("Các entry có trong treeMap là: ");
        myCharacter.forEach((keyInt, valueInt) -> System.out.println(
                "Key = " + keyInt + ", value = " + valueInt));
    }
}
