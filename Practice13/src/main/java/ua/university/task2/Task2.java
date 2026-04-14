package ua.university.task2;

// Race condition
public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("---TASK 2---");
        testInventory(new UnsafeInventory(100), "unsafe!");
        testInventory(new SynchronizedInventory(100), "safe!");

        stressTest();
    }

     static void testInventory(Inventory inv, String label) throws InterruptedException {
        Thread t1 = new Thread(() -> inv.reserve(60));
        Thread t2 = new Thread(() -> inv.reserve(60));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(label + " remaining: " + inv.available());
    }

    private static void stressTest() throws InterruptedException {
        int violations = 0;

        for (int i = 0; i < 300; i++) {
            Inventory inv = new UnsafeInventory(100);

            Thread t1 = new Thread(() -> inv.reserve(60));
            Thread t2 = new Thread(() -> inv.reserve(60));

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            if (inv.available() >= 0) {
                violations++;
            }
        }

        System.out.println("Violations (unsafe): " + violations);
    }
}
