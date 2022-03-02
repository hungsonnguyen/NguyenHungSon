package ss12_Map.Thuc_hanh.sort_with_comparable_Comparator;

import ss12_Map.Thuc_hanh.Distinguish_between_HashMap_and_HashSet.Student;

public class StudentComparable extends Student implements Comparable <StudentComparable>{
    public StudentComparable() {
    }

    public StudentComparable(String name, String address, int age) {
        super(name, address, age);
    }

    @Override
    public int compareTo(StudentComparable student) {
        return this.getName().compareTo(student.getName());
    }
}
