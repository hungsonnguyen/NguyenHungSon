package ss2_LoopInJava.Bai_tap;

public class Display_20_numberOf_Prime {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        String str = "";
        boolean check = false;
        while (count <=20){
            check = true;
            for (int i = 2; i<=Math.sqrt(n);i++){
                if (n %i ==0){
                    check = false;
                    break;
                }
            }
            if (check){
                count++;
                str += n + "; ";
            }n++;
        }System.out.println(str);
    }
}
