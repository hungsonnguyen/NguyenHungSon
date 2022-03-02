package ss20_design_pattern.singleton;

public class Singleton {
    /*Đảm bảo rằng instance này là duy nhất
    và chỉ được tạo ra tại class này.*/
    private static Singleton instance;

    /*Đảm bảo lớp khác không thể tạo được instance mới*/
    private Singleton(){};

    /*Kiểm tra và khởi tạo 1 đối tượng tại lớp này.*/
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
