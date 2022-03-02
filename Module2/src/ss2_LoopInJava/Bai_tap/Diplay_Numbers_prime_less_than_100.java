package ss2_LoopInJava.Bai_tap;

public class Diplay_Numbers_prime_less_than_100 {
    public static void main(String[] args) {
        int n = 2;
        String str = "";
        boolean check = false;
        while (n <= 100) {
            check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                str += n + "; ";
            }
            n++;
        }
        System.out.println(str);
    }
}


