package ss12_Map.Thuc_hanh.Distinguish_between_HashMap_and_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyễn hùng sơn","đà nẵng",25);
        Student student2 = new Student("Nguyễn minh trang","đà nẵng",25);
        Student student3 = new Student("Nguyễn ngọc thịnh","đà nẵng",25);
        Student student4 = new Student("Nguyễn thu thủy","đà nẵng",25);
        Student student5 = new Student("Nguyễn ánh tâm","đà nẵng",25);


        Map<Integer, Student> myHashMapStudent = new HashMap<Integer, Student>();
        myHashMapStudent.put(1,student1);
        myHashMapStudent.put(2,student1);
        myHashMapStudent.put(3,student1);
        myHashMapStudent.put(4,student1);
        myHashMapStudent.put(5,student1);
        for(Map.Entry<Integer, Student> student : myHashMapStudent.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println("----------------");
        Set<Student> myHashSetStudent = new HashSet<Student>();
        myHashSetStudent.add(student1);
        myHashSetStudent.add(student2);
        myHashSetStudent.add(student3);
        myHashSetStudent.add(student4);
        myHashSetStudent.add(student5);
        for(Student student : myHashSetStudent){
            System.out.println(student.toString());
        }

    }
}
