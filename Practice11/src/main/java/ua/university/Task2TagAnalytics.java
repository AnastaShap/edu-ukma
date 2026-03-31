package ua.university;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task2TagAnalytics {

    public record Book(String title, int year, List<String> tags) {}

     static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Book A", 2020, List.of("java", "oop", "solid")),
                new Book("Book B", 2021, List.of("architecture", "java", "patterns")),
                new Book("Book C", 2019, List.of("oop", "clean code", "java")),
                new Book("Book D", 2022, List.of("solid", "architecture", "microservices"))
        );

         System.out.println("--- Усі вибрані теги ---");
         List<String> allTags = books.stream().flatMap(book -> book.tags().stream()) // Сплощення списків тегів
                 .toList();
         System.out.println(allTags);

         System.out.println("\nУнікальні теги");
         List<String> alphabetTags = books.stream()
                 .flatMap(book -> book.tags().stream()).distinct()                             // Сортування за алфавітом
                 .toList();
         System.out.println(alphabetTags);

        System.out.println("\nУнікальні теги за алфавітом");
        List<String> uniqueTags = books.stream()
                .flatMap(book -> book.tags().stream()).distinct().sorted()                             // Сортування за алфавітом
                .toList();
        System.out.println(uniqueTags);

        System.out.println("\n---Аналітика тегів (Топ-N)---");
        //  Map<String, Long> tagFrequency
        Map<String, Long> tagFrequency = books.stream()
                .flatMap(book -> book.tags().stream())
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

         System.out.println("\nТоп‑N тегів за частотою");
        int topN = 3;
        tagFrequency.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(topN)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}