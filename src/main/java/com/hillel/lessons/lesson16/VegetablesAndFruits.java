package com.hillel.lessons.lesson16;

public class VegetablesAndFruits extends Product implements PrintCheck {

    private VegetablesFruits category;
    private double weight;
    private boolean isPackaged;

    public void setPriceForMe(double priceForMe) {
        this.priceForMe = priceForMe;
    }

    private double priceForMe;


    public VegetablesFruits getCategory() {
        return category;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isPackaged() {
        return isPackaged;
    }

    public void setPackaged(boolean packaged) {
        isPackaged = packaged;
    }

    @Override
    public void addToCart() {
        if (isPackaged) {
            System.out.println(getProductName() + "is added to cart");
        } else {
            System.out.println(getProductName() + "weight" + getWeight() + "is added to cart");
        }
    }

    public VegetablesAndFruits(String productName, int price, String productCategory,
                               String manufactureDate, VegetablesFruits category, int weight, boolean isPackaged) {
        super(productName, price, productCategory, manufactureDate);
        this.category = category;
        this.weight = weight;
        this.isPackaged = isPackaged;
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
    public void setPriceAfterWeightProduct(int me) throws WeightExceptions {
        if (!isPackaged) {
            setPrice((int) (priceForMe * me));
        } else {
            throw new WeightExceptions(getProductName()
                    + " is Packed", "Product exception");
        }
    }
}

