package com.hillel.lessons.lesson16;


class Cheese extends Product {

    private String name;
    private int weight;
    private String type;


    public Cheese (String productName, int price, String productCategory, String manufactureDate, String name,
                   int weight, String type) {
        super(productName, price, productCategory, manufactureDate);
        this.name = name;
        this.weight = weight;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return weight;
    }

    public void setSize(int size) {
        this.weight = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    @Override
    public void addToCart() {
        System.out.println(getProductName() + "is added to cart");
    }

    public Cheese (String productName, int price, String category, String manufactureDate) {
        super(productName, price, category, manufactureDate);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}