import java.util.Objects;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }


    @Override
    public boolean equals(Object obj) {
        return Objects.equals(this.name, ((Animal) obj).name);
    }
}
