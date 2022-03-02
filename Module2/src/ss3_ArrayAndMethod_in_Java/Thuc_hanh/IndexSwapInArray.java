package ss3_ArrayAndMethod_in_Java.Thuc_hanh;

import java.util.Scanner;

public class IndexSwapInArray {
    public static void main(String[] args) {
    int size;
    int array[];
    Scanner scanner = new Scanner(System.in);
    do{
        System.out.print("Enter a size of of array: ");
        size = scanner.nextInt();
    }while (size>20);
    array = new int[size];
    for( int i = 0; i < array.length; i++){
        System.out.print("Enter element " + (i+1) + ": ");
        array[i] = scanner.nextInt();
    }
        System.out.printf("%-20s%s", "Elements in array: ", "");
    for (int i = 0; i < array.length; i++){
        System.out.print(array[i] + "\t");
    }
    for (int i= 0; i < array.length/2; i++){
        int temp =array[i];
        array[i] = array[array.length -1 - i];
        array[array.length -1-i] = temp;
    }
        System.out.printf("%-20s%s", "Elements in array: ", "");
    for (int i = 0 ; i< array.length; i++){
        System.out.print(array[i]+ "\t");
    }
    }
}
