package ss6_KeThua.Bai_tap;

import ss6_KeThua.Thuc_hanh.Shape;

import java.util.Scanner;

public class Triangle extends Shape {
    public double side1 = 1;
    public double side2 = 1;
    public double side3 = 1;

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setSide(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        double perimeter = 0;
        perimeter = side1 + side2 + side3;
        return perimeter;
    }

    public double getArea() {
        double area = 0;
        double p = this.getPerimeter() * 0.5;
        area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;
    }

    @Override
    public String toString() {
        return " A Triangle with{" +
                "  side1= " + side1 +
                ", side2= " + side2 +
                ", side3= " + side3 +
                ", Area= " + getArea() +
                ", Perimeter= " + getPerimeter() +
                "} "
                + "which is subcalass of: "
                + super.toString();
    }

    public static void main(String[] args) {
        String clo ="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the side 3: ");
        double side3 = scanner.nextDouble();
        clo = scanner.nextLine();
        Triangle triangle = new Triangle("red", true, side1, side2, side3);
        System.out.println(triangle);
    }
}
