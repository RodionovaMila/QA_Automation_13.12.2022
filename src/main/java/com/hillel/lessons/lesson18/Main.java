package com.hillel.lessons.lesson18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProductStream> productList = new ArrayList<>();
        productList.add(new ProductStream("Шоколад", 30.50));
        productList.add(new ProductStream("Молоко", 25.20));
        productList.add(new ProductStream("Хлеб", 20.30));
        productList.add(new ProductStream("Сыр", 3.40));
        productList.add(new ProductStream("Яблоки", 4.80));

        ProductMarketStream productMarket = new ProductMarketStream(productList);

        // Get all product names
        List<String> allProductNames = productMarket.getAllProductNames();
        System.out.println("All product names: " + allProductNames);

        // Get all product names sorted
        List<String> allProductNamesSorted = productMarket.getAllProductNamesSorted();
        System.out.println("All product names sorted: " + allProductNamesSorted);

        // Get all prices above 10
        List<Double> allPricesAbove10 = productMarket.getAllPricesAbove10();
        System.out.println("All prices above 10: " + allPricesAbove10);

        // Get all prices below 5
        List<Double> allPricesBelow5 = productMarket.getAllPricesBelow5();
        System.out.println("All prices below 5: " + allPricesBelow5);

        // Get all prices as a string
        String allPricesAsString = productMarket.getAllPricesAsString();
        System.out.println("All prices as a string: " + allPricesAsString);
    }
}