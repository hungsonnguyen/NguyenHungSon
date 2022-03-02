package Exam.Controller;


import Exam.Service.Imp.HangNhapKhauServiceImp;
import Exam.Service.Imp.HangXuatKhauServiceImp;

import java.util.Scanner;

public class Controller {

    public static Scanner scanner = new Scanner(System.in);
    public static int select, choose;

    public static void main(String[] args) {
        displayMainMenu();

    }

    public static void displayMainMenu() {
        do {
            System.out.println("-- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--" +
                    "\n 1. Thêm mới " +
                    "\n 2. Xóa " +
                    "\n 3. Xem danh sách các sản phẩm" +
                    "\n 4. Tìm kiếm sản phẩm" +
                    "\n 5. Thoát" +
                    "\n Chọn chức năng: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    addNew();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    dispalyList();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.out.println("Cám ơn đã sử dụng dịch vụ!");
                    break;
                default:
                    System.out.println("Mời chọn lại");
            }

        } while (select != 5);
    }

    public static void addNew() {
        do {
            System.out.println("Mời lựa chọn tùy chỉnh" +
                    "\n 1. Thêm mới sản phẩm nhập khẩu" +
                    "\n 2. Thêm mới sản phẩm xuất khẩu" +
                    "\n 3. Trở về menu chính");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    HangNhapKhauServiceImp hangNhapKhauServiceImp= new HangNhapKhauServiceImp();
                    hangNhapKhauServiceImp.addnew();
                    break;
                case 2:
                    HangXuatKhauServiceImp hangXuatKhauServiceImp = new HangXuatKhauServiceImp();
                    hangXuatKhauServiceImp.addnew();
                    break;
                case 3:
                    System.out.println("Trở về menu chính!");
                    break;
                default:
                    System.out.println("Mời chọn lại");
            }
        } while (choose != 3);
    }

    public static void delete() {
        do {
            System.out.println("Mời lựa chọn tùy chỉnh" +
                    "\n 1. Xóa sản phẩm nhập khẩu" +
                    "\n 2. Xóa sản phẩm xuất khẩu" +
                    "\n 3. Trở về menu chính");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    HangNhapKhauServiceImp hangNhapKhauServiceImp= new HangNhapKhauServiceImp();
                    hangNhapKhauServiceImp.delete();
                    break;
                case 2:
                    HangXuatKhauServiceImp hangXuatKhauServiceImp = new HangXuatKhauServiceImp();
                    hangXuatKhauServiceImp.delete();
                    break;
                case 3:
                    System.out.println("Trở về menu chính!");
                    break;
                default:
                    System.out.println("Mời chọn lại");
            }
        } while (choose != 3);
    }

    public static void dispalyList() {
        do {
            System.out.println("Mời lựa chọn tùy chỉnh" +
                    "\n 1. Xem danh sán phẩm nhập khẩu" +
                    "\n 2. Xem danh sách xuất khẩu" +
                    "\n 3. Trở về menu chính");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    HangNhapKhauServiceImp hangNhapKhauServiceImp= new HangNhapKhauServiceImp();
                    hangNhapKhauServiceImp.display();
                    break;
                case 2:
                    HangXuatKhauServiceImp hangXuatKhauServiceImp = new HangXuatKhauServiceImp();
                    hangXuatKhauServiceImp.display();
                    break;
                case 3:
                    System.out.println("Trở về menu chính!");
                    break;
                default:
                    System.out.println("Mời chọn lại");
            }
        } while (choose != 3);
    }

    public static void search() {
        do {
            System.out.println("Mời lựa chọn tùy chỉnh" +
                    "\n 1. Tìm kiếm sản phẩm nhập khẩu" +
                    "\n 2. Tìm kiếm sản phẩm xuất khẩu" +
                    "\n 3. Trở về menu chính");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    HangNhapKhauServiceImp hangNhapKhauServiceImp= new HangNhapKhauServiceImp();
                    hangNhapKhauServiceImp.search();
                    break;
                case 2:
                    HangXuatKhauServiceImp hangXuatKhauServiceImp = new HangXuatKhauServiceImp();
                    hangXuatKhauServiceImp.search();
                    break;
                case 3:
                    System.out.println("Trở về menu chính!");
                    break;
                default:
                    System.out.println("Mời chọn lại");
            }
        } while (choose != 3);
    }
}
