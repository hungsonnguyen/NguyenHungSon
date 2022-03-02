package ss12_Map.Thuc_hanh.sort_with_comparable_Comparator;

import ss12_Map.Thuc_hanh.Distinguish_between_HashMap_and_HashSet.Student;

import java.util.Comparator;

public class StudentComparator extends Student implements Comparator<StudentComparable> {
    public StudentComparator() {
    }

    public StudentComparator(String name, String address, int age) {
        super(name, address, age);
    }

    @Override
    public int compare(StudentComparable o1, StudentComparable o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}
