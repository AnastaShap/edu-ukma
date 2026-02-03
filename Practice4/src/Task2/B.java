package Task2;

public class B extends A {
    @Override
    public void process(Object o) { // runtime
        System.out.println("B.process(Object)");
    }

    void process(String s) { // overloading compile-time
        System.out.println("B.process(String)");
    }
}
