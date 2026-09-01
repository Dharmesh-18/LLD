package D2_Shopping_Cart_Payment_Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{

    private String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Using credit card gives discount of 10% :)");
        System.out.println("[Credit Card Payment]: Card Number: ["+ cardNumber+"] Paid amount: " + amount * 0.9);
    }
}
