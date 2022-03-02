package ss2_LoopInJava.Thuc_hanh;

import java.util.Scanner;

public class Check_is_a_prime {
    public static void main(String[] args) {
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        int num = sc.nextInt();
        System.out.println("Check number : ");
        if (num <2){
            System.out.println("The number " + num + " is not a prime ");
        }
        else {
            int count = 0;
            for (int i = 1; i <= num; i++){
                if(num %i ==0){
                   count++;
                }
            }
            if (count ==2 ){
                System.out.println("The number " + num  + " is a prime ");
            }else {
                System.out.println("The number " + num  + " is not a prime ");
            }
        }
    }

}

