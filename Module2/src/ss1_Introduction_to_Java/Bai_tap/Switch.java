package ss1_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your USD: ");
        usd = scanner.nextDouble();
        double change = usd * vnd;
        System.out.println("The VND = "+ change);
    }
}
