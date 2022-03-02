package Exam.Service.Imp;

import Exam.Controller.Controller;
import Exam.Model.HangNhapKhau;
import Exam.Model.HangXuatKhau;
import Exam.Service.IHangXuatKhauService;
import Exam.until.CheckRegex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangXuatKhauServiceImp extends HangXuatKhau implements IHangXuatKhauService {
    public HangXuatKhauServiceImp(Scanner scanner) {
        this.scanner = scanner;
    }

    public HangXuatKhauServiceImp() {
    }

    private final String HANG_XUAT_KHAU_PROILE = "E:\\Code Gym\\Module 1\\Github\\Module2\\src\\Exam\\Data\\HangXuatKhau.csv";
    public Scanner scanner = new Scanner(System.in);

    private static final String REGEX_SO_DUONG = "^[1-9]\\d*$";


    public static List<HangXuatKhau> hangXuatKhaus = new ArrayList<>();

    @Override
    public void addnew() {
        //int idProduct,
        //                        int price,
        //                        int amount,
        //                        String codeProduct,
        //                        String name,
        //                        String factory,
        //                        int giaXuatKhau,
        //                        String quocGiaNhapSanPham
        System.out.print("Mời bạn nhập ID hàng xuất khẩu:");
        int idProduct = Integer.parseInt(scanner.nextLine());

        System.out.print("Mời bạn nhập mã hàng xuất khẩu:");
        String codeProduct = scanner.nextLine();

        System.out.print("Mời bạn nhập tên sản phẩm:");
        String name = scanner.nextLine();

        System.out.print("Mời bạn nhập giá bán:");
        String price = CheckRegex.checkStr(scanner.nextLine(),REGEX_SO_DUONG,"Nhập sai định dạng, mời nhập lại");

        System.out.print("Mời bạn nhập số lượng sản phẩm:");
        String amount = CheckRegex.checkStr(scanner.nextLine(),REGEX_SO_DUONG,"Nhập sai định dạng, mời nhập lại");

        System.out.print("Mời bạn nhập nhà máy sản xuất");
        String factory = scanner.nextLine();

        System.out.print("Mời bạn nhập giá xuất khẩu");
        String giaXuatKhau = CheckRegex.checkStr(scanner.nextLine(),REGEX_SO_DUONG,"Nhập sai định dạng, mời nhập lại");

        System.out.print("Mời bạn nhập quốc gia nhập sản phẩm:");
        String quocGiaNhapSanPham = scanner.nextLine();

        HangXuatKhau hangXuatKhau = new HangXuatKhau(idProduct,Integer.parseInt(price), Integer.parseInt(amount), codeProduct, name, factory,Integer.parseInt(giaXuatKhau),quocGiaNhapSanPham);

        hangXuatKhaus.add(hangXuatKhau);

        write(HANG_XUAT_KHAU_PROILE);
    }

    @Override
    public void delete() {
        boolean check;
        String inputId = "";

        do {
            check = false;
            try {
                System.out.println("Vui lòng nhập id điện thoại: ");
                inputId = scanner.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Lỗi format người dùng. Vui lòng nhập lại!");
                check = true;
                continue;
            }
        } while (check);

        for (int i = 0; i < hangXuatKhaus.size(); i++) {
            if (inputId.equals(hangXuatKhaus.get(i).getCodeProduct())) {
                do {
                    check = false;
                    System.out.println("Yes or No");
                    String yes = scanner.nextLine();
                    String no = scanner.nextLine();
                    if (!yes.toLowerCase().equals("yes") && !no.toLowerCase().equals("no")) {
                        System.out.println("Lỗi nhập sai. Vui lòng nhập lại!");
                        check = true;
                        continue;
                    }
                    if (yes.toLowerCase().equals("yes")) {
                        System.out.println(hangXuatKhaus.get(i));
                        hangXuatKhaus.remove(i);
                        break;
                    } else if (no.toLowerCase().equals("no")) {
                        Controller.displayMainMenu();
                    }
                } while (check);
            }
        }
        write(HANG_XUAT_KHAU_PROILE);

    }

    @Override
    public void display() {
        hangXuatKhaus = read(HANG_XUAT_KHAU_PROILE);
        for (int i = 0; i < hangXuatKhaus.size(); i++) {
            hangXuatKhaus.get(i).setIdProduct(i+1);
        }
        for(HangXuatKhau hangXuatKhau : hangXuatKhaus){
            System.out.println(hangXuatKhau);
        }

    }

    @Override
    public void search() {
        boolean check;
        int inputId = 1;
        int choice = 0;
        do {
            check = false;
            System.out.println("Bạn muốn chọn tìm kiếm theo cách nào");
            System.out.println( "1. Tìm sản phẩm theo ID sản phẩm");
            System.out.println( "2. Tìm sản phẩm theo tên sản phẩm");
            System.out.println( "3. Quay lại thanh menu");
            System.out.println("Vui lòng nhập sự lựa chọn của bạn !!!");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi format người dùng. Vui lòng nhập lại!");
                check = true;
                continue;
            }
            switch (choice) {
                case 1:
                    do {
                        check = true;
                        try {
                            System.out.println("Vui lòng nhập vào ID");
                            inputId = Integer.parseInt(scanner.nextLine());

                        } catch (NumberFormatException e) {
                            System.out.println("Lỗi format ID. Vui lòng nhập lại!");
                            check = true;
                            continue;
                        }
                        for (int i = 0; i < hangXuatKhaus.size(); i++) {
                            if (inputId == hangXuatKhaus.get(i).getIdProduct()) {
                                System.out.println(hangXuatKhaus.get(i));
                                check = false;
                                break;
                            }
                        }

                    } while (check);
                    break;

                case 2:
                    do {
                        check = true;
                        System.out.println("Vui lòng nhập vào tên sản phẩm");
                        String inputTenSanPham = scanner.nextLine();
                        for (int i = 0; i < hangXuatKhaus.size(); i++) {
                            if (hangXuatKhaus.get(i).getName().toLowerCase().contains(inputTenSanPham.toLowerCase())) {
                                System.out.println(hangXuatKhaus.get(i));
                                check = false;
                            }
                        }
                    } while (check);
                    break;

                case 3:
                    Controller.displayMainMenu();
                    break;

                default:
                    System.out.println("Vui lòng kiểm tra lại danh sách !!!");
                    check = true;
                    continue;
            }
        } while (check);

    }
    public static void write(String link) {
        File file = new File(link);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        try {
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (HangXuatKhau hangXuatKhau : hangXuatKhaus) {
                bufferedWriter.write(

                        hangXuatKhau.getIdProduct() + "," +
                                hangXuatKhau.getCodeProduct() + "," +
                                hangXuatKhau.getName() + "," +
                                hangXuatKhau.getPrice() + "," +
                                hangXuatKhau.getAmount() + "," +
                                hangXuatKhau.getFactory()+ "," +
                                hangXuatKhau.getGiaXuatKhau()+ "," +
                                hangXuatKhau.getQuocGiaNhapSanPham());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<HangXuatKhau> read(String link) {
        List<HangXuatKhau> hangXuatKhaus = new ArrayList<>();
        HangXuatKhau hangXuatKhau = null;
        String[] temp = null;
        String line = null;
        File file = new File(link);
        if (!file.exists()) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
        try {

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                //int idProduct,
                //                        int price,
                //                        int amount,
                //                        String codeProduct,
                //                        String name,
                //                        String factory,
                //                        int giaXuatKhau,
                //                        String quocGiaNhapSanPham
                hangXuatKhau = new HangXuatKhau(
                        Integer.parseInt(temp[0]),
                        Integer.parseInt(temp[1]) ,
                        Integer.parseInt( temp[2]),
                        temp[3],
                        temp[4],
                        temp[5],
                        Integer.parseInt( temp[6]),
                        temp[7]);
                hangXuatKhaus.add(hangXuatKhau);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hangXuatKhaus;
    }
}
