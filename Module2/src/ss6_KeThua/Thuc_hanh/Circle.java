package ss6_KeThua.Thuc_hanh;

import ss7_AbstractClassInterface.Bai_tap.Resizeable.Resizeable;

public class Circle extends Shape{
    public double radius =1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area = 0;
        area = radius*radius*Math.PI;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 0;
        perimeter = 2*Math.PI*radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public void resize(double percent) {
        double xSize = this.getRadius() * (1+percent/100);
        this.setRadius(xSize);

    }

}
