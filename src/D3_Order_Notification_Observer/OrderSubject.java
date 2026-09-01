package D3_Order_Notification_Observer;

public interface OrderSubject {
    public void addObserver(OrderObserver observer);
    public void removeObserver(OrderObserver observer);
    public void notifyObservers();
}
