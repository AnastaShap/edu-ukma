import Task2_InitTest.InitOrderTask;
import Task3_OptionalTest.OptionalTask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Завдання 1: Памʼять JVM
        //MemoryTask  task1 = new MemoryTask();
        //task1.run();

        // Завдання 2: Порядок ініціалізації
        //InitOrderTask task2 = new InitOrderTask();
        //task2.run();

        // Завдання 3: Optional у API (20 хв)
        OptionalTask task3 = new OptionalTask();
        task3.run();
    }
}