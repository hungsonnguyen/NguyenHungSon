package ss12_Map.Bai_tap.Luyen_tap_su_dung_ArrayList_LinkedList_trong_JavaCollection_Framework.controller;

import ss12_Map.Bai_tap.Luyen_tap_su_dung_ArrayList_LinkedList_trong_JavaCollection_Framework.service.ProductServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        ProductServiceImpl productService = new ProductServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int sellect;

        do {
            System.out.println("------Menu------" +
                    "\n 1: Thêm sản phẩm" +
                    "\n 2: Sửa thông tin sản phẩm" +
                    "\n 3: Xóa sản phẩm theo id" +
                    "\n 4: Hiển thị danh sách sản phẩm" +
                    "\n 5: Sắp xếp sản phẩm tăng dần, giảm dần theo giá" +
                    "\n 6: Tìm kiếm sản phẩm trong mảng" +
                    "\n 7: Exit menu");
            System.out.print("Mời bạn lựa chọn phương thức: ");
            sellect = Integer.parseInt(scanner.nextLine());
            switch (sellect) {
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.edit();
                    break;
                case 3:
                    productService.remove();
                    break;
                case 4:
                    productService.displayProduct();
                    break;
                case 5:
                    productService.sortList();
                    break;
                case 6:
                    productService.searchProduct();
                case 7:
                    System.out.println("Cám ơn đã sử dụng dịch vụ");

            }
        }while (sellect!=7);
    }
}
