package D2_Shopping_Cart_Payment_Strategy;

public class WalletPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("[Wallet Payment] : Paid amount : " + amount);
    }
}
