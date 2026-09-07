package D5_Notification_Factory;

public class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("[PUSH] : "+ message);
    }
}
