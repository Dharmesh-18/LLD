package D2_Shopping_Cart_Payment_Strategy;

public class UpiPaymentStrategy implements PaymentStrategy{
    private String upiId;

    public UpiPaymentStrategy(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("[UPI Payment]: UPI ID: ["+upiId+"] Paid amount: " + amount);
    }
}
