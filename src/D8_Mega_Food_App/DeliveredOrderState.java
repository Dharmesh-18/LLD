package D8_Mega_Food_App;

public class DeliveredOrderState implements OrderState{

    @Override
    public void pay(Order order) {
        System.out.println("Order is already delivered, no need to pay again!");
    }

    @Override
    public void prepare(Order order) {
        System.out.println("Order is already delivered!");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order is already delivered!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel. Order is already delivered!");
    }

    @Override
    public String getStateName() {
        return "DELIVERED";
    }

}
