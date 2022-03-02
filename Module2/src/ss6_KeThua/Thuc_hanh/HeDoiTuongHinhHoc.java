package ss6_KeThua.Thuc_hanh;

public class HeDoiTuongHinhHoc {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("red", false);
        System.out.println(shape2);


        Circle cir1 = new Circle();
        System.out.println(cir1);

        Circle cir2 = new Circle(6.6);
        System.out.println(cir2);

        Circle cir3 = new Circle(6.6, "Brown", false);
        System.out.println(cir3);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(1,2);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle("red", false, 2, 5);
        System.out.println(rectangle2);

        Square square = new Square();
        System.out.println(square);

        Square square1 = new Square(4);
        System.out.println();

        Square square2 = new Square("red", false, 6);
        System.out.println(square2);
    }
}
