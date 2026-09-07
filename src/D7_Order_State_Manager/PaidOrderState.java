package D7_Order_State_Manager;

public class PaidOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Already paid!");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order shipped. Moving to Shipped State..");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled. Refund initiated!");
        order.setState(new CancelledOrderState());
    }
}
