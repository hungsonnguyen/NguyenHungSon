package ss14_Thuat_toan_sap_xep.Thuc_hanh;

import java.util.Scanner;

public class BubleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter list size");
        size = Integer.parseInt(scanner.nextLine());
        int[] myList = new int[size];
        System.out.println("Enter " + myList.length + "values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Display your list: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + "\t ");
        }
        System.out.println("\n Begin sort");
        bubbleSortByStep(myList);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean check = true;
        for (int i = 1; i < list.length && check; i++) {
            check = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("Swap " + list[j] + " with " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the " + i + " sort: ");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + "\t");
            }
            System.out.println();
        }

    }

}
