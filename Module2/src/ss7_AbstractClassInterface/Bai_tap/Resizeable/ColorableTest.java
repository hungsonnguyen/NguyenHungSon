package ss7_AbstractClassInterface.Bai_tap.Resizeable;

import ss6_KeThua.Thuc_hanh.Shape;
import ss6_KeThua.Thuc_hanh.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square("red",false,2);
        shapes[1] = new Square("purple",true,6);
        for (Shape shape: shapes){
            System.out.println(shape);
            shape.howToColor();
        }
    }
}
