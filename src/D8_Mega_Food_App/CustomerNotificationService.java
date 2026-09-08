package D8_Mega_Food_App;

public class CustomerNotificationService implements OrderObserver {

    private final String customerName;

    public CustomerNotificationService(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(Order order) {
        System.out.println("[CUSTOMER APP NOTIFICATION -" + customerName + "] Order: " + order.getOrderId() +
                " is now in " + order.getOrderState().getStateName());
    }
}
