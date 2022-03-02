package ss3_ArrayAndMethod_in_Java.Thuc_hanh;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int count = 0;
        int listStudent[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listStudent.length; i++) {
            System.out.print("Enter the score of student '" + (i+1) + "' : ");
            listStudent[i] = scanner.nextInt();
            if (listStudent[i] >= 5 && listStudent[i] <= 10){
                count++;
            }
        }
        System.out.print("The numbers of student pass exam is : " + count + "student");
    }
}
