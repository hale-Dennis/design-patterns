package lii.FileManager;

public class Application {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        LoggingObserver logger = new LoggingObserver(
                "log.txt", "Someone has opened the file: %s"
        );
        publisher.events.subscribe("open", logger);

        EmailObserver emailAlerts = new EmailObserver(
                "admin@amalitech.com", "Someone has changed the file: %s"
        );
        publisher.events.subscribe("save", emailAlerts);

        publisher.openFile("GameStack.txt");
        publisher.saveFile();
    }
}

