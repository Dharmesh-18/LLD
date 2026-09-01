package D3_Order_Notification_Observer;

public class EmailObserver implements OrderObserver{

    @Override
    public void update(String orderId, String status) {
        System.out.println("[Email]: Order with id:" + orderId + " has been:" + status);
    }
}
