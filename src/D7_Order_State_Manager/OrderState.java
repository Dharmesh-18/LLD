package D7_Order_State_Manager;

public interface OrderState {

    public void pay(Order order);
    public void ship(Order order);
    public void cancel(Order order);
}
