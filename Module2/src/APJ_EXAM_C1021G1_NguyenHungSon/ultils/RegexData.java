package APJ_EXAM_C1021G1_NguyenHungSon.ultils;

import case_study.until.ExceptionAge;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
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

    public static String checkAge(String temp, String regex) {
        boolean check = true;
        do {
            try {
                if (Pattern.matches(regex, temp)) {
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
                    LocalDate dayofBirth = LocalDate.parse(temp, dateTimeFormatter);
                    LocalDate thisDay = LocalDate.now();
                    int age = Period.between(dayofBirth, thisDay).getYears();
                    if (age < 100 && age > 18) {
                        check = false;
                    } else {
                        throw new ExceptionAge("Độ tuổi người dùng phải nằm trong khoảng từ 18 -100");
                    }

                } else {
                    throw new ExceptionAge("Người dùng nhập sai định dạng. Mời nhập lại theo định dạng dd/mm/yyyy! ");

                }
            } catch (ExceptionAge e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }
    public static String checkId(String temp, String regex) {
        boolean check = true;
        do {
            try {
                if (Pattern.matches(regex, temp)) {
                        check = false;
                    }
                else {
                        throw new IdException("Nhập sai id mời nhập lại");
                    }

                } catch (IdException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();

            }
        } while (check);
        return temp;
    }
}
