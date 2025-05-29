import srp.User;
import ocp.Notification;
import srp.UserRepository;
import ocp.SMSNotification;
import ocp.EmailNotification;


public class Main {
    public static void main(String[] args) {

        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        email.send("Hello via Email!");
        sms.send("Hello via SMS!");
    }
}