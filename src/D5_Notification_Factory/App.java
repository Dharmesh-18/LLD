package D5_Notification_Factory;

public class App {

    public static void main(String[] args) {

        Notification emailNotification = NotificationFactory.createNotification(NotificationType.EMAIL);
        emailNotification.send("Hello, this is a test mail.");

        Notification pushNotification = NotificationFactory.createNotification(NotificationType.PUSH);
        pushNotification.send("Hi, this is a test message");

        Notification smsNotification = NotificationFactory.createNotification(NotificationType.SMS);
        smsNotification.send("Hey, this is a test sms.");

    }
}
