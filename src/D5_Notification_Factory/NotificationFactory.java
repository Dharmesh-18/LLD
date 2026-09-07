package D5_Notification_Factory;

public class NotificationFactory {

    public static Notification createNotification(NotificationType type) {
        if (type == null) {
            throw new IllegalArgumentException("Notification type cannot be null!");
        }

        switch(type) {
            case EMAIL -> {
                return new EmailNotification();
            }
            case PUSH -> {
                return new PushNotification();
            }
            case SMS -> {
                return new SmsNotification();
            }
            default -> {
                throw new IllegalArgumentException("Unknown notification type: " + type);
            }
        }
    }
}
