package D8_Mega_Food_App;

public class CancelledOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Order is already cancelled, no need to pay again!");
    }

    @Override
    public void prepare(Order order) {
        System.out.println("Order is already cancelled!");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order is already cancelled!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel. Order is already cancelled!");
    }

    @Override
    public String getStateName() {
        return "CANCELLED";
    }

}
