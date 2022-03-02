package model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String desciption;
    private String factory;

    public Product(int id, String name, double price, String desciption, String factory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.desciption = desciption;
        this.factory = factory;
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

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}
