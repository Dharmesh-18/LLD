package D5_Notification_Factory;

public class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("[SMS]: " + message);
    }
}
