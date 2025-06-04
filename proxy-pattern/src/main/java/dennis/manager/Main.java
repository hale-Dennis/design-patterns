package dennis.manager;

public class Main {
    public static void main(String[] args) {
        Person manager = new ManagerProxy(new Celebrity());

        manager.contact("John", "You're amazing!", "fan");
        manager.contact("Alice Corp", "We have a proposal.", "business");
        manager.contact("Spammer", "Buy followers now!", "spam");
        manager.contact("Royal Guest", "I’d like a meeting", "vip");
        manager.contact("Unknown", "Just testing", "random");
    }
}

