package ss4_Class_and_Object_in_Java.Bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c, delta;
    public QuadraticEquation(){};
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c =c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double  getDiscriminant(){
        delta = b*b - 4*a*c;
        return delta;
    }
    public  double getRoot1(){
       double r1 = (-b + Math.sqrt(getDiscriminant())/(2*a));
       return r1;
    }
    public double getRoot2(){
        double r2 = (-b + Math.sqrt(getDiscriminant())/(2*a));
        return r2;
    }
    public void getRootOfEquation(){
        if (a+b+c==0){
            double x1 = 1;
            double x2 = c/a;
            System.out.println("Phương trình có 2 nghiệm là x1 = " + x1 + " và x2 = " + x2 );
        }
        else if (a-b+c == 0){
            double x1 = -1;
            double x2 = -c/a;
            System.out.println("Phương trình có 2 nghiệm là x1 = " + x1 + " và x2 = " + x2 );
        }
        else if (delta < 0 ){
            System.out.println("Phương trình vô nghiệm ");
        }
        else if (delta == 0){
            double x1 = -b/(a*2);
            System.out.println("Phương trình có nghiệm kép là x1 = " + x1 );
        }
        else if (delta > 0){
            System.out.println("Phương trình có 2 nghiệm là x1 = " + this.getRoot1() + " và x2 = " + this.getRoot2() );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        do {
            System.out.print("Nhập a (a # 0): ");
            a = scanner.nextDouble();
        } while (a == 0);
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        c = scanner.nextDouble();
        QuadraticEquation f = new QuadraticEquation(a, b, c);
        System.out.println("Phương trình bậc hai vừa nhập có dạng " + a +"x^2 +" +b + "x +" + c +" = 0 ");
        f.getRootOfEquation();
    }
}
