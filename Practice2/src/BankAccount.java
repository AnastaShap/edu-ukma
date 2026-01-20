public class BankAccount {

    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance){
        if (initialBalance < 0) {
            throw new IllegalArgumentException("initial balance cannot be negative");
            //return;
        }

        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative");
        }
         balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdraw amount cannot be negative");
        }
        else if(amount > balance) {
            System.out.println("Not enough money on the account");
        }
        balance -= amount;
    }
}
