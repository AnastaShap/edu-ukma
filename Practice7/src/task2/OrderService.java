package task2;

import task1.Order;

public class OrderService {

    public void checkout(Order order) {
        try {
            performPayment();
        } catch (PaymentGatewayException e) {
            // Ручне логування контексту
            System.err.println("ERROR: Payment failed for orderId=" + order.id()
                    + ", userEmail=" + order.userEmail());

            // Загортаємо в unchecked
            throw new OrderProcessingException(
                    "Could not process order " + order.id() + " for user " + order.userEmail(), e
            );
        }
    }

    private void performPayment() throws PaymentGatewayException {
        throw new PaymentGatewayException("Gateway timeout");
    }
}