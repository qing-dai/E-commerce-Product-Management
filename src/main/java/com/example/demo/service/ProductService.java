package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // pass new arrayList() to make it mutable
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 5000),
//            new Product(102, "came", 5000)));

    public List<Product> getProducts() {
        return repo.findAll();

    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());}

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
       repo.save(product);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
