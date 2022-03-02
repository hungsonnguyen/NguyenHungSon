package service;

import model.Product;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public Product selectProductById(int id) {
        return productRepository.selectProductById(id);
    }

    @Override
    public void insert(Product product) {
        productRepository.insert(product);

    }

    @Override
    public List<Product> selectCustomer(String name) {
        return productRepository.selectCustomer(name);
    }

    @Override
    public List<Product> selectAllProduct() {
        return productRepository.selectAllProduct();
    }

    @Override
    public void delete(int id) {
        productRepository.delete(id);
    }

    @Override
    public void edit(Product product) {
        productRepository.edit(product);
    }
}
