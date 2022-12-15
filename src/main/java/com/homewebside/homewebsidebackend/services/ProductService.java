package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.Product;
import com.homewebside.homewebsidebackend.interfaces.ProductRepository;
import com.homewebside.homewebsidebackend.replyes.ProductsReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.requestTypes.NewProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthService authService;

    public ProductsReply getAllProducts() {
        List<Product> productList = productRepository.findAll();
        Product[] products = new Product[productList.size()];
        for (int i = 0; i < productList.size(); i++) {
            products[i] = productList.get(i);
        }
        return new ProductsReply(products, new Reply("Successful", true));
    }

    public Reply saveNewProduct(NewProductRequest newProductRequest) {
        if (tokenService.isTokenValid(newProductRequest.getStandardRequest().getToken())) {
            if (authService.checkIfAdmin(newProductRequest.getStandardRequest().getToken())) {
                Product newProduct = new Product(newProductRequest.getProductName(), newProductRequest.getProductDescription(), newProductRequest.getProductPrice(), newProductRequest.getProductSize(), newProductRequest.getProductPictureName());
                productRepository.save(newProduct);
                return new Reply("Success", true);
            } else return new Reply("No Permissions", false);

        } else return new Reply("Token invalid", false);
    }
}