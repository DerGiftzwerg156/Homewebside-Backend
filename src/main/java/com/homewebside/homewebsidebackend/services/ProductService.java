package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.Product;
import com.homewebside.homewebsidebackend.interfaces.ProductRepository;
import com.homewebside.homewebsidebackend.replyes.ProductsReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductsReply getAllProducts() {
        List<Product> productList = productRepository.findAll();
        Product[] products = new Product[productList.size()];
        for (int i = 0; i < productList.size(); i++) {
            products[i] = productList.get(i);
        }
        return new ProductsReply(products, new Reply("Successful", true));
    }
}
