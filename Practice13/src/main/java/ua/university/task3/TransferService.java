package ua.university.task3;

public class TransferService {
    public static void transfer(Account from, Account to, int amount){
        Account first;
        Account second;
        if (from.getId() < to.getId()) {
            first = from;
            second = to;
        } else {
            first = to;
            second = from;
        }

        synchronized (first)
        {
            synchronized (second)
            {
                if (from.getBalance() >= amount) {
                    from.withdraw(amount);
                    to.deposit(amount);
                }
            }
        }

    }
}
