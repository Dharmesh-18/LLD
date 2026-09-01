package D2_Shopping_Cart_Payment_Strategy;

public class ShoppingCart {

    private double amount;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(double amount) {
        this.amount = amount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay() {
        this.paymentStrategy.pay(amount);
    }
}
