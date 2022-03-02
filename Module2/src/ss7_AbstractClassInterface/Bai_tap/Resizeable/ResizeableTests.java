package ss7_AbstractClassInterface.Bai_tap.Resizeable;

import ss6_KeThua.Thuc_hanh.Circle;
import ss6_KeThua.Thuc_hanh.Rectangle;
import ss6_KeThua.Thuc_hanh.Shape;
import ss6_KeThua.Thuc_hanh.Square;

import java.util.Scanner;

public class ResizeableTests {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3,"yellow",false);
        shapes[1] = new Rectangle("red",true,3,4);
        shapes[2] = new Square("blue",true,6);
        Scanner scanner = new Scanner(System.in);
        double scale = 0;
        System.out.println("Before resize");
        for( Shape ob: shapes){
            System.out.println(ob);
        }
        System.out.println("----------\n"+"After resize");
        for ( Shape ob: shapes){
            System.out.print("Nhập giá trị tăng kích cỡ: ");
            scale = scanner.nextDouble();
            ob.resize(scale);
            System.out.println(ob);
        }
    }
}
