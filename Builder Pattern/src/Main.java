public class Main {
    public static void main(String[] args) {
        User user = new User.Builder("backend@example.com", "backend")
                .setAge(20)
                .setPhone("123456789")
                .setAddress("Ghana")
                .build();
    }
}