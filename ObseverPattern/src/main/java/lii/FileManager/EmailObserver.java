package lii.FileManager;

public class EmailObserver implements Observer {
    private String email;
    private String message;

    public EmailObserver(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String filename) {
        System.out.println("Email sent to " + email + ": " + message.replace("%s", filename));
    }
}
