package ua.university.task3;

public class Account {
    private final long id;
    private int balance;

    public Account(long id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}
