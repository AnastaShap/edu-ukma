package Task3_OptionalTest;

import java.util.Optional;

public class UserRepository {
    Optional<User> findByEmail(String email){
        if ("test@mail.com".equals(email)) {
            return Optional.of(new User(email));
        }
        return Optional.empty();
    }
}
