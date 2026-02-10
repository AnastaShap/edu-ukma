package ua.university.task1;

public class PaymentProcessor {

    public void process(PaymentMethod method, int amount)
    {
        System.out.println("Processing payment via: " + method.name());
        method.pay(amount);
    }
}
