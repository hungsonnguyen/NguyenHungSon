package ss2_LoopInJava.Bai_tap;

public class Display_Shape {
    public static void main(String[] args) {
//        // In hình chữ nhật
//        for (int i = 0; i<3;i++){
//            System.out.println("");
//            for (int j = 0; j<6; j++){
//                System.out.print("* ");
//            }
//        }
        // In hình tam giác vuông, có cạnh góc vuông ở botton-left
//        for (int i = 0; i<=5 ; i++){
//            System.out.println("");
//            for (int j = 0; j < i;j++){
//                System.out.print("* ");
//            }
//        }
        // hình tam giác vuông, có cạnh góc vuông ở top-left
        for (int i = 0 ; i<= 5; i++){
            System.out.println("");
            for (int j=5; j>i; j--){
                System.out.print("* ");
            }
        }
    }
}
