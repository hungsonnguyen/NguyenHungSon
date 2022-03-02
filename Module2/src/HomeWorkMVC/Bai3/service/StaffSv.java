package HomeWorkMVC.Bai3.service;

import HomeWorkMVC.Bai3.model.Staff;

import java.util.Scanner;

public class StaffSv extends Staff implements StaffService {
    public StaffSv() {
    }

    public StaffSv(int mnv, String name, String gender, String address, String dayOfBirth, String focus, String level, double heSoLuong, double phuCap) {
        super(mnv, name, gender, address, dayOfBirth, focus, level, heSoLuong, phuCap);
    }

    static private StaffSv[] staffSvs = new StaffSv[100];

    static {
        StaffSv staff = new StaffSv(1, "Nguyễn hùng sơn", "Nam", "Đà nẵng", "22.09.1994", "Công nghệ thông tin", "A", 20.5, 1.5);
        StaffSv staff1 = new StaffSv(1, "Nguyễn Minh trang", "Nam", "Đà nẵng", "22.09.1975", " cơ khí", "A", 10.5, 1.5);
        StaffSv staff2 = new StaffSv(1, "Nguyễn ngọc thịnh", "nữ", "Đà nẵng", "22.09.1983", "Công nghệ thông tin", "A", 15.5, 1.5);
        staffSvs[0] = staff;
        staffSvs[1] = staff1;
        staffSvs[2] = staff2;


    }

    private static int count = 3;
    static Scanner scanner = new Scanner(System.in);

    public StaffSv(int mnv, String name, String gender, String address, String dayOfBirth, String focus, String level, int heSoluong, int phuCap) {
    }

    @Override
    public void creatList() {

        System.out.print("Mời bạn nhập mã nhân viên: ");
        int mnv = Integer.parseInt(scanner.nextLine());

        System.out.print("Mời bạn nhập tên nhân viên: ");
        String name = scanner.nextLine();

        System.out.print("Mời bạn nhập giới tính: ");
        String gender = scanner.nextLine();

        System.out.print("Mời bạn nhập địa chỉ: ");
        String address = scanner.nextLine();

        System.out.print("Mời bạn nhập ngày sinh: ");
        String dayOfBirth = scanner.nextLine();

        System.out.print("Mời bạn nhập chuyên môn: ");
        String focus = scanner.nextLine();

        System.out.print("Mời bạn nhập trình độ: ");
        String level = scanner.nextLine();

        System.out.print("Mời bạn nhập hệ số lương: ");
        double heSoluong = Double.parseDouble(scanner.nextLine());

        System.out.print("Mời bạn nhập phụ cấp: ");
        double phuCap = Double.parseDouble(scanner.nextLine());

        StaffSv newstaffSv = new StaffSv(mnv, name, gender, address, dayOfBirth, focus, level, heSoluong, phuCap);
        staffSvs[count] = newstaffSv;
        count++;

    }

    @Override
    public void findAll() {
        for (int i = 0; i < staffSvs.length; i++) {
            if (staffSvs[i] == null) {
                break;
            }
            System.out.println(staffSvs[i]);
        }
    }


    @Override
    public String findWomen() {
        int countWomen = 0;
        String gen = "nữ";
        for (int i = 0; i < staffSvs.length; i++) {
            if (staffSvs[i] == null){
                break;
            }
            if (gen.equals(staffSvs[i].getGender())) {
                countWomen++;
            }
        }
        return "Số nhân viên nữ trong công ty là '" + countWomen + "' nhân viên";
    }

    @Override
    public double totalPayment() {
        double totalPayment = 0;
        for (int i = 0; i < staffSvs.length; i++){
            if (staffSvs[i] == null){
                break;
            }
            totalPayment += staffSvs[i].getHeSoLuong();
        }
        return totalPayment;
    }

    @Override
    public void findIt() {
        StaffSv[] staffSvs1 = new StaffSv[100];
        int countIT = 0;
        String iT = "Công nghệ thông tin";
        for (int i = 0; i < staffSvs.length; i++) {
            if (staffSvs[i] == null){
                break;
            }
            if (iT.equals(staffSvs[i].getFocus())) {
                staffSvs1[countIT] = staffSvs[i];
                countIT++;
            }
        }
        for (int i = 0; i < staffSvs1.length; i++) {
            if (staffSvs1[i] == null){
                break;
            }
            System.out.println(staffSvs1[i]);
        }
    }

    public static void main(String[] args) {
       StaffSv staffSv = new StaffSv();
       staffSv.findIt();

    }
}
