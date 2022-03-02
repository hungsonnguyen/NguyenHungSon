package ss3_ArrayAndMethod_in_Java.Bai_tap;

import java.util.Scanner;

public class TotalInMultiArray {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner scanner = new Scanner(System.in);
        int col = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j){
                    sum += arr[i][j];
                }
            }
        }
//        Scanner scanner = new Scanner(System.in);
//        int column = 0;
//        int row = 0;
//        int col = 0;
//        int sum = 0;
//        System.out.print("The columns of array is:" + column);
//        column = scanner.nextInt();
//        System.out.print("The rows of array is:" + row);
//        row = scanner.nextInt();
//        int[][] arr = new int[row][column];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print("Value at row ' " + (i+1) + "' and column '" + (j+1) + "' : ");
//                arr[i][j] = scanner.nextInt();
//                if (i == j){
//                    sum += arr[i][j];
//                }
//            }
//        }
        System.out.println("Total is : " + sum);
//    }
    }
}
