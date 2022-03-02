package as.service;

import as.model.Student;


public interface StudentService {
    void add(Student student); //tạo mới student
    Student[] findAll(); //lấy tất cả danh sách student
}
