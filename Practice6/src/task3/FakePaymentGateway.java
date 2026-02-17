package task3;

import task4.Money;

public class FakePaymentGateway implements PaymentGateway {
    @Override
    public PaymentResult charge(Money total, PaymentDetails details) {
        return PaymentResult.success(); // завжди успіх
    }
}
