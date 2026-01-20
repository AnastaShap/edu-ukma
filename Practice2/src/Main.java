import Task2.ArrayStat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // TASK 1 - Клас *BankAccount*
        /*
        BankAccount acc = new BankAccount("UA-404", 3000);

        System.out.println("Balance: " + acc.getBalance());
        acc.deposit(500);
        System.out.println("Balance after deposit: " + acc.getBalance());

        acc.withdraw(200);
        System.out.println("Balance after withdraw: " + acc.getBalance());

        System.out.println("--------------");
        acc.deposit(-30);
        acc.withdraw(5000);
        acc.withdraw(-10);*/

        // TASK 2 - Утиліта ArrayStat

        int[] arr = {4, -2, 7, 1, 9};
        int[] arr2 = {9,2, -200, 0,6, 78, 13,24};
        int[] empty = {};
        int[] nullArr = null;

        System.out.println("Min element: " + ArrayStat.findMin(arr));
        System.out.println("Max element: " + ArrayStat.findMax(arr));
        System.out.println("Average value: " + ArrayStat.calculateAvg(arr));

        System.out.println("\nMin element: " + ArrayStat.findMin(arr2));
        System.out.println("Max element: " + ArrayStat.findMax(arr2));
        System.out.println("Average value: " + ArrayStat.calculateAvg(arr2));

        System.out.println("---Non-valid arrays test---");

        ArrayStat.findMin(empty);    // exception
        ArrayStat.findMax(nullArr);
    }
}