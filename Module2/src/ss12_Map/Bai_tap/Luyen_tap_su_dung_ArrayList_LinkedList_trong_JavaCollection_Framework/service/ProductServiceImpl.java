package ss12_Map.Bai_tap.Luyen_tap_su_dung_ArrayList_LinkedList_trong_JavaCollection_Framework.service;

import ss12_Map.Bai_tap.Luyen_tap_su_dung_ArrayList_LinkedList_trong_JavaCollection_Framework.model.Product;

import java.util.*;

public class ProductServiceImpl extends Product implements ProductService,Comparable<ProductServiceImpl> {
    public ProductServiceImpl() {
    }

    public ProductServiceImpl(String name, double price) {
        super(name, price);


    }

      List<ProductServiceImpl> myArrayListProduct = new ArrayList<ProductServiceImpl>();



    public Scanner scanner = new Scanner(System.in);


    @Override
    public void add() {
        System.out.print("Mời bạn nhập tên sản phẩm cần thêm: \n");
        String newNameProduct = scanner.nextLine();
        System.out.print("Mời bạn nhập tên sản phẩm cần thêm: \n");
        Double newPriceProduct = Double.valueOf(scanner.nextLine());
        ProductServiceImpl product = new ProductServiceImpl(newNameProduct, newPriceProduct);
        myArrayListProduct.add(product);
    }

    @Override
    public void edit() {
        System.out.print("Mời bạn nhập id sản phẩm cần chỉnh sửa: \n");
        int idToEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < myArrayListProduct.size(); i++) {
            if (idToEdit == myArrayListProduct.get(i).getId()) {
                System.out.println("Mời bạn nhập tên cần sửa: ");
                String newName = scanner.nextLine();
                System.out.println("Mời bạn nhập giá cần sửa: ");
                Double newPrice = Double.valueOf(scanner.nextLine());
                myArrayListProduct.get(i).setName(newName);
                myArrayListProduct.get(i).setPrice(newPrice);
            }
        }

    }

    @Override
    public void remove() {
        System.out.print("Mời bạn nhập id sản phẩm cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < myArrayListProduct.size(); i++) {
            if (id == myArrayListProduct.get(i).getId()){
                myArrayListProduct.remove(i);
                break;
            }
            else {
                System.out.println("Sản phẩm bạn vừa nhập hiện không có trong danh sách");
            }
        }
        for (int i = 0; i < myArrayListProduct.size(); i++) {
            myArrayListProduct.get(i).setId(i + 1);
        }


    }

    @Override
    public void displayProduct() {
        for (int i = 0; i < myArrayListProduct.size(); i++) {
            myArrayListProduct.get(i).setId(i+1);
            System.out.println(myArrayListProduct.get(i));
        }

    }

    @Override
    public int compareTo(ProductServiceImpl o) {
        if (this.getPrice()>o.getPrice()){
            return 1;
        }else if (this.getPrice()<o.getPrice()){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public void sortList() {
        Collections.sort(myArrayListProduct);

    }

    @Override
    public void searchProduct() {
        System.out.print("Mời bạn bạn nhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        for (int i = 0; i < myArrayListProduct.size(); i++) {
            if (myArrayListProduct.get(i).getName().contains(name)){
                System.out.println(myArrayListProduct.get(i));
                break;
            }
        }

    }

//    public static void main(String[] args) {
//        ProductServiceImpl productService = new ProductServiceImpl();
//        productService.displayProduct();
//        System.out.println(myArrayListProduct.get(2).getId());
//        myArrayListProduct.remove(2);
//        System.out.println("----");
//        productService.displayProduct();
//
//    }

}
