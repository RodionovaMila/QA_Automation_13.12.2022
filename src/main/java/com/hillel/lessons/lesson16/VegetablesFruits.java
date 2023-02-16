package com.hillel.lessons.lesson16;

public enum VegetablesFruits {

    VEGETABLES("Vegetables"),
    FRUITS("Fruits");

    private String name;

    VegetablesFruits(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(this.name);
    }
}

