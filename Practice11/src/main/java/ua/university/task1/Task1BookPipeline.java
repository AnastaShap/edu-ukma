package ua.university.task1;
import java.util.List;

public class Task1BookPipeline {

     static void main(String[] args) {
         List<Book> books = List.of(
                 new Book("Clean Code", "Robert Martin", 2008, List.of("clean", "practice", "java")),
                 new Book("Effective Java", "Joshua Bloch", 2018, List.of("java", "best", "api")),
                 new Book("Modern Java", "Nicolai Parlog", 2020, List.of("java", "streams", "records")),
                 new Book("Java Concurrency", "Brian Goetz", 2006, List.of("concurrency", "java"))
         );

         System.out.println("--- Завдання 1: Stream pipeline ---");

         List<Book> recentBooksYear = books.stream()
                 .filter(book -> book.year() > 2015)
                 .toList();
         recentBooksYear.forEach(System.out::println);
         System.out.println("------------");

         List<String> recentBooksUpper = books.stream()
                 .map(book -> book.title().toUpperCase())
                 .sorted()
                 .toList();
         recentBooksUpper.forEach(System.out::println);

         System.out.println("\n------------");
         List<String> recentBooksSortedFirstThree = books.stream()
                 .map(book -> book.title().toUpperCase())
                 .sorted()
                 .limit(3)
                 .toList();
         recentBooksSortedFirstThree.forEach(System.out::println);



         // all in once
         System.out.println("------------");
         List<String> recentBooks = books.stream()
                 .filter(book -> book.year() > 2015)
                 .map(book -> book.title().toUpperCase())  // Отримуємо назви в uppercase
                 .sorted()                                 // Сортуємо за алфавітом
                 .limit(3)                                 // Залишаємо лише 3 перші
                 .toList();
        recentBooks.forEach(System.out::println);
    }
}
