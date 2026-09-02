package D4_Pizza_Shop;

public class CustomerNotifier implements OrderObserver {

    @Override
    public void update(Order order) {
        System.out.println("[Customer Notification] Hey "+ order.getCustomerName()+", your order with id:" + order.getOrderId() + " is: " + order.getStatus());
    }
}
