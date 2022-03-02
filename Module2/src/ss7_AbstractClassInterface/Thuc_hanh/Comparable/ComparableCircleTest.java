package ss7_AbstractClassInterface.Thuc_hanh.Comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        Comparable[] circles = new Comparable[3];
        circles[0] = new ComparableCircle(3.5);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(4.5,"yellow",false);

        System.out.println("Pre sort");
        for( Comparable circle: circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After sort");

        for (Comparable circle: circles){
            System.out.println(circle);
        }

    }
}
