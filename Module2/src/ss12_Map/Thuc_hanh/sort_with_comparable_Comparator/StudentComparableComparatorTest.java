package ss12_Map.Thuc_hanh.sort_with_comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparableComparatorTest {
    private static StudentComparator student;

    public static void main(String[] args) {
        StudentComparable student = new StudentComparable("Kien", "HT", 30);
        StudentComparable student1 = new StudentComparable("Nam", "HT", 26);
        StudentComparable student2 = new StudentComparable("Anh", "HT", 38 );
        StudentComparable student3 = new StudentComparable("Tung", "HT", 38);

        List<StudentComparable> lists = new ArrayList<StudentComparable>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(StudentComparable st : lists){
            System.out.println(st.toString());
        }

        StudentComparator ageComparator = new StudentComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(StudentComparable st : lists){
            System.out.println(st.toString());
        }
    }
}
