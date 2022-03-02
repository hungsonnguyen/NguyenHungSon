package ss12_Map.Bai_tap.Luyen_tap_su_dung_ArrayList_LinkedList_trong_JavaCollection_Framework.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id= '" +id + '\'' +
                "name='" + name + '\'' +
                ", price=" + price +                '}';
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        Product product = new Product("cá",1);
        Product product1 = new Product("thịt",1);
        System.out.println(product1.getId());

        Product product2 = new Product("bò",1);
        System.out.println(product2.getId());
        Product product3 = new Product("dê",1);
        System.out.println(product3.getId());
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        System.out.println(productList.get(1));

    }
}