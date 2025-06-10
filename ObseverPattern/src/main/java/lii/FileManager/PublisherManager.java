package lii.FileManager;

import java.util.*;

public class PublisherManager {
    private Map<String, List<Observer>> listeners = new HashMap<>();

    public void subscribe(String eventType, Observer listener) {
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }

    public void unsubscribe(String eventType, Observer listener) {
        List<Observer> users = listeners.get(eventType);
        if (users != null) users.remove(listener);
    }

    public void notify(String eventType, String filename) {
        List<Observer> users = listeners.get(eventType);
        if (users != null) {
            for (Observer listener : users) {
                listener.update(filename);
            }
        }
    }
}

