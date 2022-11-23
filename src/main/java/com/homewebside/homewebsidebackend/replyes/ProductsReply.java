package com.homewebside.homewebsidebackend.replyes;

import com.homewebside.homewebsidebackend.entity.Product;

public class ProductsReply {
    private Product[] products;
    private Reply reply;

    public ProductsReply(Product[] products, Reply reply) {
        this.products = products;
        this.reply = reply;
    }

    public ProductsReply() {
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }
}
