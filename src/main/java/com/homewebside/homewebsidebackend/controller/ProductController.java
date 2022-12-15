package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.replyes.ProductsReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.requestTypes.NewProductRequest;
import com.homewebside.homewebsidebackend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/newProduct")
    private Reply saveNewProduct(@RequestBody NewProductRequest newProductRequest) {
        return productService.saveNewProduct(newProductRequest);
    }

}
