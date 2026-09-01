package D3_Order_Notification_Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements OrderSubject{

    private String orderId;
    private String status;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String orderId, String status) {
        this.orderId = orderId;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(OrderObserver observer: observers) {
            observer.update(orderId, status);
        }
    }
}
