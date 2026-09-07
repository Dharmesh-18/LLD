package D7_Order_State_Manager;

public class CancelledOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Cannot pay for a CANCELLED order!");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship a CANCELLED order!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel a CANCELLED order!");
    }
}
