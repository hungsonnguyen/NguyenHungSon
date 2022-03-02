package ss14_Thuat_toan_sap_xep.Bai_tap;

import java.util.List;

public class InsertionSort {

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
        Integer[] list = {2, 3, 2, 5, 6, 1, -20, 3, 14, 12};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ "\n");
        }
    }


}
