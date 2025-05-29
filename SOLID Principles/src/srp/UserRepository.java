package srp;

public class UserRepository {
    public void save(User user) {
        System.out.println("User " + user.getName() + " saved to database.");
    }
}
