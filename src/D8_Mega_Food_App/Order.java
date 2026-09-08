package D8_Mega_Food_App;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String orderId;
    private final FoodItem foodItem;
    private OrderState orderState;
    private PaymentStrategy paymentStrategy;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String orderId, FoodItem foodItem) {
        this.orderId = orderId;
        this.foodItem = foodItem;
        this.orderState = new CreatedOrderState();
    }

    public void addObserver(OrderObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for(OrderObserver observer: observers) {
            observer.update(this);
        }
    }

    public void setState(OrderState newState) {
        this.orderState = newState;
        notifyObservers();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay() {
        if(paymentStrategy == null) {
            System.out.println("Kindly select a payment method first!");
            return;
        }
        paymentStrategy.pay(foodItem.getCost());
        orderState.pay(this);
    }

    public void prepare() {
        orderState.prepare(this);
    }

    public void deliver() {
        orderState.deliver(this);
    }

    public void cancel() {
        orderState.cancel(this);
    }

    public String getOrderId() {
        return orderId;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public OrderState getOrderState() {
        return orderState;
    }
}
