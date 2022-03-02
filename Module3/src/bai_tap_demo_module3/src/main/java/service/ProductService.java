package service;

import model.Product;

import java.util.List;

public interface ProductService {
    public Product selectProductById(int id);
    public void insert(Product product);
    public List<Product> selectCustomer(String name);
    public List<Product> selectAllProduct();
    public void delete(int id);
    public void edit(Product product);
}
