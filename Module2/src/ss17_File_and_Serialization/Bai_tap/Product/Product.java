package ss17_File_and_Serialization.Bai_tap.Product;

import java.io.Serializable;

public class Product implements Serializable {
    private String  name, factory;
    private int price,id;

    public Product(int id, String name, String factory, int price) {
        this.id = id;
        this.name = name;
        this.factory = factory;
        this.price = price;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", factory='" + factory + '\'' +
                ", price=" + price +
                '}';
    }
}
