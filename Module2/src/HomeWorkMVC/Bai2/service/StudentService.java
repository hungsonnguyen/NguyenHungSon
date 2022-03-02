package HomeWorkMVC.Bai2.service;

import HomeWorkMVC.Bai2.model.Student;

public interface StudentService {
    void addStudent();
    void removeMssv();
    void removeP();
    Student searchStudent();
    Student[] printAll();
    void sort();
}
