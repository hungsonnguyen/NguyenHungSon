package model;

public class Product {
    private int productId;
    private String productName;
    private double product_price;
    private  int productQuanity;
    private String productDescription;

    private int categoryId;
    private String categoryName;

    private int colorId;
    private String colorName;

    public Product(int productId, String productName, double product_price, int productQuanity, String productDescription, int categoryId, String categoryName, int colorId, String colorName) {
        this.productId = productId;
        this.productName = productName;
        this.product_price = product_price;
        this.productQuanity = productQuanity;
        this.productDescription = productDescription;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.colorId = colorId;
        this.colorName = colorName;
    }

    public Product(String productName, double product_price, int productQuanity, String productDescription, int categoryId, int colorId) {
        this.productName = productName;
        this.product_price = product_price;
        this.productQuanity = productQuanity;
        this.productDescription = productDescription;
        this.categoryId = categoryId;
        this.colorId = colorId;
    }

    public Product(int productId, String productName, double product_price, int productQuanity, String productDescription, int categoryId, int colorId) {
        this.productId = productId;
        this.productName = productName;
        this.product_price = product_price;
        this.productQuanity = productQuanity;
        this.productDescription = productDescription;
        this.categoryId = categoryId;
        this.colorId = colorId;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public int getProductQuanity() {
        return productQuanity;
    }

    public void setProductQuanity(int productQuanity) {
        this.productQuanity = productQuanity;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
