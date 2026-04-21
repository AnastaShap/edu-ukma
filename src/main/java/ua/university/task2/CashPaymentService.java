package ua.university.task2;

public class CashPaymentService implements PaymentService{
    @Override
    public void pay(double amount) {
        System.out.println("Payed: " + amount + " by cash.");
    }
}
