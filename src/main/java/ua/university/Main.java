package ua.university;

import ua.university.task1.Book;
import ua.university.task1.ClassInfoPrinter;
import ua.university.task2.CashPaymentService;
import ua.university.task2.PaymentService;
import ua.university.task2.ServiceFactory;
import ua.university.task3.SetupFlow;
import ua.university.task3.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // task 1
        ClassInfoPrinter.print(Book.class);

        // task 2
        System.out.println("\n -- TASK 2 --");
        PaymentService paymentService = ServiceFactory.create("CardPaymentService");
        PaymentService cashService = ServiceFactory.create("CashPaymentService");

        paymentService.pay(100);
        cashService.pay(300);

        // task 3
        System.out.println("\n -- TASK 3 --");
        StepRunner.run(new SetupFlow());
    }
}
