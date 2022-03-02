package HomeWorkMVC.Bai2.controller;

import HomeWorkMVC.Bai2.model.Student;
import HomeWorkMVC.Bai2.service.im.StudentServiceIMp;

import java.util.Arrays;
import java.util.Scanner;

public class StudentController {

    public static void main(String[] args) {
        Student[] studentList = null;
        StudentServiceIMp studentServiceIMp = new StudentServiceIMp();
        int select = 0;
        int value = 0;
        String string = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu" +
                    "\n 1 : Hiển thị danh sách sinh viên" +
                    "\n 2 : Thêm sinh viên" +
                    "\n 3 : Xóa sinh viên trong danh sách theo MSSV" +
                    "\n 4 : Xóa sinh viên theo số tự" +
                    "\n 5 : Tìm kiếm ính viên trong danh sách" +
                    "\n 6 : Sắp xếp danh sách sinh viên" +
                    "\n 7 : Exit");
            System.out.print("Mời lựa chọn: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.println("Danh sách sinh viên ");
                    studentList = studentServiceIMp.printAll();
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;
                case 2:


                    studentServiceIMp.addStudent();
                    break;
                case 3:

                    studentServiceIMp.removeMssv();
                    break;
                case 4:

                    studentServiceIMp.removeMssv();
                    break;
                case 5:

                    System.out.println(studentServiceIMp.searchStudent());;
                    break;
                case 6:
                    studentServiceIMp.sort();
                    break;
                case 7:
                    System.out.println("Cám ơn đã sử dụng chương trình của chúng tôi");
            }

        } while (select != 7);


    }
}
