package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProdcuctService {
    void delete(int id);
    Product searchById(int id);
    List<Product> searchByName(String name);
    List<Product> findAll();
    void update(int id, Product product);
    void save(Product product);

}
