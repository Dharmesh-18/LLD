package D7_Order_State_Manager;

public class App {

    public static void main(String[] args) {

        Order order = new Order();

        order.ship();

        order.pay();
        order.ship();
        order.cancel();

        order.pay();
    }
}
