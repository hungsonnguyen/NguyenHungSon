package ss6_KeThua.Thuc_hanh;

import ss7_AbstractClassInterface.Bai_tap.Resizeable.Colorable;
import ss7_AbstractClassInterface.Bai_tap.Resizeable.Resizeable;

public class Square extends Rectangle {
    public Square(){

    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side: "
                +getSide()
                +", which is a subclass of "
                +super.toString();
    }

    @Override
    public void resize(double percent) {
        double xSide = this.getSide() * (1+percent/100);
        this.setSide(xSide);
        super.getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all full sides");
    }
}
