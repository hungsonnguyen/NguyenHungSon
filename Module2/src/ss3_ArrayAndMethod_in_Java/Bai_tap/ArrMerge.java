package ss3_ArrayAndMethod_in_Java.Bai_tap;

import java.util.Arrays;

public class ArrMerge {
    public static void main(String[] args){
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,7,8};
        int arr3[] = new int[arr1.length + arr2.length];
        System.out.println("Array wasn't merged:" + Arrays.toString(arr3));
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length ; i++) {
            arr3[i+ arr1.length] = arr2[i];
        }
        System.out.println("Array1 is:" + Arrays.toString(arr1));
        System.out.println("Array2 is:" + Arrays.toString(arr2));
        System.out.println("Array was merged:" + Arrays.toString(arr3));
    }
}
