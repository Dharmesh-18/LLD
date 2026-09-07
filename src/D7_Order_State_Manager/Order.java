package D7_Order_State_Manager;

public class Order {
    private OrderState currentState;

    public Order() {
        this.currentState = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void pay() {
        currentState.pay(this);
    }

    public void ship() {
        currentState.ship(this);
    }

    public void cancel() {
        currentState.cancel(this);
    }
}
