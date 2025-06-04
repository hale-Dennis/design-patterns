package dennis.manager;

public class ManagerProxy implements Person {
    private Celebrity celebrity;

    public ManagerProxy(Celebrity celebrity) {
        this.celebrity = celebrity;
    }

    @Override
    public void contact(String sender, String message, String type) {
        System.out.println("[Manager Log] Incoming message from " + sender + " of type: " + type);

        switch (type.toLowerCase()) {
            case "business":
                System.out.println("Manager: Forwarding business message to the celebrity.");
                celebrity.contact(sender, message, type);
                break;

            case "fan":
                System.out.println("Manager: Thank you note sent to " + sender + ". Message not forwarded.");
                break;

            case "spam":
                System.out.println("Manager: Discarded spam message.");
                break;

            case "vip":
                System.out.println("Manager: Scheduling a private meeting for VIP.");
                celebrity.contact(sender, "[VIP Meeting Scheduled] " + message, type);
                break;

            default:
                System.out.println("Manager: Unknown message type. Ignored.");
        }
    }
}
