package ua.university.task4;

import ua.university.Order;
import ua.university.task3.OrderProcessingException;
import ua.university.task3.PaymentGatewayException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {
    private static final Logger log = LoggerFactory.getLogger(OrderService.class);

    public void checkout(Order order) {
        // ПРАВИЛО: Не логуємо паролі/токени
        log.info("Starting checkout for order {} (user: {})", order.id(), order.userEmail());

        try {
            processPayment(order);
            log.info("Payment successful for order {}", order.id()); // INFO для успіху

        } catch (PaymentGatewayException e) {
            // ERROR для інцидентів інфраструктури (таймаут)
            log.error("Infrastructure failure for order {}", order.id(), e);
            throw new OrderProcessingException("Gateway timeout", e);
        }
    }

    private void processPayment(Order order) throws PaymentGatewayException {
        // Імітація логіки
    }
}
