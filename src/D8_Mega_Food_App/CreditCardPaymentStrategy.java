package D8_Mega_Food_App;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private final String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("[CREDIT CARD Payment] : ₹" + amount + " paid using card number: " + cardNumber);
    }
}
