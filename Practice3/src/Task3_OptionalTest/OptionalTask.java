package Task3_OptionalTest;

public class OptionalTask {

    public static void run() {
        UserRepository repo = new UserRepository();

        // orElseGet
        User user1 = repo.findByEmail("unknown@mail.com").orElseGet(() -> new User("default@mail.com"));

        System.out.println("User1: " + user1.email);

        // orElseThrow
        User user2 = repo.findByEmail("test@mail.com")
                .orElseThrow(() -> new RuntimeException("User not found"));

        System.out.println("User2: " + user2.email);
    }
}
