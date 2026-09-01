package D3_Order_Notification_Observer;

public class App {

    public static void main(String[] args) {

        Order order = new Order("123", "PLACED");

        OrderObserver emailObserver = new EmailObserver();
        OrderObserver smsObserver = new SmsObserver();

        order.addObserver(emailObserver);
        order.addObserver(smsObserver);

        order.setStatus("SHIPPED");

        order.removeObserver(emailObserver);

        order.setStatus("DELIVERED");
    }
}
