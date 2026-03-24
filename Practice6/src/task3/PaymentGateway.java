package task3;

public interface PaymentGateway {
    public PaymentResult charge(Money total, PaymentDetails details);
}
