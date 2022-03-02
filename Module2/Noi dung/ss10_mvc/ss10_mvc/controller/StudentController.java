package ss10_mvc.controller;

import ss10_mvc.model.Student;
import ss10_mvc.service.StudentService;
import ss10_mvc.service.impl.StudentServiceImpl;

import java.util.Scanner;

public class StudentController { //nhập liệu, hiển thị, gọi service..
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();
        Student[] studentList = null;

        int select = 0;
        do {
            System.out.println("--Student Menu--");
            System.out.println("1. List all");
            System.out.println("2. Add new");
            System.out.println("9. Exit");

            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 1: //list all
                    studentList = studentService.findAll();
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;
                case 2: //add new
                    System.out.print("Input id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input name:");
                    String name = scanner.nextLine();
                    Student studentNew = new Student(id, name);
                    studentService.add(studentNew);

                    break;
                case 9:
                    break;
                default:
                    System.out.println("input err!");
            }

        }while (select != 9);
    }
}
