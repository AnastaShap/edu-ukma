package task3;

/*Жорстка залежність від конкретних класів.
Неможливо підмінити реалізацію.
Тяжко нормально тестувати без реального Stripe або email-сервісу.*/

public class TightCheckoutProcessor {
    private final StripePaymentGateway gateway = new StripePaymentGateway();
    private final EmailNotificationService notifier = new EmailNotificationService();

    public PaymentResult checkout(Order order, PaymentDetails details, Email email) {
        Money total = order.total();
        PaymentResult result = gateway.charge(total, details);
        if (result.isSuccess()) {
            notifier.sendReceipt(email, total);
        }
        return result;
    }
}
