package ua.university.task1;

public class CardPayment implements PaymentMethod{
    @Override
    public String name() {
        return "Card Payment";
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using credit card");
    }
}
