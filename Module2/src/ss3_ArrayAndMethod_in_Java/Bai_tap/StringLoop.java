package ss3_ArrayAndMethod_in_Java.Bai_tap;

import java.util.Scanner;

public class StringLoop {
    public static void main(String[] args){
        String str;
        int count = 0;
        String kituStr ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi bất kỳ: ");
        str = scanner.nextLine();
        char[] mangkitu = str.toCharArray();
        // duyệt từ đầu đến cuối chuỗi
        System.out.print("Nhập vào kí tự bất kỳ cần tìm trong chuỗi: ");
        kituStr = scanner.nextLine();
        char kitu = kituStr.charAt(0);
        for (int i = 0; i < mangkitu.length; i++) {
            // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
            if (mangkitu[i] == kitu) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kitu +
                " trong chuỗi " + str + " = " + count);
    }
}