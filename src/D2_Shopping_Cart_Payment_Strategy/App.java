package D2_Shopping_Cart_Payment_Strategy;

public class App {

    static void main() {

        ShoppingCart shoppingCart1 = new ShoppingCart(1000);
        ShoppingCart shoppingCart2 = new ShoppingCart(5000);

        PaymentStrategy upi = new UpiPaymentStrategy("dharmesh@upi");
        PaymentStrategy creditCard = new CreditCardPaymentStrategy("1234 1234 1234 1234");

        shoppingCart1.setPaymentStrategy(upi);
        shoppingCart2.setPaymentStrategy(creditCard);

        shoppingCart1.pay();
        shoppingCart2.pay();
    }
}
