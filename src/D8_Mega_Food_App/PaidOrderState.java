package D8_Mega_Food_App;

public class PaidOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Already PAID!");
    }

    @Override
    public void prepare(Order order) {
        System.out.println("Preparing food..");
        order.setState(new PreparingOrderState());
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver. Food is being PREPARED!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled successfully.");
        order.setState(new CancelledOrderState());
    }

    @Override
    public String getStateName() {
        return "PAID";
    }
}
