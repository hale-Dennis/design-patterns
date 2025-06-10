package lii.FileManager;

import java.io.FileWriter;
import java.io.IOException;

public class LoggingObserver implements Observer {
    private String logFilePath;
    private String message;

    public LoggingObserver(String logFilePath, String message) {
        this.logFilePath = logFilePath;
        this.message = message;
    }

    @Override
    public void update(String filename) {
        try (FileWriter writer = new FileWriter(logFilePath, true)) {
            writer.write(message.replace("%s", filename) + "\n");
            System.out.println(message + ": " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
