package D3_Order_Notification_Observer;

public class SmsObserver implements OrderObserver{

    @Override
    public void update(String orderId, String status) {
        System.out.println("[SMS]: Order with id:" + orderId + " has been:" + status);
    }
}
