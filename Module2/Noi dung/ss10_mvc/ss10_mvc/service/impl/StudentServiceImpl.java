package ss10_mvc.service.impl;

import ss10_mvc.model.Student;
import ss10_mvc.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private static Student[] studentList = new Student[3];

    static {
        studentList[0] = new Student(1, "Đạt");
        studentList[1] = new Student(2, "Bảo");
        studentList[2] = new Student(3, "Khoa");
    }

    @Override
    public void add(Student student) {
        Student[] newStudentList = new Student[studentList.length + 1];
        newStudentList[newStudentList.length - 1] = student;

        //copy giá trị cũ qua mảng mới
        for(int index = 0; index < studentList.length; index++){
            newStudentList[index] = studentList[index];
        }

        studentList = newStudentList;
    }

    @Override
    public Student[] findAll() {
        return studentList;
    }
}
