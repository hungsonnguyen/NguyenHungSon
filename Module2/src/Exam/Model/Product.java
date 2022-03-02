package Exam.Model;

public abstract class Product {
    private int idProduct,price,amount;
    private String codeProduct, name, factory;

    public Product(int idProduct, int price, int amount, String codeProduct, String name, String factory) {
        this.idProduct = idProduct;
        this.price = price;
        this.amount = amount;
        this.codeProduct = codeProduct;
        this.name = name;
        this.factory = factory;
    }

    public Product() {
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
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

    @Override
    public String toString() {
        return "idProduct=" + idProduct +
                ", price=" + price +
                ", amount=" + amount +
                ", codeProduct='" + codeProduct + '\'' +
                ", name='" + name + '\'' +
                ", factory='" + factory ;
    }
}
