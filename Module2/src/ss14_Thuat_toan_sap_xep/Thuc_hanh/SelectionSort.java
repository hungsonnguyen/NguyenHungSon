package ss14_Thuat_toan_sap_xep.Thuc_hanh;

public class SelectionSort {
    public static double[] myList = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length; i++) {
            double min = list[i];
            int currentMinIndex = i;
            for (int j = i+1; j < list.length; j++) {
                if (min> list[j]){
                    min = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(myList);
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] +"\n");
        }
    }
}
