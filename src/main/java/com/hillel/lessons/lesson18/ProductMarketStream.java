package com.hillel.lessons.lesson18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMarketStream {
    private List<ProductStream> products;

    public ProductMarketStream(List<ProductStream> products) {
        this.products = products;
    }

    public List<String> getAllProductNames() {
        return products.stream()
                .map(ProductStream::getName)
                .collect(Collectors.toList());
    }

    public List<String> getAllProductNamesSorted() {
        return products.stream()
                .map(ProductStream::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Double> getAllPricesAbove10() {
        return products.stream()
                .map(ProductStream::getPrice)
                .filter(price -> price > 10.0)
                .collect(Collectors.toList());
    }

    public List<Double> getAllPricesBelow5() {
        return products.stream()
                .map(ProductStream::getPrice)
                .filter(price -> price < 5.0)
                .collect(Collectors.toList());
    }

    public String getAllPricesAsString() {
        return products.stream()
                .map(ProductStream::getPrice)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}