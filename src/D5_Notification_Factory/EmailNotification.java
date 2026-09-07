package D5_Notification_Factory;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("[EMAIL] : " + message);
    }
}
