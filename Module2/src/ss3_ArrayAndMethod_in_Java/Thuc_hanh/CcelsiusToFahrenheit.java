package ss3_ArrayAndMethod_in_Java.Thuc_hanh;

import java.util.Scanner;

public class CcelsiusToFahrenheit {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5)*celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9)*(fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do{
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius : " + fahrenheitToCelsius(fahrenheit));


                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius : " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice !=0);

    }
}
