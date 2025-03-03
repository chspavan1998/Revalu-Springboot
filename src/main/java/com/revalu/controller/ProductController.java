package com.revalu.controller;

import com.revalu.model.Product;
import com.revalu.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // GET method for returning show all documents with-in the collection epd_data
    @GetMapping("/show_all")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // GET method to return documents with cat_name matching categories.name in collection
    @GetMapping("/categories/{cat_name}")
    public List<Product> getProductsByCategory(@PathVariable("cat_name") String catName) {
        return productRepository.findByCategoriesName(catName);
    }

    // GET method to search for documents with tag name
    @GetMapping("/tags/{tagname}")
    public List<Product> getProductsByTag(@PathVariable("tagname") String tagName) {
        return productRepository.findByTagsContaining(tagName);
    }
}
