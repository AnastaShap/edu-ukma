public class Dog extends Animal{

    protected String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating meat");
    }

    @Override
    public String toString() {
        return "Dog -> " + super.toString() + ", breed = " + breed;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) return true;
        else return false;
    }

}
