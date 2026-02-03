public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog: Woof!");
    }

    void fetchStick() {
        System.out.println("Dog fetches a stick");
    }
}
