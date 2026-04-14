package ua.university;

import ua.university.task1.Order;
import ua.university.task1.TaskRunner;
import ua.university.task2.SynchronizedInventory;
import ua.university.task3.Account;
import ua.university.task3.TransferService;
import ua.university.task4.TicketConsumer;
import ua.university.task4.TicketProducer;
import ua.university.task4.TicketQueue;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


public class Main {
    static void main() throws InterruptedException {

        System.out.println("---TASK 1---");
        // два потоки працюють над одним списком, один рахує суму, інший шукає максимум
        // Потім ми їх чемно “дочікуємось” через join().
        List<Order> orders = List.of(
                new Order(1, 1500),
                new Order(2, 2300),
                new Order(3, 800),
                new Order(4, 3200)
        );

        final int[] sum = {0};
        final int[] max = {Integer.MIN_VALUE};


        //1
        Runnable sumTask = () -> {
            int localSum = 0;
            for (Order o : orders) {
                localSum += o.totalCents();
            }
            sum[0] = localSum;
        };

        //2
        Runnable maxTask = () -> {
            int localMax = Integer.MIN_VALUE;
            for (Order o : orders) {
                localMax = Math.max(localMax, o.totalCents());
            }
            max[0] = localMax;
        };

        TaskRunner.runAndWait(List.of(sumTask, maxTask));

        System.out.println("Total sum: " + sum[0]);
        System.out.println("Max order: " + max[0]);

        // --------------------

        // Task 2 тестування ралізовано в класі Task2

        // ---------------------
        //реалізувати безпечний порядок захоплення локів.
        System.out.println("\n---TASK 3---");
        Account account1= new Account(1,1000);
        Account account2= new Account(2,500);
        System.out.println("First account balance: " + account1.getBalance());
        System.out.println("Second account balance: " + account2.getBalance());

        Thread t1 = new Thread(() -> TransferService.transfer(account1, account2, 100));
        Thread t2 = new Thread(() -> TransferService.transfer(account2, account1, 200));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("\nafter transfer : ");
        System.out.println("First account balance: " + account1.getBalance());
        System.out.println("Second account balance: " + account2.getBalance());


        /// Task 4
        System.out.println("\n---TASK 4---");

        TicketQueue queue = new TicketQueue();
        ConcurrentHashMap<String, Integer> stats = new ConcurrentHashMap<>();

        int consumers = 2;
        Thread consumerThread1 = new Thread(new TicketConsumer(queue, stats));
        Thread consumerThread2 = new Thread(new TicketConsumer(queue, stats));

        Thread producerThread = new Thread(new TicketProducer(queue, consumers));

        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();

        producerThread.join();
        consumerThread1.join();
        producerThread.join();
        System.out.println("Stats: " + stats);


    }
}
