package ss3_ArrayAndMethod_in_Java.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEraseUnit {


    public static void main(String[] args){
        int arr[] = {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9,1};
        Scanner scanner = new Scanner(System.in);
        int value;
        int index = 0;
        System.out.print("Enter the value need to erase!: ");
        value = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]){
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j+1];
                }
            }
        }arr[arr.length-1] = 0;
        System.out.println("Array:" + Arrays.toString(arr));
    }
}
