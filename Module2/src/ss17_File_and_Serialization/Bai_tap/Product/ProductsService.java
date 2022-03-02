package ss17_File_and_Serialization.Bai_tap.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsService extends Product{
    public static final String SS17PRODUCT = "E:\\Code Gym\\Module 1\\Github\\Module2\\src\\ss17_File_and_Serialization\\Bai_tap\\Product\\ProductList.txt";
    public static Scanner scanner = new Scanner(System.in);
    public static List<ProductsService> productListFile = new ArrayList<>();
    public static List<ProductsService> productListSellection = new ArrayList<>();

    public ProductsService(int id, String name, String factory, int price) {
        super(id, name, factory, price);
    }

    public ProductsService() {
    }

    public static void addProduct() {
        System.out.print("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter factory: ");
        String factory = scanner.nextLine();
        System.out.print("Enter price: ");
        int price = Integer.parseInt(scanner.nextLine());
        ProductsService product = new ProductsService(id, name, factory, price);
        productListFile.add(product);
    }
  public static List<ProductsService>  getList(){
        return productListFile;
  }
    public static void wirteProduct(List<ProductsService> list, String targetFile) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(list);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<ProductsService> read(String targetFile) {
        try {
            FileInputStream fileInputStream = new FileInputStream(targetFile);
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            productListSellection = (List<ProductsService>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productListSellection;
    }

    public static ProductsService findProduct(List<ProductsService> listProduc) {
        ProductsService product = new ProductsService();
        System.out.print("Enter name of Product to search: ");
        String nameProduct = scanner.nextLine();
        for (int i = 0; i < listProduc.size(); i++) {
            if (listProduc.get(i).getName().contains(nameProduct)) {
                product = listProduc.get(i);
                break;
            }
        }
        return product;
    }

    public static void main(String[] args) {
        ProductsService productsService = new ProductsService();
        List<ProductsService> list1 = new ArrayList<>();
        int select;

        do {

            System.out.println("----Menu------" +
                    "\n 1: Add product" +
                    "\n 2: Write file" +
                    "\n 3: Read file" +
                    "\n 4: Find product" +
                    "\n 5: Exit");
            System.out.print("Enter select");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                  addProduct();
                    break;
                case 2:
                    list1 = getList();
                   wirteProduct(list1,SS17PRODUCT);
                   break;
                case 3:
                    System.out.println(read(SS17PRODUCT));;
                    break;
                case 4:
                    findProduct(list1);
                    break;
                case 5:
                    System.out.println("Thank for using!");
            }
        }while (select != 5);

    }

}
