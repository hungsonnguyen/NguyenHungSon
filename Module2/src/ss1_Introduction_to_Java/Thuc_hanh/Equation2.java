package ss1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class Equation2 {
    public static void main(String[] args) {
        System.out.println("Lienear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter  constants");
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("a: ");
        a = sc.nextDouble();

        System.out.println("b: ");
        b= sc.nextDouble();

        System.out.println("c:");
        c = sc.nextDouble();
        if (a != 0){
            double answer = ( c- b)/ a;
            System.out.printf("Equation pass with x= %f!\n", answer);
        }else {
            if (b == c){
                System.out.print("The solution is all x!");
            }else {
                System.out.print("No solution!");
            }
        }
    }
}
