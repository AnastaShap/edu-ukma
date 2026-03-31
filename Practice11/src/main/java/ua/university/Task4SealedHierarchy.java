package ua.university;

import java.util.List;

public class Task4SealedHierarchy {
    // Sealed ієрархія
    public sealed interface Result permits Success, Failure {
    }

    public record Success(String data) implements Result {
    }

    public record Failure(String errorMessage) implements Result {
    }

     static void main(String[] args) {
        List<Result> results = List.of(
                new Success("User created"),
                new Failure("Connection timeout"),
                new Success("Data saved"),
                new Failure("Invalid input"),
                new Failure("Null pointer exception")
        );

        System.out.println("\nПідрахунок результатів");
        long successCount = results.stream()
                .filter(r -> r instanceof Success)
                .count();
        long failureCount = results.stream()
                .filter(r -> r instanceof Failure)
                .count();

        System.out.println("Успіхів: " + successCount);
        System.out.println("Помилок: " + failureCount);

        System.out.println("\n--- Повідомлення про помилки ---");
        // Збираємо повідомлення КАСТ через pattern matching
        List<String> errorMessages = results.stream()
                .filter(r -> r instanceof Failure)
                .map(r -> ((Failure) r).errorMessage())
                .toList();

        errorMessages.forEach(System.out::println);
    }
}