package APJ_EXAM_C1021G1_NguyenHungSon.Controller;

import APJ_EXAM_C1021G1_NguyenHungSon.Service.Imp.StudentServiceImp;
import APJ_EXAM_C1021G1_NguyenHungSon.Service.Imp.TeacherServiceImp;

import java.util.Scanner;

public class ManageController {
    public static Scanner scanner = new Scanner(System.in);
    public static int select, choose;

    public static void main(String[] args) {
        do {
            System.out.println("-- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--" +
                    "\n 1. Thêm mới giảng viên hoặc học sinh" +
                    "\n 2. Xóa giảng viên hoặc học sinh" +
                    "\n 3. Xem danh sách giảng viên hoặc học sinh" +
                    "\n 4. Tìm kiếm giảng viên hoặc học sinh" +
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
                    "\n 1. Thêm mới học sinh" +
                    "\n 2. Thêm mới giảng viên" +
                    "\n 3. Trở về menu chính");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    StudentServiceImp studentServiceImp = new StudentServiceImp();
                    studentServiceImp.addnew();
                    break;
                case 2:
                    TeacherServiceImp teacherServiceImp = new TeacherServiceImp();
                    teacherServiceImp.addnew();
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
                    "\n 1. Xóa học sinh" +
                    "\n 2. Xóa giảng viên" +
                    "\n 3. Trở về menu chính");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    StudentServiceImp studentServiceImp = new StudentServiceImp();
                    studentServiceImp.delete();
                    break;
                case 2:
                    TeacherServiceImp teacherServiceImp = new TeacherServiceImp();
                    teacherServiceImp.delete();
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
                    "\n 1. Xem danh sách học sinh" +
                    "\n 2. Xem danh sách giảng viên" +
                    "\n 3. Trở về menu chính");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    StudentServiceImp studentServiceImp = new StudentServiceImp();
                    studentServiceImp.display();
                    break;
                case 2:
                    TeacherServiceImp teacherServiceImp = new TeacherServiceImp();
                    teacherServiceImp.display();
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
                    "\n 1. Tìm kiếm học sinh" +
                    "\n 2. Tìm kiếm giảng viên" +
                    "\n 3. Trở về menu chính");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    StudentServiceImp studentServiceImp = new StudentServiceImp();
                    studentServiceImp.search();
                    break;
                case 2:
                    TeacherServiceImp teacherServiceImp = new TeacherServiceImp();
                    teacherServiceImp.search();
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
