package ua.university.task2;

public class CardPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paid: " + amount + " by card.");
    }
}
