public class UpiPaymentStrategy implements PaymentStrategy {
    @Override
    public String pay(Payment payment) {
        return "Paid via UPI: " + payment.amount;
    }
}
