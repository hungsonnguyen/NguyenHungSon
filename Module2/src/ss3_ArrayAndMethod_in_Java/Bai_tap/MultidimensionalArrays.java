package ss3_ArrayAndMethod_in_Java.Bai_tap;

public class MultidimensionalArrays {
    public static void main(String[] args){
        int[][] myNumbers = { {1, 2, 9, 4}, {5, 6, 7} };
        int max = myNumbers[0][0];
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 1; j < myNumbers[i].length; j++) {
                if(myNumbers[i][j] > max){
                    max = myNumbers[i][j];
                }
            }
        }
        System.out.println("The Max number in MultidimensionalArrays is: " + max);
    }
}
