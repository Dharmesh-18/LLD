package D4_Pizza_Shop;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String orderId;
    private Pizza pizza;
    private String status;
    private List<OrderObserver> observers = new ArrayList<>();
    private String customerName;

    public Order(String orderId, Pizza pizza, String customerName) {
        this.orderId = orderId;
        this.pizza = pizza;
        this.customerName = customerName;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(OrderObserver observer: observers) {
            observer.update(this);
        }
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getStatus() {
        return this.status;
    }

    public String getCustomerName() {
        return this.customerName;
    }

}
