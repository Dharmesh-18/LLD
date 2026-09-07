package D7_Order_State_Manager;

public class NewOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Payment successful. Moving the order to PAID state.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship and UNPAID order!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled. Moving the order to CANCELLED state.");
        order.setState(new CancelledOrderState());
    }


}
