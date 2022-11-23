package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.replyes.ProductsReply;
import com.homewebside.homewebsidebackend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAll")
    private ProductsReply getAllProducts() {
        return productService.getAllProducts();
    }

}
