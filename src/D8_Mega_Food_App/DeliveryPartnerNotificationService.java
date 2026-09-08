package D8_Mega_Food_App;

public class DeliveryPartnerNotificationService implements OrderObserver{

    @Override
    public void update(Order order) {
        System.out.println("[DELIVERY DISPATCH] Order: " + order.getOrderId() + " is now in: " + order.getOrderState().getStateName());
    }
}
