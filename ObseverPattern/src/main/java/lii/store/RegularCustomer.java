package lii.store;

public class RegularCustomer implements Customer {
    private String name;

    public RegularCustomer(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("[" + name + "] Notification (" + eventType + "): " + message);
    }
}
