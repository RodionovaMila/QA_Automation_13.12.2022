package com.hillel.lessons.lesson12;

public class Main {
    public static void main(String[] args) {
        Burger normal = new Burger("bun",  "cheese", "lettuce", "meat","mayonnaise");
        Burger dietary = new Burger("bun",  "cheese", "lettuce","meat");
        Burger vegetarian = new Burger("bun", "cheese", "lettuce");
    }

}
