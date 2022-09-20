package com.sakh.dao.controller;

import com.sakh.dao.repo.ProductRepositoryImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class Controller {

    ProductRepositoryImpl productRepository;

    Controller(ProductRepositoryImpl productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping("/fetch-product")
    List<String> getProductsByName(@RequestParam String name) {
        return productRepository.getProductName(name);
    }

}
