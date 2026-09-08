package D8_Mega_Food_App;

public class KitchenNotificationService implements OrderObserver {

    @Override
    public void update(Order order) {
        System.out.println("[KITCHEN DASHBOARD ] Order: " + order.getOrderId() + " [" + order.getFoodItem().getDescription()
        + "] is now in " + order.getOrderState().getStateName());
    }
}
