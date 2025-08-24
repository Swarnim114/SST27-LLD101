public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public String pay(Payment payment) {
        return "Wallet debit: " + payment.amount;
    }
}
