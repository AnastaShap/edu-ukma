//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Завдання 1
        System.out.println("-- Завдання 1 --");
        Dog dog = new Dog("Rex",  "German Shepherd");
        System.out.println(dog);
        Cat cat = new Cat("Busia", "British");
        System.out.println(cat);

        // Завдання 2: == vs equals
        System.out.println("-- Завдання 2 --");
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        for(int i = -128; i<= 127; i++){
            Integer i1 = i;
            Integer i2 = i;
            System.out.println("Value: " + i);
            System.out.println("==      : " + (i1 == i2));
            System.out.println("equals(): " + i1.equals(i2));
            System.out.println("---------------------");

            /*if(i1==i2){
                System.out.println("Cached: " + i);
                System.out.println(i1==i2);
            }*/
        }

        System.out.println("---------------");

        Dog dog1 = new Dog("Max",  "Bulldog");
        Dog dog2 = new Dog("Max",  "Golden retriever");
        System.out.println(dog1==dog2);
        System.out.println("Is dog1 equals dog2? " + dog1.equals(dog2));

        // Завдання 3
        System.out.println(" -- Завдання 3 -- ");
        Animal a = new Dog("Spike", "Pitbull"); //upcast
        feed(a);
    }

    public static void feed(Animal animal) {
        animal.eat();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; //downcast
            dog.bark();
        }
    }
}