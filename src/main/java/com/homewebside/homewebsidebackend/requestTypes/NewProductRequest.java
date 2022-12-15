package com.homewebside.homewebsidebackend.requestTypes;

public class NewProductRequest {

    private String productName;
    private String productDescription;
    private double productPrice;
    private String productSize;
    private String productPictureName;

    private StandardRequest standardRequest;

    public NewProductRequest(String productName, String productDescription, double productPrice, String productSize, String productPictureName, StandardRequest standardRequest) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productSize = productSize;
        this.productPictureName = productPictureName;
        this.standardRequest = standardRequest;
    }

    public NewProductRequest() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public String getProductPictureName() {
        return productPictureName;
    }

    public void setProductPictureName(String productPictureName) {
        this.productPictureName = productPictureName;
    }

    public StandardRequest getStandardRequest() {
        return standardRequest;
    }

    public void setStandardRequest(StandardRequest standardRequest) {
        this.standardRequest = standardRequest;
    }
}
