package ss1_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " +name);
    }
}
