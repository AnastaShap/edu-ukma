package ua.university;

public record Order(long id, String userEmail, long totalCents) {
    public Order {
        if (id <= 0) {
            throw new IllegalArgumentException("id must be > 0");
        }

        if (userEmail == null || !userEmail.contains("@")) {
            throw new IllegalArgumentException("email must contain '@'");
        }

        if (totalCents < 0) {
            throw new IllegalArgumentException("totalCents must be positive");
        }
    }
}
