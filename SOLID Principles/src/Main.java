import srp.User;
import srp.UserRepository;

public class Main {
    public static void main(String[] args) {

        // SRP Test
        User user = new User("John Doe", "johndoe@example.com");
        UserRepository userRepo = new UserRepository();
        userRepo.save(user);
    }
}