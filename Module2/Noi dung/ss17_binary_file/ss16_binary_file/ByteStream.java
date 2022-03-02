package ss16_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ByteStream {

    public static final String FILE_PATH = "D:\\WorkSpace\\03_Company\\02_CodeGym\\02_Class\\2021\\C1021G1\\Module_2\\SourceDemo\\src\\ss16_binary_file\\student.dat";

    public static void writeObject(Student student) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.close();
    }

    public static void writeObjectList(List<Student> studentList) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(studentList);
        oos.close();
    }

    public static Student readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = (Student) ois.readObject();
        ois.close();

        return student;
    }

    public static List<Student> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Student> studentList = (List<Student>) ois.readObject();
        ois.close();

        return studentList;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student(1, "Hoa", "Ha Noi");
        writeObject(student);
//        writeObject(new Student(2, "Hoang"));
        System.out.println(student);
        System.out.println(readObject());
//        List<Student> studentList = new ArrayList<>();
//        Student student1 = new Student(1,"Hoa");
//        Student student2 = new Student(2,"Hoang");
//        studentList.add(student1);
//        studentList.add(student2);
//        System.out.println(student1);
//        System.out.println(student2);

//        writeObjectList(studentList);
//
//        List<Student> studentList1 = readObjectList();
//        for(Student student: studentList1){
//            System.out.println(student);
//        }
    }
}
