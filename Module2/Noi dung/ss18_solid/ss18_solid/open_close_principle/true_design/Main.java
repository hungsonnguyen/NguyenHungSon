package ss18_solid.open_close_principle.true_design;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Geometry> geometries = new ArrayList<>();
        geometries.add(new Square(new Point(10, 20), 100));
        geometries.add(new Circle(new Point(10, 20), 10));
        geometries.add(new Rectangle(new Point(20, 30), 100, 200));
        for (Geometry shape : geometries) {
            System.out.println(shape.area());
        }
    }
}
