package D7_Order_State_Manager;

public class ShippedOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Already paid and shipped!");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order already in transit!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel a shipped order!");
    }
}
