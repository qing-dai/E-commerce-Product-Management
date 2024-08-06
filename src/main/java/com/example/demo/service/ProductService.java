package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    // pass new arrayList() to make it mutable
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 5000),
            new Product(102, "came", 5000)));

    public List<Product> getProducts() {
        return products;

    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(100, "No item", 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
