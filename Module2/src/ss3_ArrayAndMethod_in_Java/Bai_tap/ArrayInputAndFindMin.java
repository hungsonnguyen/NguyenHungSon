package ss3_ArrayAndMethod_in_Java.Bai_tap;

import java.util.Scanner;

public class ArrayInputAndFindMin {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter size of array = ");
    int size = scanner.nextInt();
    int arr[] = new int[size];
    int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of index '" + (i+1) + "' ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]< min){
                min = arr[i];
            }
        }
        System.out.print("The Min number in array is:" + min );
}
}
