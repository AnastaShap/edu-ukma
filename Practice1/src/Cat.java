public class Cat extends Animal {
    protected String breed;

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating fish");
    }
}
