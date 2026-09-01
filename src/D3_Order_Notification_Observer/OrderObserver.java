package D3_Order_Notification_Observer;

public interface OrderObserver {
    public void update(String orderId, String status);
}
