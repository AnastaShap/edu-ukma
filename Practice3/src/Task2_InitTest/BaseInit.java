package Task2_InitTest;

public class BaseInit {

    static { System.out.println("Base static block"); }

    { System.out.println("Base instance block"); }

    BaseInit() {
        System.out.println("BaseInit constructor");
    }
}
