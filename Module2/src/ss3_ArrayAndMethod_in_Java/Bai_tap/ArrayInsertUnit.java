package ss3_ArrayAndMethod_in_Java.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertUnit {
    public static void main(String[] args){
        int arr[] = {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arrnew[] = new int[arr.length+1];
        Scanner scanner = new Scanner(System.in);
        int value,index;
        System.out.print("Enter the value need to insert!: ");
        value = scanner.nextInt();
        System.out.print("Enter the index need to insert!: ");
        index = scanner.nextInt();
        int push= 0;
        for (int i = 0; i < arr.length; i++) {
            arrnew[i] = arr[i];
        }
        for (int i = arrnew.length-1; i > index; i--) {
           arrnew[i] = arrnew[i-1];
        }
        arrnew[index] = value;
        System.out.println("ArrayOld is:" + Arrays.toString(arr));
        System.out.println("ArrayNew is:" + Arrays.toString(arrnew));
    }
}
