package ss17_File_and_Serialization.Thuc_hanh.read_and_write_List_Student;

import ss3_ArrayAndMethod_in_Java.Thuc_hanh.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadObject {
    public static final String SS17SOURCE = "E:\\Code Gym\\Module 1\\Github\\Module2\\src\\ss17_File_and_Serialization\\Thuc_hanh\\read_and_write_List_Student\\source.txt";

    public static void wirte(String source, List<StudentImplemenySerializable> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(source);
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
            os.writeObject(list);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<StudentImplemenySerializable> read(String source) {
        List<StudentImplemenySerializable> list = new ArrayList<StudentImplemenySerializable>();
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            ObjectInputStream is = new ObjectInputStream(fileInputStream);
            list = (List<StudentImplemenySerializable>) is.readObject();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {

        List<StudentImplemenySerializable> students = new ArrayList<StudentImplemenySerializable>();
        students.add(new StudentImplemenySerializable(1, "Hoa", "Da nang"));
        students.add(new StudentImplemenySerializable(2, "lan", "Da nang"));
        students.add(new StudentImplemenySerializable(3, "hue", "Da nang"));
        students.add(new StudentImplemenySerializable(4, "hong", "Da nang"));
        wirte(SS17SOURCE, students);
        List<StudentImplemenySerializable> students1;
        students1 = read(SS17SOURCE);
        for (StudentImplemenySerializable student : students1
        ) {
            System.out.println(student);

        }
    }

}
