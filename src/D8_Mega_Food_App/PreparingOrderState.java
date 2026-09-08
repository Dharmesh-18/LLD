package D8_Mega_Food_App;

public class PreparingOrderState implements OrderState{

    @Override
    public void pay(Order order) {
        System.out.println("Order is already PAID!");
    }

    @Override
    public void prepare(Order order) {
        System.out.println("Food is already being PREPARED!");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Delivering food..");
        order.setState(new DeliveredOrderState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel. Food is being PREPARED!");
    }

    @Override
    public String getStateName() {
        return "PREPARING";
    }
}
