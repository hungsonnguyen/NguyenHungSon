package Exam.until;

import APJ_EXAM_C1021G1_NguyenHungSon.ultils.IdException;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckRegex {
    static Scanner scanner = new Scanner(System.in);
    public static String checkStr(String temp, String regex, String error) {
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }
    public static String checkCodeProduct(String temp, String regex) {
        boolean check = true;
        do {
            try {
                if (Pattern.matches(regex, temp)) {
                    check = false;
                }
                else {
                    throw new IdException("Nhập sai mã sản phẩm mời nhập lại");
                }

            } catch (IdException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();

            }
        } while (check);
        return temp;
    }
}
