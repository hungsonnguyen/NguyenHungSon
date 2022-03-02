package ss14_Thuat_toan_sap_xep.Bai_tap;

import java.util.Scanner;

public class InsertionSortByStep extends InsertionSort{
    public InsertionSortByStep() {
    }
    public void insertionSort(Number[] list){
        Number min;
        int check;
        for (int i = 1; i < list.length; i++) {
            min = list[i];
            check = i;
            while (check >0 && min.doubleValue() < list[check -1 ].doubleValue()){
                list[check] = list[check -1];
                check--;
            }
            list[check] = min;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter size list: ");
        size = Integer.parseInt(scanner.nextLine());
        Integer[] mylist = new Integer[size];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = Integer.parseInt(scanner.nextLine());
        }
        InsertionSortByStep insertionSortByStep = new InsertionSortByStep();
        insertionSortByStep.insertionSort(mylist);
        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + "\t");

        }

    }




}
