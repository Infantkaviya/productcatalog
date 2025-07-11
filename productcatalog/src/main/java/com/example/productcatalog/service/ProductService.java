package com.example.productcatalog.service;

import com.example.productcatalog.entity.Product;
import com.example.productcatalog.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public void save(Product product) {
        repo.save(product);
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public List<Product> getByCategory(String category) {
        return repo.findByCategory(category);
    }
}
