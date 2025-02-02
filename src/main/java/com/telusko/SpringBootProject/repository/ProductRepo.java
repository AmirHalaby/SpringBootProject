package com.telusko.SpringBootProject.repository;

import com.telusko.SpringBootProject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
