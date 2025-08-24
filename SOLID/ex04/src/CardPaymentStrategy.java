public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public String pay(Payment payment) {
        return "Charged card: " + payment.amount;
    }
}
