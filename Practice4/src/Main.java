import Task2.A;
import Task2.B;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("--Завдання 1--");

        Animal[] animals = { new Dog(), new Cat(), new Dog()};

        for (Animal a : animals) {
            a.speak();
        }

        System.out.println("\n--Завдання 2--");

        A a = new B();
        a.process("hi");

        System.out.println("\n--Завдання 3--");
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

       if (animal1 instanceof Dog) {
            Dog d = (Dog) animal1;
            d.fetchStick();
        }
         //Dog d2 = (Dog) animal2; // ClassCastException під час виконання
    }
}