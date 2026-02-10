package ua.university;

import ua.university.task1.CardPayment;
import ua.university.task1.PayPalPayment;
import ua.university.task1.PaymentMethod;
import ua.university.task1.PaymentProcessor;
import ua.university.task2.DailyReport;
import ua.university.task2.ReportGenerator;
import ua.university.task3.MultiNotifier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Task 1: Interfaces test");
        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod paymentMethod1 = new CardPayment();
        PaymentMethod paymentMethod2 = new PayPalPayment();

        processor.process(paymentMethod1, 100);
        paymentMethod2.payWithFee(200, 20);

        System.out.println("\nTask 2: Template Method");
        ReportGenerator report = new DailyReport();
        report.generate();

        System.out.println("\nTask 3: Default‑methods");
        MultiNotifier notifier = new MultiNotifier();
        notifier.send("Hey there!");

    }
}
