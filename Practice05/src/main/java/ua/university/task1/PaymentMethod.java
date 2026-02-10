package ua.university.task1;

public interface PaymentMethod {
    String name();

    void pay(int amount);

    default void payWithFee(int amount, int fee) {
        int total = amount + fee;
        pay(total);
    }
}
