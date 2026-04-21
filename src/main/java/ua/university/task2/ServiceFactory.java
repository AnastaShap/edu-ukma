package ua.university.task2;

public class ServiceFactory {

    private static final String BASE_PACKAGE = "ua.university.task2.";

    public static PaymentService create(String className) {
        try {
            Class<?> clazz = Class.forName(BASE_PACKAGE + className);
            Object instance = clazz.getDeclaredConstructor().newInstance();
            return (PaymentService) instance;

        } catch (Exception e) {
            throw new RuntimeException("Failed to create service: " + className, e);
        }
    }
}
