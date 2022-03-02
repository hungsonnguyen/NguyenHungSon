package ss15_Debug.Bai_tap;

import ss15_Debug.Bai_tap.IllegalTriangleException.IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    private double a,b,c;

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        setTongHaiCanh(a,b,c);
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
public void setTongHaiCanh(double a, double b, double c  ) throws IllegalTriangleException {
        if (a+b< c || a+c<b || b+c <a ){
            throw new IllegalTriangleException("Tổng hai cạnh tam giác phải lớn hơn cạnh còn lại!");
        }
        if (a<0 || b<0||c<0){
            throw new IllegalTriangleException("Cạnh tam giác phải là số dương!");
        }else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
}
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập giá trị cạnh a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập giá trị cạnh b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập giá trị cạnh c: ");
        double c = Double.parseDouble(scanner.nextLine());
        try {
            Triangle triangle;
            triangle = new Triangle(a,b,c);
            System.out.println(triangle);


        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }

    }
}
