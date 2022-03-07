package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public class ProductServiceImpl implements ProdcuctService {
    private final static Map<Integer, Product> productList;

    static {
        productList = new HashMap<>();
        productList.put(1, new Product(1, "Iphone", 2000));
        productList.put(2, new Product(2, "Samsung", 2000));
        productList.put(3, new Product(3, "Lenovo", 2000));
        productList.put(4, new Product(4, "Sony", 2000));
        productList.put(5, new Product(5, "LGBT", 2000));
    }


    public ProductServiceImpl() {
    }

    @Override
    public void delete(int id) {
        productList.remove(id);

    }

    @Override
    public Product searchById(int id) {
        return productList.get(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> productMap = new ArrayList<>();
        for (Map.Entry<Integer, Product> product : productList.entrySet()) {
            if (product.getValue().getName().contains(name)) {
                productMap.add(product.getValue());
            }
        }
        return productMap;
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void update(int id, Product product) {
        productList.put(id, product);
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(), product);

    }
}
