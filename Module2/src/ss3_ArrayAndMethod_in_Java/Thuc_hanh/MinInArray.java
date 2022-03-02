package ss3_ArrayAndMethod_in_Java.Thuc_hanh;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Min in array: " + min);
    }
}
