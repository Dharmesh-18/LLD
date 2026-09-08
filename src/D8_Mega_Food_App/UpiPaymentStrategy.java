package D8_Mega_Food_App;

public class UpiPaymentStrategy implements PaymentStrategy {

    private final String upiId;

    public UpiPaymentStrategy(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("[UPI Payment] : ₹" + amount + " paid using UPI id: " + upiId);
    }
}
