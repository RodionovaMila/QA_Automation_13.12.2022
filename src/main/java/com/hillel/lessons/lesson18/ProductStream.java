package com.hillel.lessons.lesson18;

public class ProductStream {
    private String name;
    private double price;

    public ProductStream(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
