package ss10_mvc.service;

import ss10_mvc.model.Student;

public interface StudentService {
    void add(Student student); //tạo mới student
    Student[] findAll(); //lấy tất cả danh sách student
}
