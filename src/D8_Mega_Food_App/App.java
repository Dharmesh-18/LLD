package D8_Mega_Food_App;

public class App {

    public static void main(String[] args) {

        FoodItem burger = FoodFactory.createFoodItem("BURGER");

        burger = new Cheese(burger);
        burger = new SpecialSauce(burger);

        System.out.println("Food: " + burger.getDescription());
        System.out.println("Cost:" + burger.getCost());

        System.out.println("====== ORDER INITIALISATION ======");
        Order order = new Order("ORD-123", burger);

        order.addObserver(new CustomerNotificationService("Dharmesh"));
        order.addObserver(new KitchenNotificationService());
        order.addObserver(new DeliveryPartnerNotificationService());

        System.out.println("===== INVALID TRANSITION CHECK ======");
        order.prepare();

        System.out.println("====== PAYMENT ======");
        order.setPaymentStrategy(new UpiPaymentStrategy("dharmesh@upi"));
        order.pay();

        System.out.println("====== PREPARATION ======");
        order.prepare();

        System.out.println("====== INVALID CANCEL CHECK ======");
        order.cancel();

        System.out.println("====== DELIVERY ======");
        order.deliver();

    }
}
