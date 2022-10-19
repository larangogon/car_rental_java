package com.example.service;

import com.example.model.Product;
import java.util.*;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    //List Products
    public List<Product> list() {
        return repository.findAll();
    }

    //Save Product
    public Product save(Product product) {
        return repository.save(product);
    }

    //Get Product By Id
    public Product get(int id) {
        return repository.findById(id).get();
    }

    //Delete Product
    public void delete(int id) {
        repository.deleteById(id);
    }
}
