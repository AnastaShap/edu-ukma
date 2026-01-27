package Task2_InitTest;

public class ChildInit extends BaseInit {

    static { System.out.println("Child static block"); }

    { System.out.println("Child instance block"); }

    ChildInit() {
        System.out.println("Child constructor");
    }
}
