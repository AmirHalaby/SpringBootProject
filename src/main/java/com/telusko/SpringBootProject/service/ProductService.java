package com.telusko.SpringBootProject.service;

import com.telusko.SpringBootProject.model.Product;
import com.telusko.SpringBootProject.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> GetAllProducts() {
        return productRepo.findAll();
    }
}
