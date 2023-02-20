package com.hillel.lessons.lesson17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMarket{
    private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<String> getAllNames() {
        List<String> names = new ArrayList<>();
        for(Product product : products) {
            names.add(product.getName());
        }
        return names;
    }

    public List<String> getAllNamesSorted() {
        List<String> names = getAllNames();
        Collections.sort(names);
        return names;
    }

    public List<Double> getAllPricesOver10() {
        List<Double> prices = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > 10) {
                prices.add(product.getPrice());
            }
        }
        return prices;
    }

    public List<Double> getAllPricesUnder5() {
        List<Double> prices = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() < 5) {
                prices.add(product.getPrice());
            }
        }
        return prices;
    }

    public String getAllPricesAsString() {
        List<String> prices = new ArrayList<>();
        for (Product product : products) {
            prices.add(Double.toString(product.getPrice()));
        }
        return String.join(", ", prices);
    }
}

