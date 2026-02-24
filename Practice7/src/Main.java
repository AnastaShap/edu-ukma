import task1.Order;
import task2.OrderProcessingException;
import task2.OrderService;
import task3.ReceiptService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
/*
    System.out.println("---Task1---");
    Order validOrder = new Order(1, "user@example.com", 1500);
    System.out.println("valid order created " + validOrder);

    try{
        Order invalidOrder = new Order(-4555, "nonsense", -299);
        System.out.println(invalidOrder); // не виконається
    }catch (IllegalArgumentException e) {
        System.out.println("Failed to create order: " + e.getMessage());
    }*/
    System.out.println("\n---Task2---");
/*
    OrderService orderService = new OrderService();
    Order newOrder = new Order(13, "user2@example.com", 4000);
    try {
        orderService.checkout(newOrder);
    } catch (OrderProcessingException e) {
        System.err.println("Спіймано: " + e.getMessage());
        e.printStackTrace(); // покаже ланцюжок "Caused by"
    }*/


    System.out.println("\n---Task3---");

    ReceiptService receiptService = new ReceiptService();
    receiptService.generate("task3_receipt.txt");

}
