package ua.university.task1;

public record Payment(String id, String email, PaymentStatus status, double amountCents ) { }
