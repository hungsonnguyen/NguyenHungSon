package ss4_Class_and_Object_in_Java.Bai_tap;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = true;
    private double radius = 5;
    private String color = "Blue";
    public Fan(){};

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    @Override
        public String toString(){
        if (isOn()){
            return "Color is : "+getColor() +" - Radius is: " + getRadius() +" - Speed is: " + getSpeed() + " - Fan is on";

        }
        else {
            return  "Color is : "+getColor() +" - Radius is: " + getRadius() + " - Fan is off";
        }

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);;
        fan1.setOn(true);
        System.out.println(fan1.toString());
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);;
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}
