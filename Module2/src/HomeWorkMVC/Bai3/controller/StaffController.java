package HomeWorkMVC.Bai3.controller;

import HomeWorkMVC.Bai3.service.StaffSv;

import java.util.Scanner;

public class StaffController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StaffSv staffSv = new StaffSv();
        int select =0;
       do {
           System.out.println(" Menu " +
                   "\n 1. Tạo nhập mới danh sách" +
                   "\n 2. Hiển thị danh sách" +
                   "\n 3: Đếm xem có bao nhiêu cán bộ nữ trong cơ quan" +
                   "\n 4: Tính tổng số lương thu nhập của toàn bộ cán bộ trong danh sách" +
                   "\n 5: Liệt kê các cán bộ có chuyên môn “ Công nghệ thông tin “ hiện có trong danh sách" +
                   "\n 6: Exit");
           System.out.print("Mời bạn lựa chọn phương thức: ");
           select = Integer.parseInt(scanner.nextLine());
           switch (select){
               case 1:
                   staffSv.creatList();
                   break;
               case 2:
                   staffSv.findAll();
                   break;
               case 3:
                   System.out.println(staffSv.findWomen());
               case 4:
                   System.out.print("Tổng sô lương thu nhập của toàn cán bộ là: "+staffSv.totalPayment());
                   break;
               case 5:
                   staffSv.findIt();
               case 6:
                   System.out.println("Cám ơn đã sử dụng dịch vụ");
           }
       }while (select!= 6);
    }
}
