package D4_Pizza_Shop;

public class KitchenNotifier implements OrderObserver{

    @Override
    public void update(Order order) {
        System.out.println("[Kitchen Notification] Order with id:" + order.getOrderId() + " is: " + order.getStatus());
    }
}
