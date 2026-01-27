public class MemoryTask {

    static class Person {
        String name;
    }
    public static void run() {
        int x = 20;
        Person p1 = new Person();
        p1.name = "Bob";

        Person p2 = p1; //ref to the same object

        int[] arr = new int[3];
        arr[0] = 43;

        System.out.println("x = " + x + " (примітив, значення напряму)");
        System.out.println("p1.name = " + p1.name);
        System.out.println("p2.name = " + p2.name);
        System.out.println("посилання на обект p1:" + p1);

        p2.name = "Vasya";

        System.out.println("Після зміни через p2:");
        System.out.println("p1.name = " + p1.name);
        System.out.println("p2.name = " + p2.name);


        System.out.println("arr[0] = " + arr[0] + ", масив у heap");

    }

}
