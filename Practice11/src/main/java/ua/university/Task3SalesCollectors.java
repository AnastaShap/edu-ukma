package ua.university;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3SalesCollectors {

    public record Sale(String customerEmail, String product, int cents) {}

    public static void main(String[] args) {

        List<Sale> sales = List.of(
                new Sale("a@ex.com", "Tea", 120),
                new Sale("b@ex.com", "Cake", 200),
                new Sale("a@ex.com", "Tea", 120),
                new Sale("c@ex.com", "Coffee", 150),
                new Sale("b@ex.com", "Cake", 200)
        );

        System.out.println("Виручка за продуктами");
        Map<String, Integer> revenueByProduct = sales.stream()
                .collect(Collectors.toMap(
                        Sale::product,
                        Sale::cents,
                        Integer::sum
                ));
        revenueByProduct.forEach((k, v) -> System.out.println(k + ": $" + v));

        System.out.println("\nКількість транзакцій за клієнтом");
        Map<String, Long> transactionsByCustomer = sales.stream()
                .collect(Collectors.groupingBy(
                        Sale::customerEmail,
                        Collectors.counting()
                ));
        transactionsByCustomer.forEach((k, v) -> System.out.println(k + ": " + v + " transactions"));
    }
}