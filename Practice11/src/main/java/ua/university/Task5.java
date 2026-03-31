package ua.university;

import java.util.*;
import java.util.stream.*;

public class Task5 {
    record Book(String title, int year) {}
    record Product(String name, int revenue) {}

    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Java Basics", 2010),
                new Book("Advanced Streams", 2018),
                new Book("Spring Boot Guide", 2021),
                new Book("Legacy Systems", 2005)
        );

        // by year > 2015
        Map<Boolean, List<Book>> recentVsOld = books.stream()
                .collect(Collectors.partitioningBy(b -> b.year() > 2015));

        System.out.println("Recent vs Old books:");
        System.out.println(recentVsOld);

      // Map<String, Integer> з виручкою за продуктами у вiдсортованому виглядi, використовуючи TreeMap як мапу-приймач.
        List<Product> products = List.of(
                new Product("Laptop", 5000),
                new Product("Phone", 7000),
                new Product("Tablet", 3000)
        );

        Map<String, Integer> revenueByProduct = products.stream()
                .collect(Collectors.toMap(
                        Product::name,
                        Product::revenue,
                        (v1, v2) -> v1 + v2,   // merge function (на випадок дубліката)
                        TreeMap::new           // конкретний тип мапи
                ));

        System.out.println("Revenue by product (sorted):");
        System.out.println(revenueByProduct);
    }
}
