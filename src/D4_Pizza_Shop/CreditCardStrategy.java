package D4_Pizza_Shop;

public class CreditCardStrategy implements PaymentStrategy {

    private String cardNumber;

    public CreditCardStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("[Card Payment] Paid: ₹" + amount + " via card number:" + cardNumber);
    }
}
