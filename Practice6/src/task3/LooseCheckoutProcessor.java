package task3;
import java.util.Objects;

    /*
    * нижчий coupling
    вища тестованість
    гнучкість
    відповідність DIP
    * */

public class LooseCheckoutProcessor {
    private final PaymentGateway gateway;
    private final NotificationService notifier;

    // Передача через конструктор (constructor injection)
    // Залежність від абстракцій, а не реалізацій.
    public LooseCheckoutProcessor(PaymentGateway gateway, NotificationService notifier) {
        this.gateway = Objects.requireNonNull(gateway, "gateway");
        this.notifier = Objects.requireNonNull(notifier, "notifier");
    }

    public PaymentResult checkout(Order order, PaymentDetails details, Email email) {
        Money total = order.total();
        PaymentResult result = gateway.charge(total, details);
        if (result.isSuccess()) {
            notifier.sendReceipt(email, total);
        }
        return result;
    }
}
