package ss4_Class_and_Object_in_Java.Bai_tap;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class StopWatch {

    private long startTime;
    private long endTime;

    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
        public void elapsedTime () {
            long time = (endTime - startTime);
            System.out.println("Thời gian đếm đc là : " + time + " (Mili giây)");
        }

        public static void main (String[]args){
            StopWatch timer1 = new StopWatch();
            timer1.start();
            System.out.println("Thời gian bắt đầu là :" + timer1.getStartTime());
            System.out.println("Tính thời gian thực hiện nhập và tìm nghiệm phương trình bậc hai sau: ");
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
            timer1.stop();
            timer1.elapsedTime();
        }
    }

