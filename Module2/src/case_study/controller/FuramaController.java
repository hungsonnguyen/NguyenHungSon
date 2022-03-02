package case_study.controller;

import case_study.servie.Imp.CustomerServiceImp;
import case_study.servie.Imp.EmployeeServiceImp;
import case_study.servie.Imp.FacilityServiceImp;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean check = true;
    public static int select = 0;

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        do {
            System.out.println("----------Menu---------" +
                    "\n 1: Employee Management" +
                    "\n 2: Customer Management" +
                    "\n 3: Facility Management" +
                    "\n 4: Booking Management" +
                    "\n 5: Promotion Management" +
                    "\n 6: Exit");
            System.out.print("Please enter your choose!:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagement();
                    break;
                case 5:
                    displayPromotionManagement();
                    break;
                case 6:
                    System.out.println("Thank you for your using!");
            }
        } while (select != 6);
    }

    public static void displayEmployeeManagement() {
        EmployeeServiceImp employeeServiceImp = new EmployeeServiceImp();
        do {
            System.out.println("----------Menu EmployeeManagement---------" +
                    "\n 1: Display list employees" +
                    "\n 2: Add new employee" +
                    "\n 3: Edit employee" +
                    "\n 4: Return main menu");
            System.out.print("Please enter your choose!:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    employeeServiceImp.displayListService();
                    break;
                case 2:
                    employeeServiceImp.addNew();
                    break;
                case 3:
                    employeeServiceImp.edit();
                    break;
                case 4:
                    System.out.println("Return main menu");
            }
        } while (select != 4);
    }

    public static void displayCustomerManagement() {
        CustomerServiceImp customerServiceImp = new CustomerServiceImp();
        do {
            System.out.println("----------Menu CustomerManagement---------" +
                    "\n 1: Display list costomers" +
                    "\n 2: Add new customer" +
                    "\n 3: Edit customer" +
                    "\n 4: Return main menu");
            System.out.print("Please enter your choose!:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    customerServiceImp.displayListService();
                    break;
                case 2:
                    customerServiceImp.addNew();
                    break;
                case 3:
                    customerServiceImp.edit();
                    break;
                case 4:
                    System.out.println("Return main menu");
            }
        } while (select != 4);
    }

    public static void displayFacilityManagement() {
        FacilityServiceImp facilityServiceImp = new FacilityServiceImp();
        do {
            System.out.println("----------Menu FacilityManagement---------" +
                    "\n 1: Display list facility" +
                    "\n 2: Add new facility" +
                    "\n 3: Display list facility maintenance" +
                    "\n 4: Return main menu");
            System.out.print("Please enter your choose!:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    facilityServiceImp.dispalyFacility();
                    break;
                case 2:
                    int select;
                    do {
                        System.out.println("Mời bạn lựa chọn tùy chọn thêm mới dịch vụ:" +
                                "\n 1. Addnew Villa" +
                                "\n 2. Addnew House" +
                                "\n 3. Addnew Room" +
                                "\n 4: Back to Menu");
                        select = Integer.parseInt(scanner.nextLine());
                        switch (select){
                            case 1:
                                facilityServiceImp.addnewVilla();
                                break;
                            case 2:
                                facilityServiceImp.addnewHouse();
                                break;
                            case 3:
                                facilityServiceImp.addnewRoom();
                                break;
                            case 4:
                                System.out.println("Back to menu");
                                continue;
                            default:
                                System.out.println("Mời bạn nhập chọn lại");
                        }
                    }
                    while (select!=4);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Return main menu");
            }
        } while (select != 4);
    }

    public static void displayBookingManagement() {
        do {
            System.out.println("----------Menu BookingManagement---------" +
                    "\n 1: Add new booking" +
                    "\n 2: Display list booking" +
                    "\n 3: Creat new booking" +
                    "\n 4: Display list contracts" +
                    "\n 5: Edit contracts" +
                    "\n 6: Return main menu");
            System.out.print("Please enter your choose!:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Return main menu");
            }
        } while (select != 6);
    }

    public static void displayPromotionManagement() {
        do {
            System.out.println("----------Menu PromotionManagement---------" +
                    "\n 1: Display list customers use service" +
                    "\n 2: Display list customers get voucher" +
                    "\n 3: Return main menu");
            System.out.print("Please enter your choose!:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Return main menu");
            }
        } while (select != 3);
    }
}
