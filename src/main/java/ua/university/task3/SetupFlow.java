package ua.university.task3;

// перевірка роботи
public class SetupFlow {
    @Step(order = 2)
    private void initDatabase() {
        System.out.println("Database initialized");
    }

    @Step(order = 3)
    public void loadConfig(){
        System.out.println("Config file loaded");
    }
}
