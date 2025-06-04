package dennis.manager;

public class Celebrity implements Person {

    @Override
    public void contact(String sender, String message, String type) {
        System.out.println("Celebrity received a message from " + sender + ": " + message);
    }
}
