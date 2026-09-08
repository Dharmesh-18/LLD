package D8_Mega_Food_App;

public class CreatedOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Payment successful.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void prepare(Order order) {
        System.out.println("Cannot prepare food. Order is NOT PAID yet!");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver food. Order is NOT PAID yet!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled successfully.");
        order.setState(new CancelledOrderState());
    }

    @Override
    public String getStateName() {
        return "CREATED";
    }
}
