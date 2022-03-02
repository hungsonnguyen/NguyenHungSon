package ss6_KeThua.Bai_tap;

public class CircleAndCylinder {
    public double radius = 1;
    public String color = "red";
    public boolean filled = true;

    public CircleAndCylinder(){

    }

    public CircleAndCylinder(double radius) {
        this.radius = radius;
    }

    public CircleAndCylinder(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        double area = 0;
        area = radius*radius*Math.PI;
        return area;
    }
    public double getPerimeter(){
        double preimeter = 0;
        preimeter = 2*radius*Math.PI;
        return preimeter;
    }

    @Override
    public String toString() {
        return "Circle with {" +
                "radius="
                + radius
                + ", color='"
                + color
                + '\''
                + " and "+(isFilled() ? " filled " : " not filled ")+
                '}';
    }

    public static void main(String[] args) {
        CircleAndCylinder circle = new CircleAndCylinder();
        System.out.println(circle);
    }
}
class Cylinder extends CircleAndCylinder{
    public double height = 1;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, boolean filled, double height) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        double volume = 0;
       volume = super.getArea()*height;
       return volume;
    }

    @Override
    public String toString() {
        return "A Cylinder which radius "
                + radius
                + " which is subclass of : "
                + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        Cylinder cylinder1 = new Cylinder(5,5);
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(5,"blue", false, 5);
        System.out.println(cylinder2);

        System.out.println("The vollume "+cylinder2.getVolume());
    }
}