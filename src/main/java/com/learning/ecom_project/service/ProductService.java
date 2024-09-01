package com.learning.ecom_project.service;

import com.learning.ecom_project.model.Product;
import com.learning.ecom_project.repository.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;


    public List<Product> getAllProducts() {
        return repo.findAll();

    }
}
