package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping ("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        System.out.println(product);
        service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        System.out.println(product);
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }


}
