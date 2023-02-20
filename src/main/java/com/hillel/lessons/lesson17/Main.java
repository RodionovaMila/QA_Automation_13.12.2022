package com.hillel.lessons.lesson17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем продукты
        Product p1 = new Product("Шоколад", 30.50);
        Product p2 = new Product("Молоко", 25.20);
        Product p3 = new Product("Хлеб", 20.30);
        Product p4 = new Product("Сыр", 3.40);
        Product p5 = new Product("Яблоки", 4.80);

        // Создаем список продуктов
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        // Создаем ProductMarket
        ProductMarket market = new ProductMarket(products);

        // Выводим результаты
        System.out.println("All names: " + market.getAllNames());
        System.out.println("All names sorted: " + market.getAllNamesSorted());
        System.out.println("Prices greater than 10: " + market.getAllPricesOver10());
        System.out.println("Prices less than 5: " + market.getAllPricesUnder5());
        System.out.println("Prices as string: " + market.getAllPricesAsString());
    }
}
