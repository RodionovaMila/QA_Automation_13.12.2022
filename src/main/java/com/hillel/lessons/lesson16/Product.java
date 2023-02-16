package com.hillel.lessons.lesson16;

public abstract class Product {
    private String productName;
    private int price;
    private String productCategory;
    private String manufactureDate;

    public Product(String productName, int price, String category, String manufacture) {
        this.productName = productName;
        this.price = price;
        this.productCategory = category;
        this.manufactureDate = manufacture;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public abstract void addToCart();
}