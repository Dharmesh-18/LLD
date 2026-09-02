package D4_Pizza_Shop;

public class App {

    public static void main(String[] args) {

        Pizza p1 = new MargheritaPizza();
        System.out.println(p1.getDescription() + " Cost: ₹" +p1.getCost());
        p1 = new Cheese(p1);
        System.out.println(p1.getDescription() + " Cost: ₹" +p1.getCost());

        Pizza p2 = new PepperoniPizza();
        System.out.println(p2.getDescription() + " Cost: ₹" + p2.getCost());
        p2 = new Mushroom(p2);
        System.out.println(p2.getDescription() + " Cost: ₹" + p2.getCost());

        OrderObserver kitchen = new KitchenNotifier();
        OrderObserver customer = new CustomerNotifier();

        PaymentStrategy upi = new UpiPaymentStrategy("abc@upi");
        upi.pay(p1.getCost());
        Order o1 = new Order("123", p1, "Anjali");
        o1.addObserver(kitchen);
        o1.addObserver(customer);
        o1.setStatus("PLACED");


        PaymentStrategy card = new CreditCardStrategy("1234 1234 1234 134");
        card.pay(p2.getCost());
        Order o2 = new Order("124", p2, "Dharmesh");
        o2.addObserver(kitchen);
        o2.addObserver(customer);
        o2.setStatus("PLACED");

        o1.setStatus("COOKING");
        o2.setStatus("COOKING");

        o1.setStatus("SERVED");
        o2.setStatus("SERVED");




    }
}
