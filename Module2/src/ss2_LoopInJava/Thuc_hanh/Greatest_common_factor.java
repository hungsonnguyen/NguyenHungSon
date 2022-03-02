package ss2_LoopInJava.Thuc_hanh;

import java.util.Scanner;

public class Greatest_common_factor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.print("Mời bạn nhập số nguyên a: ");
        a = input.nextInt();
        System.out.print("Mời bạn nhập số nguyên b: ");
        b = input.nextInt();
        a= Math.abs(a);
        b= Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("Không có ước chung giữa a và b");
        }
        while (a != b){
            if (a>b){
                a = a -b;
            }else {
                b = b -a;
            }
        }
            System.out.println("Ước chung lớn nhất là: " + a);
        }
}
