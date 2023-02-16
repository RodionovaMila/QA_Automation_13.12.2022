package com.hillel.lessons.lesson16;

public class Meat extends Product implements PrintCheck {

    private String category;
    private double weight;
    private double priceForMe;

    public Meat (String productName, int price, String category, String manufactureDate, String category1,
                 double weight, double priceForMe) {
        super(productName, price, category, manufactureDate);
        this.category = category1;
        this.weight = weight;
        this.priceForMe = priceForMe;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPriceForMe() {
        return priceForMe;
    }

    public void setPriceForMe(double priceForMe) {
        this.priceForMe = priceForMe;
    }

    @Override
    public void addToCart() {
        System.out.println(getProductName() + "weight" + getWeight() + "is added to cart");
    }

    public Meat (String productName, int price, String category, String manufactureDate) {
        super(productName, price, category, manufactureDate);
    }

    public void printName() {
        System.out.println(getProductName());
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

    @Override
    public void setPriceAfterWeightProduct(int me) {
        setPrice((int) (priceForMe * me));
    }
}
