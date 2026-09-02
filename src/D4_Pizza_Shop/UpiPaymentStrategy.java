package D4_Pizza_Shop;

public class UpiPaymentStrategy implements PaymentStrategy{

    private String upiId;

    public UpiPaymentStrategy(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("[UPI Payment] Paid: ₹" + amount + " via upi id:" + upiId);
    }
}
