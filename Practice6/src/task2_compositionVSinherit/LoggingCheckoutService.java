package task2_compositionVSinherit;

import java.util.Objects;

public class LoggingCheckoutService {
    private final CheckoutService target;

    public LoggingCheckoutService(CheckoutService target) {

        this.target = Objects.requireNonNull(target, "target");

    }

    public String checkout(String orderId) {
        System.out.println("Start checkout");
        String result = target.checkout(orderId); // делегування
        System.out.println("End checkout");
        return result;
    }
}
