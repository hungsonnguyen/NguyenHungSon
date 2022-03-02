package Exam.Service.Imp;



import Exam.Controller.Controller;
import Exam.Model.HangNhapKhau;
import Exam.Service.IHangNhapKhauService;
import Exam.until.CheckRegex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangNhapKhauServiceImp extends HangNhapKhau implements IHangNhapKhauService {
    public HangNhapKhauServiceImp() {
    }

    private final String HANG_NHAP_KHAU_PROILE = "E:\\Code Gym\\Module 1\\Github\\Module2\\src\\Exam\\Data\\HangNhapKhau.csv";
    public Scanner scanner = new Scanner(System.in);

    private static final String REGEX_SO_DUONG = "^[1-9]\\d*$";


    public static List<HangNhapKhau> hangNhapKhaus = new ArrayList<>();

    @Override
    public void addnew() {
        //int idProduct,
        //                        int price,1
        //                        int amount,2
        //                        String codeProduct,3
        //                        String name,4
        //                        String factory,5
        //                        int giaNhapKhau,6
        //                        String tinhNhapKhau,7
        //                        double thueNhapKhau8
        System.out.print("Mời bạn nhập ID hàng nhập khẩu:");
        int idProduct = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập mã hàng nhập khẩu:");
        String codeProduct = scanner.nextLine();

        System.out.print("Mời bạn nhập tên sản phẩm:");
        String name = scanner.nextLine();

        System.out.print("Mời bạn nhập giá bán:");
        String price = CheckRegex.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Nhập sai định dạng, mời nhập lại");

        System.out.print("Mời bạn nhập số lượng sản phẩm:");
        String amount = CheckRegex.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Nhập sai định dạng, mời nhập lại");

        System.out.print("Mời bạn nhập nhà máy sản xuất");
        String factory = scanner.nextLine();

        System.out.print("Mời bạn nhập giá nhập khẩu");
        String giaNhapKhau = CheckRegex.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Nhập sai định dạng, mời nhập lại");

        System.out.print("Mời bạn nhập tỉnh thành nhập khẩu:");
        String tinhNhapKhau = scanner.nextLine();


        System.out.print("Mời bạn nhập thuế nhập khẩu:");
        String thueNhapKhau = CheckRegex.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Nhập sai định dạng, mời nhập lại");
        HangNhapKhau hangNhapKhau = new HangNhapKhau(
                idProduct,
                Integer.parseInt(price),
                Integer.parseInt(amount),
                codeProduct,
                name,
                factory,
                Integer.parseInt(giaNhapKhau),
                tinhNhapKhau,
                Double.parseDouble(thueNhapKhau));

        hangNhapKhaus.add(hangNhapKhau);

        write(HANG_NHAP_KHAU_PROILE);


    }

    @Override
    public void delete() {
        boolean check;
        String inputId = "";

        do {
            check = false;
            try {
                System.out.println("Vui lòng nhập id sản phẩm: ");
                inputId = scanner.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Lỗi format người dùng. Vui lòng nhập lại!");
                check = true;
                continue;
            }
        } while (check);

        for (int i = 0; i < hangNhapKhaus.size(); i++) {
            if (inputId.equals(hangNhapKhaus.get(i).getCodeProduct())) {
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
                        System.out.println(hangNhapKhaus.get(i));
                        hangNhapKhaus.remove(i);
                        break;
                    } else if (no.toLowerCase().equals("no")) {
                        Controller.displayMainMenu();
                    }
                } while (check);
            }
        }
        write(HANG_NHAP_KHAU_PROILE);
    }

    @Override
    public void display() {
        hangNhapKhaus = read(HANG_NHAP_KHAU_PROILE);
        for (HangNhapKhau hangNhapKhau : hangNhapKhaus){
            System.out.println(hangNhapKhau);
        }
    }

    @Override
    public void search() {
        boolean check;
        int inputId =0;
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
                        for (int i = 0; i < hangNhapKhaus.size(); i++) {
                            if (inputId == hangNhapKhaus.get(i).getIdProduct()) {
                                System.out.println(hangNhapKhaus.get(i));
                                check = false;
                                break;
                            }
                        }

                    } while (check);
                    break;

                case 2:
                    do {
                        check = true;
                        System.out.println("Vui lòng nhập vào tên điện thoại");
                        String inputTenSanPham = scanner.nextLine();
                        for (int i = 0; i < hangNhapKhaus.size(); i++) {
                            if (hangNhapKhaus.get(i).getName().toLowerCase().contains(inputTenSanPham.toLowerCase())) {
                                System.out.println(hangNhapKhaus.get(i));
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
            for (HangNhapKhau hangNhapKhau : hangNhapKhaus) {
                bufferedWriter.write(
                        //                 idProduct,
                        //                Integer.parseInt(price),
                        //                Integer.parseInt(amount),
                        //                codeProduct,
                        //                name,
                        //                factory,
                        //                Integer.parseInt(giaNhapKhau),
                        //                tinhNhapKhau,
                        //                Double.parseDouble(thueNhapKhau));

                        hangNhapKhau.getIdProduct() + "," +
                                hangNhapKhau.getCodeProduct() + "," +
                                hangNhapKhau.getName() + "," +
                                hangNhapKhau.getPrice() + "," +
                                hangNhapKhau.getAmount() + "," +
                                hangNhapKhau.getFactory() + "," +
                                hangNhapKhau.getGiaNhapKhau() + "," +
                                hangNhapKhau.getTinhNhapKhau() + "," +
                                hangNhapKhau.getThueNhapKhau());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<HangNhapKhau> read(String link) {
        List<HangNhapKhau> hangNhapKhauList = new ArrayList<>();
        HangNhapKhau hangNhapKhau = null;
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
               //                 idProduct,
                //                Integer.parseInt(price),
                //                Integer.parseInt(amount),
                //                codeProduct,
                //                name,
                //                factory,
                //                Integer.parseInt(giaNhapKhau),
                //                tinhNhapKhau,
                //                Double.parseDouble(thueNhapKhau));
                hangNhapKhau = new HangNhapKhau(
                        Integer.parseInt(temp[0]),
                        Integer.parseInt(temp[1]),
                        Integer.parseInt(temp[2]),
                        temp[3],
                        temp[4],
                        temp[5],
                        Integer.parseInt(temp[6]),
                        temp[7],
                        Double.parseDouble(temp[8]));
                hangNhapKhauList.add(hangNhapKhau);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hangNhapKhauList;
    }
}
