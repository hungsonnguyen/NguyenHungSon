package ss5_access_modifier_staticmethod_staticproperty.Bai_tap;

public class AccessModiferCircle {
    private double radius = 1.0;
    private String color = "red";

    public AccessModiferCircle(){

    }

    public AccessModiferCircle(double radius) {
        this.radius = radius;
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
        double area;
        area = radius*radius*Math.PI;
        return area;
    }

    public static void main(String[] args) {
        AccessModiferCircle cir1 = new AccessModiferCircle(5);
        System.out.println("Diện tích hình tròn : "+ cir1.getArea());
    }

}
