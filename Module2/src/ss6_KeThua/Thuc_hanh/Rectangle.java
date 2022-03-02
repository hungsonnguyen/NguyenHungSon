package ss6_KeThua.Thuc_hanh;

import ss7_AbstractClassInterface.Bai_tap.Resizeable.Resizeable;

public class Rectangle extends Shape{
    public double width = 1.0;
    public double length = 1;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        double area = 0;
        area = width*length;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 0;
        perimeter = (width+length)*2;
        return perimeter;

    }

    @Override
    public String toString() {
        return "A Rectangle wiht" +
                "width="
                + width
                + " and length="
                + length
                +" which a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        double xWidth = this.getWidth()*(1+percent/100);
        double xHeight = this.getLength()*(1+percent/100);
        this.setWidth(xWidth);
        this.setLength(xHeight);
        this.getArea();
    }
}
