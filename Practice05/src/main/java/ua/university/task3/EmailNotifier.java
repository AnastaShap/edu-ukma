package ua.university.task3;

public interface EmailNotifier {
    default void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
