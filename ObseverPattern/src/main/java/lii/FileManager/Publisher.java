package lii.FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Publisher {
    public PublisherManager events;
    private File file;

    public Publisher() {
        this.events = new PublisherManager();
    }

    public void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.getName());
    }

    public void saveFile() {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("Dummy content\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        events.notify("save", file.getName());
    }
}
