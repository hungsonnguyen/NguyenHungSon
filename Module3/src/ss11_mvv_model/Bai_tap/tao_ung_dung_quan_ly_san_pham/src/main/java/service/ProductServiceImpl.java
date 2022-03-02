package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "rice", 20000, "cheap", "viet nam"));
        products.put(2, new Product(2, "noodle", 20000, "cheap", "viet nam"));
        products.put(3, new Product(3, "vegetable", 20000, "cheap", "viet nam"));
        products.put(4, new Product(4, "coffee", 20000, "cheap", "viet nam"));
        products.put(5, new Product(5, "book", 20000, "expensive", "korean"));
        products.put(6, new Product(6, "fish", 20000, "good", "japan"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void reomove(int id) {
        products.remove(id);
    }
}
