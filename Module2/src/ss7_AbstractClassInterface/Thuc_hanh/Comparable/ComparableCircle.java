package ss7_AbstractClassInterface.Thuc_hanh.Comparable;

import ss6_KeThua.Thuc_hanh.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }


    @Override
    public int compareTo(ComparableCircle circle) {
        if (getRadius() > circle.getRadius()) return 1;
        else if (getRadius() < circle.getRadius()) return -1;
        else return 1;

    }
}
