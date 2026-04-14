package ua.university.task1;

import java.util.ArrayList;
import java.util.List;

public class TaskRunner {
    //Реалізуйте TaskRunner.runAndWait(List<Runnable>)

    // передємо список ранабл

    public static void runAndWait(List<Runnable> tasks) {
        List<Thread> threads = new ArrayList<>();
        // створємо цикл
        for (Runnable task : tasks) {
            Thread t = new Thread(task);
            threads.add(t);
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
