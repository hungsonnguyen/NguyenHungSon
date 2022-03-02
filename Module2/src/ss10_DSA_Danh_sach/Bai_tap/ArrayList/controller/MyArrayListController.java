package ss10_DSA_Danh_sach.Bai_tap.ArrayList.controller;

import HomeWorkMVC.Bai2.model.Student;
import HomeWorkMVC.Bai2.service.im.StudentServiceIMp;
import ss10_DSA_Danh_sach.Bai_tap.ArrayList.service.MyArrayList;

public class MyArrayListController {
    public static void main(String[] args) {
        Student student = new StudentServiceIMp(1, "Nguyễn Hùng Sơn", "12/03/1994", " Nam", "C10", "g1_21");
        Student student1 = new StudentServiceIMp(4, "Nguyễn Minh Trang", "12/10/1975", " Nam", "C10", "g1_21");
        Student student2 = new StudentServiceIMp(2, "Nguyễn Ngọc Thịnh", "21/05/1984", " Nam", "C10", "g1_21");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<Student>();
        studentMyArrayList.add(student);
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        System.out.println("----");
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student studentObject = (Student) studentMyArrayList.elements[i];
            System.out.println(studentObject);
        }
        System.out.println(studentMyArrayList.get(0));
        System.out.println("Số phần tử trong mảng hiện tại: " +   studentMyArrayList.size());
        System.out.println("----");
        studentMyArrayList.remove(0);
        System.out.println("Số phần tử trong mảng hiện tại: " +   studentMyArrayList.size());
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student studentObject = (Student) studentMyArrayList.elements[i];
            System.out.println(studentObject);
        }
        System.out.println("----");
        studentMyArrayList.clear();
        System.out.println("Số phần tử trong mảng hiện tại: " +   studentMyArrayList.size());
        System.out.println(studentMyArrayList.get(0));
    }
}
